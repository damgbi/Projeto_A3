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
   - Insira o nome e o e-mail do aluno.
   - O sistema gera uma matrícula automaticamente.
   - As notas iniciais e o histórico de presença ficam zerados.

### 👨‍🎓 Para Alunos:
1. O professor deve **primeiro cadastrar o seu e-mail** no sistema.
2. Depois disso, acesse a tela de **Cadastro de Usuário**.
3. Preencha nome, sobrenome, o **mesmo e-mail** já registrado e uma senha.
4. O sistema:
   - Verifica se o e-mail já está cadastrado.
   - Permite a criação de senha **somente se ainda não tiver sido definida**.
   - Em caso de senha já definida, bloqueia novo cadastro.

---

## 🔑 Como Fazer Login

1. Na tela inicial, insira seu **e-mail** e **senha**.
2. Se for aluno, será levado para a tela com **seus dados pessoais**.
3. Se for professor, acessará funcionalidades de **gestão de notas e presença**.

---

## 🖥️ Uso das Telas

### 🧍 Tela do Aluno
- Visualização **restrita aos próprios dados**.
- Mostra:
  - Nome completo
  - Matrícula
  - Notas (A1, A2, A3)
  - Média final
  - Porcentagem de presença
  - Situação final

### ✅ Tela de Notas/Presença (Visível ao Professor)
- Relatório completo de todos os alunos.
- Atualiza automaticamente após qualquer nova entrada.

### 📝 Tela Registrar Nota (Professor)
- Campo de matrícula → preenche nome automaticamente.
- Cadastra ou edita avaliações.

### 📅 Tela Registrar Presença (Professor)
- Seleção de data e status (Presente, Ausente, Justificado).
- Detecta registros existentes e atualiza se necessário.

---

## ⚙️ Dificuldades Enfrentadas

- **Modelagem e Implementação do Banco**:  
  Criar relações corretas entre tabelas (usuário, aluno, professor, notas, presença, matrícula) exigiu atenção com chaves estrangeiras, inicializações automáticas e consistência nos dados.

- **Migração e Retorno do JavaFX para Swing**:  
  A tentativa de usar **JavaFX** visava melhor aparência e responsividade. No entanto, por risco de comprometer a entrega, retornamos ao **Swing**, que era mais familiar e seguro dentro do prazo.

- **Aparência e Responsividade**:  
  Melhorar a estética das telas no **Swing** (que possui limitações visuais) foi desafiador. Mesmo com esforço, a responsividade é limitada comparada a outras tecnologias modernas.

---

## 🚀 Tecnologias Utilizadas

- **Java 8+**
- **Swing (GUI Java)**
- **MySQL**
- **JDBC**
- **JCalendar / JDateChooser**

---

## 📌 Conclusão

**BoletimUP** é um sistema funcional, simples e objetivo, pensado para facilitar o acompanhamento de desempenho acadêmico. Apesar dos desafios técnicos e mudanças de rota durante o processo, o resultado final cumpre o propósito proposto com clareza e eficiência.
