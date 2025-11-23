# 🏦 Sistema Simples de Conta Bancária (Revisão Java Core)

## 🌟 Status do Projeto
✅ Fase 1 (Revisão de Lógica e Estruturas) - CONCLUÍDA
➡️ Fase 2 (Implementação Orientada a Objetos - POO) - EM ANDAMENTO

## 📝 Descrição

Este repositório contém o código desenvolvido durante a revisão da fase inicial de Java, com foco em Lógica de Programação e Estruturas de Controle. O objetivo principal deste projeto é criar um sistema interativo de gerenciamento de conta bancária, preparando o terreno para a refatoração em Programação Orientada a Objetos (POO).

## 💡 Conceitos Fundamentais Aplicados

Nesta primeira fase, os seguintes conceitos foram consolidados:

* **Tipos de Dados:** Uso de `int` para escolha do menu e `String` para mensagens.
* **Tipos de Referência (Finanças):** Utilização do `java.math.BigDecimal` para manipulação precisa do saldo e valores monetários, garantindo a integridade dos cálculos.
* **Estruturas de Controle:**
    * **Loop `while`:** Implementação do menu contínuo de operações.
    * **`switch`:** Tratamento e direcionamento das escolhas do usuário.
    * **`if/else`:** Lógica de negócio para validar transações (ex: checagem de saldo suficiente para saque).
* **Interação com o Usuário:** Uso da classe `java.util.Scanner` para captura de entradas.
* **Formatação de Saída:** Uso do `printf` e `String.format` para exibir o saldo com precisão decimal (`%.2f`).

## 🚀 Próximos Passos (Foco em POO)

A próxima etapa será refatorar este código procedural (atualmente concentrado no método `main`) para um design Orientado a Objetos mais robusto, introduzindo:

1.  **Classe `Conta`:** Para encapsular o saldo e os métodos de depósito/saque.
2.  **Classe `Cliente`:** Para representar o dono da conta (com atributos como nome e CPF).
3.  **Encapsulamento:** Garantir que o saldo só seja alterado por meio de métodos controlados (Saque e Depósito).

## ⚙️ Como Executar o Projeto

1.  **Clone o Repositório:**
    ```bash
    git clone [LINK_DO_SEU_REPOSITORIO]
    ```
2.  **Abra no IntelliJ IDEA:**
    * No IntelliJ, selecione **File** -> **Open** e aponte para a pasta clonada.
3.  **Execute:**
    * Localize a classe principal (`Conta.java` ou similar) e execute o método `main`.

---
