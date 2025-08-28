##ValidaFARMA: Sistema de Controle de Estoque para Farmácias

O **ValidaFARMA** é um sistema de gerenciamento de estoque desenvolvido para otimizar o controle de validade de produtos em farmácias e drogarias. Este projeto surgiu da necessidade de automatizar processos manuais, como a checagem de prazos de validade, para prevenir perdas e garantir uma gestão de estoque mais eficiente.


### **Funcionalidades Atuais**

* **Cadastro de Produtos:** Registro de novos itens no estoque, incluindo informações como nome, código, lote, quantidade e data de validade.
* **Gestão de Estoque:** Listagem completa de todos os produtos cadastrados e a funcionalidade de remoção de itens, simulando uma venda ou retirada de estoque.
* **Alertas de Validade:** Emissão de alertas para produtos que estão a seis meses ou menos de sua data de validade.
* **Relatórios e Documentos:**
    * **Geração de CSV:** Exporta todos os dados do estoque para um arquivo `.csv`, permitindo análise em planilhas externas.
    * **Emissão de Etiquetas PDF:** Cria etiquetas personalizadas em formato PDF com as principais informações do produto, prontas para impressão.
* **Interface de Usuário (UI):** Uma interface web intuitiva e responsiva, que se adapta a diferentes tamanhos de tela (desktops, tablets e celulares).

### **Tecnologias Utilizadas**

* **Back-end:** Java
* **Framework:** Spring Boot
* **Front-end:** HTML e CSS
* **Template Engine:** Thymeleaf
* **Geração de PDF:** iText
* **Gerenciamento de Pacotes:** Maven

### **Como Executar o Projeto**

Para rodar o projeto localmente, siga os seguintes passos:

1.  Clone este repositório para sua máquina:
    `git clone https://github.com/SeuUsuario/NomeDoRepositorio.git`
2.  Navegue até o diretório do projeto:
    `cd NomeDoRepositorio`
3.  Execute a aplicação Spring Boot usando o Maven:
    `./mvnw spring-boot:run`
4.  Acesse a aplicação no seu navegador:
    `http://localhost:8080`

### **Próximos Passos**

O projeto continuará a evoluir com a implementação de novas funcionalidades:

* **Persistência de Dados:** Integração com um banco de dados para que os dados do estoque sejam salvos permanentemente e não se percam ao reiniciar a aplicação.
* **Integração com Leitor de Código de Barras:** Permitir que o cadastro e a busca de produtos sejam feitos de forma ainda mais rápida e automatizada, usando um leitor de código de barras.

### **Contato**

Feito com carinho por [Isabela Yared](https://github.com/isabelayared) ❤️
