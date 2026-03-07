# 🥒 Framework d’Automatisation Cucumber 7 + Selenium + JUnit 5

Ce projet est un framework d’automatisation BDD démontrant comment configurer et exécuter des tests automatisés Web en utilisant :

Cucumber 7

Selenium WebDriver

JUnit 5 (JUnit Jupiter)

Maven

Il propose une architecture propre, évolutive et maintenable, adaptée aussi bien à l’apprentissage qu’à des projets d’automatisation en environnement professionnel.

# 🎯 Objectif du projet

L’objectif de ce framework est de mettre en place une architecture claire et maintenable permettant de :

- Écrire des scénarios de tests en BDD avec la syntaxe Gherkin

- Exécuter les tests avec JUnit 5

- Automatiser les interactions navigateur via Selenium WebDriver

- Gérer les dépendances et le cycle de build avec Maven

- Générer des rapports d’exécution détaillés

Le framework respecte les principes de séparation des responsabilités (Separation of Concerns) afin d’assurer scalabilité et maintenabilité.

# 🛠️ Stack Technique

Technologie	Version : 
```
Java 21
Cucumber 7.14.0
Selenium WebDriver 4.15.0
JUnit Jupiter 5.10.1
Maven 3.9.x
```

# 📁 Structure du projet

```
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── example
│   │               ├── actions
│   │               │   ├── ForgotPasswordActions.java
│   │               │   ├── HomePageActions.java
│   │               │   └── LoginPageActions.java
│   │               │
│   │               ├── locators
│   │               │   ├── ForgotPasswordLocators.java
│   │               │   ├── HomePageLocators.java
│   │               │   └── LoginPageLocators.java
│   │               │
│   │               └── utils
│   │                   ├── ConfigFileReader.java
│   │                   └── HelperClass.java
│   │
│   └── test
│       ├── java
│       │   └── com
│       │       └── example
│       │           ├── definitions
│       │           │   ├── Hooks.java
│       │           │   └── LoginPageDefinitions.java
│       │           │
│       │           └── runner
│       │               └── CucumberRunnerTests.java
│       │
│       └── resources
│           ├── features
│           │   └── login.feature
│           │
│           └── junit-platform.properties
``` 

# 🏗️ Architecture

Le projet est organisé en plusieurs couches :

Couche Locators → Contient uniquement les éléments Web (WebElement).

Couche Actions → Contient les actions métier réutilisables.

Couche Steps → Fait le lien entre les scénarios Gherkin et le code Java.

Couche Runner → Configure et lance l’exécution des tests.

Couche Utils → Gestion du driver, configuration, classes utilitaires.

Cette organisation favorise :

-La réutilisabilité du code

-Une maintenance simplifiée

-Une extension facile du framework

▶️ Exécution des tests

✅ Lancer tous les tests : mvn clean verify

* ****Cette** commande va** :

-Nettoyer les builds précédents

-Compiler le projet

-Exécuter tous les scénarios Cucumber

-Générer les rapports dans le dossier target

# 📊 Rapports d’exécution

Après exécution, les rapports sont disponibles dans :

target/cucumber-reports/

Ils fournissent :

Les scénarios réussis

Les scénarios échoués

Le temps d’exécution

Le détail des étapes exécutées

# 🚀 Évolution du framework

Pour étendre le framework, vous pouvez :

Ajouter de nouveaux fichiers feature dans features/

Créer de nouvelles définitions de steps dans steps/

Ajouter des actions métier dans actions/

Ajouter des utilitaires dans utils/

L’architecture est conçue pour être utilisée dans des projets d’automatisation réels et évolutifs.

# ✅ Bonnes pratiques mises en œuvre

Séparation claire des responsabilités

Implémentation du pattern Page Object

Configuration externalisée

Intégration au cycle Maven

Organisation modulaire du projet