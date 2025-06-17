# 📘 BoletimUP

**BoletimUP** é um sistema de gerenciamento acadêmico voltado para o controle de **notas**, **presenças** e **usuários** (alunos e professores), desenvolvido em Java com interface gráfica baseada no **Swing** e integração com banco de dados **MySQL**.

---

## 🔧 Funcionalidades

- 📋 **Cadastro de Usuário (Aluno ou Professor)**
  - Nome, sobrenome, e-mail e senha.
  - Verificação de e-mail já cadastrado.
  - **Professores cadastram previamente o e-mail dos alunos** (pré-cadastro).
  - Alunos só conseguem criar senha se seu e-mail já estiver registrado no sistema.

- 🔐 **Login**
  - Acesso com e-mail e senha.
  - Redirecionamento automático conforme o tipo de usuário.

- 🎓 **Tela do Aluno**
  - Ao fazer login, o aluno visualiza apenas **suas informações**:
    - Nome completo
    - Matrícula
    - Avaliação 1, 2, 3
    - Média das notas
    - Porcentagem de presença
    - Situação (Aprovado ou Reprovado)

- 🧑‍🏫 **Tela do Professor**
  - Permite **registrar notas** e **presenças** para os alunos.

- 📝 **Registro de Notas**
  - Busca por matrícula.
  - Preenche automaticamente o nome.
  - Permite cadastrar ou atualizar as 3 avaliações.

- 📅 **Registro de Presença**
  - Escolha da data via **JDateChooser**.
  - Marca aluno como Presente, Ausente ou Justificado.
  - Atualiza o status caso já exista presença registrada no mesmo dia.

---

## 👥 Como Funciona o Cadastro

### 👨‍🏫 Para Professores:
1. Acesse o sistema e cadastre-se como **professor**.
2. No painel, utilize a função de **pré-cadastro de alunos**:
   - Insira o nome e o e-mail do
