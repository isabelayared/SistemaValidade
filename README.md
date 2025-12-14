# 💊 PharmaStock - Sistema de Controle de Farmácia

![Status](https://img.shields.io/badge/Status-Concluído-green)
![Tech](https://img.shields.io/badge/Stack-FullStack-blue)

Um sistema completo de gerenciamento de estoque farmacêutico focado na prevenção de perdas por validade. O sistema permite controle de lotes, visualização de status de validade (semáforo) e dashboards com gráficos em tempo real.

## <img width="1846" height="956" alt="image" src="https://github.com/user-attachments/assets/35954f22-afd0-46c9-bb99-f54510f554af" />



## 🚀 Funcionalidades

- **Cadastro Inteligente:** Registro de produtos com controle de lotes e validade.
- **Semáforo de Validade:**
  - 🔴 **Vencido:** Produtos com data expirada.
  - 🟡 **Atenção:** Vencimento em menos de 6 meses.
  - 🟢 **Seguro:** Vencimento superior a 6 meses.
- **Dashboard Visual:** Gráficos de barras para análise de estoque.
- **Indicadores (KPIs):** Resumo rápido de itens críticos e totais.

## 🛠️ Tecnologias Utilizadas

**Backend:**
- [NestJS](https://nestjs.com/) (Framework Node.js)
- [Prisma ORM](https://www.prisma.io/) (Banco de Dados)
- [MySQL](https://www.mysql.com/) (Banco Relacional)

**Frontend:**
- [React](https://react.dev/) + [Vite](https://vitejs.dev/)
- [Tailwind CSS](https://tailwindcss.com/) (Estilização Moderna)
- [Recharts](https://recharts.org/) (Gráficos)

## 📦 Como Rodar o Projeto

### Pré-requisitos
- Node.js instalado
- MySQL rodando (Local ou Docker)

### 1. Configurando o Backend (API)

```bash
# Entre na pasta do backend
cd backend

# Instale as dependências
npm install

# Configure o banco de dados
# Crie um arquivo .env com sua URL do banco: DATABASE_URL="mysql://root:senha@localhost:3306/farmacia"
npx prisma migrate dev --name init

# Rode o servidor
npm run start:dev
