package com.isabela.controle_validade;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

@Controller
public class EstoqueController {

    private Estoque estoque = new Estoque();

    @GetMapping("/")
    public String showIndexPage() {
        return "index";
    }

    @GetMapping("/lista")
    public String showListPage(Model model) {
        model.addAttribute("produtos", estoque.getProdutos());
        return "lista";
    }

    @GetMapping("/alerta")
    public String showAlertaPage(Model model) {
        List<Produto> produtosEmAlerta = estoque.getProdutosEmAlerta();
        model.addAttribute("produtos", produtosEmAlerta);
        return "alerta";
    }

    @PostMapping("/adicionar")
    public String adicionarProduto(@RequestParam String nome,
                                   @RequestParam String codigo,
                                   @RequestParam String lote,
                                   @RequestParam String validade,
                                   @RequestParam int quantidade,
                                   @RequestParam String fornecedor) {
        try {
            LocalDate dataValidade = LocalDate.parse(validade, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            Produto novoProduto = new Produto(nome, codigo, dataValidade, lote, quantidade, fornecedor);
            estoque.adicionarProduto(novoProduto);
        } catch (DateTimeParseException e) {
            return "redirect:/?erro=dataInvalida";
        }
        return "redirect:/lista";
    }

    @PostMapping("/remover")
    public String removerProduto(@RequestParam String codigo) {
        estoque.removerProduto(codigo);
        return "redirect:/lista";
    }

    @RequestMapping(value = "/gerar-csv", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<FileSystemResource> gerarPlanilhaCsv() {
        try {
            String fileName = "estoque-validade.csv";
            estoque.gerarCSV(fileName);
            File file = new File(fileName);

            HttpHeaders headers = new HttpHeaders();
            headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + fileName);
            headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
            headers.add("Pragma", "no-cache");
            headers.add("Expires", "0");

            return ResponseEntity.ok()
                    .headers(headers)
                    .contentLength(file.length())
                    .body(new FileSystemResource(file));

        } catch (IOException e) {
            return ResponseEntity.badRequest().build();
        }
    }
}