# Library Management System

## Contexte Métier
Ce projet implémente un système de gestion de bibliothèque avec les entités suivantes :
- **Author** : Représente un auteur de livres.
- **Book** : Représente un livre écrit par un auteur.
- **Borrower** : Représente un emprunteur.
- **Loan** : Représente un emprunt d'un livre par un emprunteur.

## Relations entre Entités
- Un auteur peut avoir plusieurs livres (OneToMany).
- Un livre appartient à un auteur (ManyToOne).
- Un emprunteur peut emprunter plusieurs livres (OneToMany via Loan).
- Un livre peut être emprunté plusieurs fois (OneToMany via Loan).
- Un emprunt lie un livre et un emprunteur (ManyToOne pour les deux).

## Technologies Utilisées
- Spring Boot 3.1.0
- Spring Data JPA
- H2 Database (pour les tests)
- Lombok
- Validation
- Maven

## Structure du Projet
```
src/
├─ main/java/com/user/library/
│ ├─ model/
│ │ ├─ Author.java
│ │ ├─ Book.java
│ │ ├─ Borrower.java
│ │ └─ Loan.java
│ ├─ repository/
│ │ ├─ AuthorRepository.java
│ │ ├─ BookRepository.java
│ │ ├─ BorrowerRepository.java
│ │ └─ LoanRepository.java
│ ├─ service/
│ │ ├─ AuthorService.java
│ │ ├─ BookService.java
│ │ ├─ BorrowerService.java
│ │ └─ LoanService.java
│ ├─ controller/
│ │ ├─ AuthorController.java
│ │ ├─ BookController.java
│ │ ├─ BorrowerController.java
│ │ └─ LoanController.java
│ └─ LibraryApplication.java
├─ resources/
│ └─ application.properties
└─ test/
```

## Endpoints API REST

### Authors
- `GET /api/authors` : Récupérer tous les auteurs
- `GET /api/authors/{id}` : Récupérer un auteur par ID
- `POST /api/authors` : Créer un nouvel auteur
- `PUT /api/authors/{id}` : Mettre à jour un auteur
- `DELETE /api/authors/{id}` : Supprimer un auteur

### Books
- `GET /api/books` : Récupérer tous les livres
- `GET /api/books/{id}` : Récupérer un livre par ID
- `POST /api/books` : Créer un nouveau livre
- `PUT /api/books/{id}` : Mettre à jour un livre
- `DELETE /api/books/{id}` : Supprimer un livre

### Borrowers
- `GET /api/borrowers` : Récupérer tous les emprunteurs
- `GET /api/borrowers/{id}` : Récupérer un emprunteur par ID
- `POST /api/borrowers` : Créer un nouvel emprunteur
- `PUT /api/borrowers/{id}` : Mettre à jour un emprunteur
- `DELETE /api/borrowers/{id}` : Supprimer un emprunteur

### Loans
- `GET /api/loans` : Récupérer tous les emprunts
- `GET /api/loans/{id}` : Récupérer un emprunt par ID
- `POST /api/loans` : Créer un nouvel emprunt
- `PUT /api/loans/{id}` : Mettre à jour un emprunt
- `DELETE /api/loans/{id}` : Supprimer un emprunt

## Instructions d'Exécution

1. Assurez-vous d'avoir Java 17 et Maven installés.
2. Clonez le repository.
3. Naviguez vers le répertoire du projet : `cd library-management`
4. Exécutez `mvn spring-boot:run` pour démarrer l'application.
5. L'application sera disponible sur `http://localhost:8080`.
6. La console H2 est accessible sur `http://localhost:8080/h2-console` avec les credentials :
   - JDBC URL: `jdbc:h2:mem:testdb`
   - User Name: `sa`
   - Password: `password`

## Tests avec Postman
Importez la collection Postman incluse dans le repository ou créez des requêtes manuellement pour tester les endpoints CRUD sur les entités Author, Book, Borrower et Loan.

## Livrables
- Code complet sur GitHub
- README.md décrivant le projet
- Captures d'écran Postman des tests réussis
- Présentation PowerPoint/Canva du projet
