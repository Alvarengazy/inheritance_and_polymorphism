# 🐾 Sistema de Sons de Animais — Java

**Herança, sobrescrita de métodos e polimorfismo em uma aplicação de console.**

A mini console application that demonstrates inheritance and polymorphism through a menu that allows users to select an animal and display its corresponding sound.

![Java](https://img.shields.io/badge/Language-Java-orange)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![Documentation](https://img.shields.io/badge/Documentation-Bilingual-blue)

[English](#-english) · [Português](#-português) · [Roadmap](#-roadmap) · [Project Structure](#-project-structure)

---

<details open>
<summary><h2>🇺🇸 English</h2></summary>

## About the project

**Sistema de Sons de Animais** (Animal Sound System) is a Java console application that demonstrates object-oriented programming concepts. It uses inheritance to create specialized animal classes and method overriding to display different sounds through a shared parent-class reference.

## Features

- **Animal selection** — allows the user to choose between a cat and a dog.
- **Inheritance** — `gato` and `cachorro` extend the `animal` class.
- **Method overriding** — each subclass provides its own implementation of `emitirsom()`.
- **Polymorphism** — parent-class references can point to different animal objects and invoke their specific implementations.
- **Interactive menu** — uses a `do-while` loop to keep the application running until the user chooses to exit.
- **Option handling** — uses `switch` to process the selected menu option.

## Concepts practiced

| Concept | Where it appears in the code |
|---|---|
| Classes and objects | `animal`, `gato`, and `cachorro` |
| Inheritance (`extends`) | `gato` and `cachorro` inherit from `animal` |
| Method overriding (`@Override`) | Subclasses redefine `emitirsom()` |
| Polymorphism | `animal gato = new gato();` and `animal cachorro = new cachorro();` |
| Methods (`void`) | `emitirsom()` displays each animal's sound |
| `Scanner` | Reads the user's menu selection |
| `do-while` | Repeats the menu until the user chooses `0` |
| `switch` | Selects the corresponding animal sound |
| `if`-free control flow | Uses `switch` to handle menu options without an `if/else` chain |

## How it works

### 1. Parent class

The `animal` class defines the method that represents an animal's sound. It provides a default implementation that can be overridden by subclasses.

```java
public class animal {
    void emitirsom() {
        System.out.println("Som Animal");
    }
}
```

### 2. Inheritance and method overriding

The `gato` and `cachorro` classes extend `animal` and override `emitirsom()` to display their own sounds.

```java
public class cachorro extends animal {
    @Override
    void emitirsom() {
        System.out.println("Au au");
    }
}
```

The `gato` class follows the same structure but displays `"Miauuuuuuuuuuuuuuuuuuuuu"`.

### 3. Polymorphism

The main class stores both objects using the parent class as their reference type.

```java
animal gato = new gato();
animal cachorro = new cachorro();
```

Although both variables have the reference type `animal`, calling `emitirsom()` executes the implementation belonging to the actual object: `gato` or `cachorro`.

### 4. Interactive menu

The `do-while` loop keeps displaying the menu, while `switch` determines which method to call.

```java
switch (opcao) {
    case 1 -> gato.emitirsom();
    case 2 -> cachorro.emitirsom();
    case 0 -> System.out.println("Saindo...");
    default -> System.out.println("Escolhe certo!!!");
}
```

The program terminates when the user enters `0`.

## How to run

Place the four Java files in the same package:

- `main.java`
- `animal.java`
- `gato.java`
- `cachorro.java`

Compile and run from the terminal:

```bash
javac main.java animal.java gato.java cachorro.java
java main
```

Requires the Java Development Kit (JDK). The project can also be run from a Java IDE.

</details>

---

<details>
<summary><h2>🇧🇷 Português</h2></summary>

## Sobre o projeto

O **Sistema de Sons de Animais** é uma aplicação de console desenvolvida em Java para praticar conceitos de programação orientada a objetos. O projeto utiliza herança para criar classes específicas de animais e sobrescrita de métodos para produzir sons diferentes por meio de referências de uma classe em comum.

## Funcionalidades

- **Seleção de animais** — permite escolher entre gato e cachorro.
- **Herança** — as classes `gato` e `cachorro` herdam da classe `animal`.
- **Sobrescrita de métodos** — cada subclasse implementa sua própria versão de `emitirsom()`.
- **Polimorfismo** — referências da classe principal podem apontar para diferentes objetos e executar suas implementações específicas.
- **Menu interativo** — utiliza `do-while` para manter a aplicação em execução até o usuário escolher sair.
- **Tratamento de opções** — utiliza `switch` para processar a opção selecionada.

## Conceitos praticados

| Conceito | Onde aparece no código |
|---|---|
| Classes e objetos | `animal`, `gato` e `cachorro` |
| Herança (`extends`) | `gato` e `cachorro` herdam de `animal` |
| Sobrescrita de métodos (`@Override`) | As subclasses redefinem `emitirsom()` |
| Polimorfismo | `animal gato = new gato();` e `animal cachorro = new cachorro();` |
| Métodos (`void`) | `emitirsom()` exibe o som de cada animal |
| `Scanner` | Lê a opção escolhida pelo usuário |
| `do-while` | Repete o menu até o usuário escolher `0` |
| `switch` | Seleciona o som correspondente ao animal |
| Fluxo sem `if` | Utiliza `switch` para tratar as opções sem uma sequência de `if/else` |

## Como funciona

### 1. Classe principal dos animais

A classe `animal` define o método que representa o som de um animal. Ela fornece uma implementação padrão que pode ser sobrescrita pelas subclasses.

```java
public class animal {
    void emitirsom() {
        System.out.println("Som Animal");
    }
}
```

### 2. Herança e sobrescrita de métodos

As classes `gato` e `cachorro` estendem `animal` e sobrescrevem `emitirsom()` para exibir seus próprios sons.

```java
public class cachorro extends animal {
    @Override
    void emitirsom() {
        System.out.println("Au au");
    }
}
```

A classe `gato` segue a mesma estrutura, mas exibe `"Miauuuuuuuuuuuuuuuuuuuuu"`.

### 3. Polimorfismo

A classe principal armazena os dois objetos utilizando `animal` como tipo de referência.

```java
animal gato = new gato();
animal cachorro = new cachorro();
```

Mesmo que as duas variáveis tenham o tipo de referência `animal`, a chamada de `emitirsom()` executa a implementação do objeto real: `gato` ou `cachorro`.

### 4. Menu interativo

O laço `do-while` mantém o menu em execução, enquanto o `switch` determina qual método será chamado.

```java
switch (opcao) {
    case 1 -> gato.emitirsom();
    case 2 -> cachorro.emitirsom();
    case 0 -> System.out.println("Saindo...");
    default -> System.out.println("Escolhe certo!!!");
}
```

O programa termina quando o usuário digita `0`.

## Como executar

Coloque os quatro arquivos Java no mesmo pacote:

- `main.java`
- `animal.java`
- `gato.java`
- `cachorro.java`

Compile e execute pelo terminal:

```bash
javac main.java animal.java gato.java cachorro.java
java main
```

É necessário ter o Java Development Kit (JDK) instalado. O projeto também pode ser executado em uma IDE Java.

</details>

---

## 🗺️ Roadmap

- [x] Create the parent `animal` class / Criar a classe principal `animal`
- [x] Create `gato` and `cachorro` subclasses / Criar as subclasses `gato` e `cachorro`
- [x] Apply inheritance using `extends` / Aplicar herança utilizando `extends`
- [x] Override methods using `@Override` / Sobrescrever métodos utilizando `@Override`
- [x] Demonstrate polymorphism through parent-class references / Demonstrar polimorfismo por meio de referências da classe principal
- [x] Create an interactive menu using `switch` / Criar um menu interativo com `switch`
- [x] Repeat the menu using `do-while` / Repetir o menu utilizando `do-while`

---

## 📁 Project Structure

```text
Java-Learning-Library/
├── README.md
└── Projetos/
    └── SistemaSonsAnimais/
        ├── main.java
        ├── animal.java
        ├── gato.java
        └── cachorro.java
```

---

## 🧠 Philosophy

*Understand the structure. Practice the concept. Build with intention.*

*Entenda a estrutura. Pratique o conceito. Construa com propósito.*

<div align="center">

Made with ☕, curiosity, and consistency.

</div>
