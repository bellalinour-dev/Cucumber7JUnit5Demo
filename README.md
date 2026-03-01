# 🥒 Integration of Cucumber 7 with Selenium and JUnit 5

This project is a demonstration framework showcasing how to configure and execute BDD automated tests using Cucumber 7, Selenium WebDriver, and JUnit 5.

It provides a clean and scalable structure suitable for both learning purposes and real-world automation projects.

# 🧪 Project Overview

The objective of this framework is to establish a clear and maintainable automation setup that enables:

Writing behavior-driven tests using Cucumber (Gherkin syntax)

Running tests with JUnit Jupiter (JUnit 5)

Automating browser interactions through Selenium WebDriver

Managing dependencies and build lifecycle with Maven

This structure ensures separation of concerns, maintainability, and easy extensibility for future enhancements.

# 🛠️ Tech Stack

The framework is built using the following technologies:

Cucumber – 7.14.0

Java – 21

JUnit Jupiter (JUnit 5) – 5.10.1

```Structure of the projet
project-root
│
├── src
│   ├── main/java
│   │   ├── actions/        # Business actions layer
│   │   ├── locators/       # Page element locators
│   │   └── utils/          # Utility classes
│   │
│   └── test/java
│       ├── steps/          # Step definitions
│       ├── runner/         # Cucumber test runner
│       └── definition/     # Supporting test definitions
│
├── test/resources
│   ├── features/           # Gherkin feature files
│   ├── config/             # Configuration files
│
├── target/
│   └── cucumber-reports/   # Generated reports
│
│
├── pom.xml
└── README.md
This structure promotes modularity and makes the framework easy to scale and maintain.

▶️ Running Tests from the Command Line

To execute the automated test suite using Maven, run:

mvn clean verify

This command will:

Clean the previous build

Compile the project

Execute all Cucumber scenarios

Generate test reports in the target directory
# Integration of Cucumber 7 with Selenium and JUnit 5

This project is a sample application demonstrating how to set up and run **Cucumber tests** using **Selenium** and **JUnit 5**.

---

## 🧪 Project Overview

The goal of this framework is to provide a clean and simple setup for:
- Writing BDD tests with **Cucumber**
- Executing tests with **JUnit Jupiter (JUnit 5)**
- Automating web tests using **Selenium**
- Managing dependencies and build lifecycle with **Maven**

---

## 🛠️ Tech Stack

The framework is built with the following technologies:

- **Cucumber**: `7.14.0`
- **Java**: `17`
- **JUnit Jupiter**: `5.10.1`
- **Maven**: `3.9.5`
- **Selenium**: `4.15.0`

---

## ▶️ Run Tests from Command Line

To execute the tests using Maven, run the following command:

```bash
mvn clean verify 


