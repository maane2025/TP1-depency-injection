# Injection des Dépendances en Java

## Introduction

L'injection des dépendances est un principe fondamental de la programmation orientée objet visant à réduire le couplage entre les composants d'une application. Cette technique facilite la maintenance, les tests unitaires et l'évolutivité du code.

Dans ce projet, nous explorons différentes méthodes d'injection des dépendances en Java, en commençant par des approches manuelles avant d'utiliser le framework Spring. De plus, un mini-framework d'injection des dépendances est conçu pour mettre en pratique ces concepts.

## Partie 1 : Injection des Dépendances en Java

### 1. Création de l'interface IDao

Nous définissons une interface IDao qui expose une méthode getData() retournant une donnée.

### 2. Implémentation de IDao

Une classe DaoImpl implémente l'interface IDao en fournissant une réalisation concrète de la méthode getData().

### 3. Création de l'interface IMetier

Une interface IMetier est définie avec une méthode calcul() qui effectue un traitement basé sur les données fournies par IDao.

### 4. Implémentation de IMetier avec couplage faible

L'implémentation MetierImpl repose sur un couplage faible en utilisant l'interface IDao comme dépendance injectée.

### 5. Injection des Dépendances

L'injection des dépendances est réalisée selon plusieurs approches :

#### a. Par instanciation statique

La dépendance est instanciée directement dans le code via l'affectation explicite de l'objet.

#### b. Par instanciation dynamique

L'injection est réalisée en utilisant la réflexion, ce qui permet d'obtenir une plus grande flexibilité et d'éviter le couplage fort.

#### c. En utilisant le Framework Spring

L'injection des dépendances est effectuée à l'aide de Spring, selon deux approches :

Version XML : La configuration des beans est définie dans un fichier XML.

Version annotations : Les annotations @Component, @Autowired, etc., sont utilisées pour déclarer et injecter les dépendances automatiquement.


