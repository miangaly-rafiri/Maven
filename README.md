# Projet Maven 

Ce projet est composé de deux applications Spring Boot :
1. `quotapi` : Une API qui fournit des citations inspirantes aléatoires.
2. `boostup` : Une application principale qui permet aux personnes de discuter et de recevoir des réponses motivantes.

---

## **Prérequis**

- Eclipse IDE.
- Java 17 ou supérieur.
- MySQL pour la base de données avec (MysqlWorkBench).
- Git pour cloner le projet.
- Maven pour la gestion des dépendances.


---

## **Cloner le projet**

1. **Clonez le repository Git** :
   ```bash
   git clone https://github.com/miangaly-rafiri/Maven
    ```
2. **Naviguez dans le répertoire du projet** :
    ```bash
        cd Maven
    ```
## **Configuration de la base de données**

1. **Créer une base de données MySQL** :
   - Nom de la base de données : `databoost`.
   - Vous pouvez utiliser la commande suivante dans MySQL :
     ```sql
     CREATE DATABASE databoost;
     ```
---

## **Lancement des applications**

### **1. Lancer quotapi**

1. **Importer le projet dans Eclipse** :
   - File > Open Projet from File System.
   - Sélectionnez le dossier `quotapi`.
   
2. **Modifier les informations de connexion** :
   - Dans le fichier `application.properties` de **quotapi**, modifiez les propriétés suivantes :
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/databoost
     spring.datasource.username=root
     spring.datasource.password=''
     ```

3. **Lancer l'application** :
   - Cliquez droit sur `QuotapiApplication.java` > Run As > Java Application.
   - L'API sera disponible sur `http://localhost:8081`.

### **2. Lancer application**

1. **Importer le projet dans Eclipse** :
   - File > Open Projet from File System.
   - Sélectionnez le dossier `boostup`.
   
2. **Modifier les informations de connexion** :
   - Dans le fichier `application.properties` de **boostup**, modifiez les propriétés suivantes :
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/databoost
     spring.datasource.username=root
     spring.datasource.password=''
     ```

3. **Lancer l'application** :
   - Clique droit sur `com.boostup` > Run As > Java Application.
   - L'application sera disponible sur `http://localhost:8080`.
   
---

## **Routes disponibles**

### **quotapi**
- **GET `http://localhost:8081/getQuote`** :
  - Retourne une citation inspirante aléatoire.
  - Exemple :
    ```json
    "Il en faut peu, pour être heureux."
    ```

### **boostup**
- **GET `http://localhost:8080/show`** :
  - Affiche la page de conversation.
  - Les personnes peuvent entrer leur nom et leur message.
- **POST `http://localhost:8080/sendMessage`** :
  - Envoie le message de des personnes et retourne une réponse inspirante.
- **GET `http://localhost:8080/all`** :
  - Affiche la liste des personnes et les messages et la date qui ont envoyer le message.

---