# Copa GC - Sistema de Placar e Classificação de Copa do Mundo

Projeto desenvolvido para a disciplina de Gerência de Configuração com o objetivo de aplicar práticas de versionamento de código utilizando Git e GitHub.

O sistema permite gerenciar seleções, registrar partidas, exibir classificações por grupo e listar artilheiros de uma Copa do Mundo fictícia através de uma aplicação Java executada no console.

---

## .✦ Estrutura do Projeto

```text
copa-gc/
├── src/
│   ├── model/
│   │   ├── Selecao.java
│   │   └── Partida.java
│   ├── service/
│   │   └── Copa.java
│   ├── util/
│   │   └── CargaInicial.java
│   └── Main.java
├── .gitignore
└── README.md
```

## .✦ Estrutura de Pacotes

### ✦ model
Contém as classes de modelo do sistema:

- Selecao: representa uma seleção participante da Copa.
- Partida: representa uma partida entre duas seleções, armazenando os times envolvidos e o placar.

### ✦ service
Contém a lógica de negócio do sistema.

- Copa: gerencia as listas de seleções, partidas e artilheiros, além de disponibilizar métodos como consulta e classificação.

### ✦ util
Contém classes auxiliares para carga inicial de dados.

- CargaInicial: responsável por carregar dados iniciais, como seleções, partidas e artilheiros fictícios para testes e demonstração.

### ✦ Main
Classe principal da aplicação:

- Responsável por iniciar o sistema, exibir o menu interativo e direcionar as operações escolhidas pelo usuário para a classe Copa.

---

## ➜ Como Executar

**Pré-requisitos**
- Java JDK 17+
- Eclipse, IntelliJ ou VS Code

**Execução**
1. Clone este repositório:

```bash
git clone https://github.com/Jamilly-Pedrosa/copa-gc.git
```

2. Abra o projeto em sua IDE e execute: `Main.java`
