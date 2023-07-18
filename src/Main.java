import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library("Test");
        library.addBook(new Book("Test","Test",new Author("Test"),new Author("Test"),new Author("Test")));

        int response = 0;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Choisir une option");
            System.out.println("0. exit");
            System.out.println("1. Emprunter un livre");
            System.out.println("2. Rendre un livre");
            System.out.println("3. Ajouter un livre dans la bibliothèque");
            System.out.println("4. Afficher tous les livres");
            response = 0;
            response = sc.nextInt();
            switch (response){
                case 1:
                    emprunt(library);
                    break;
                case 2:
                    retour(library);
                    break;
                case 3:

                    break;
                case 4:
                   afficherListeLivres(library);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Choisir une option valide");
            }
        }while (response !=0);

    }
    public static void emprunt(Library library){
        Book book = chercheLivre(library);
        if (book != null){
        if (book.isAvailable()){
            System.out.println("Book available");
                library.borrowBook(book);
            } else {
                System.out.println("ce livre n'est pas disponible");
            }
        }
    }

    public static void retour(Library library){
        Book book = chercheLivre(library);
        if (book != null){
            System.out.println("Book receved");
            library.returnBook(book);
        } else {
            System.out.println("Erreur: livre ne trouve pas le livre");
        }
    }

    public static void afficherListeLivres(Library library){
        for (Map.Entry<String,Book> book : library.getBookList().entrySet()){
            System.out.println(book.getValue().getName() + " : " + book.getValue().getAuthorList());
        }
    }
    public static Book chercheLivre(Library library){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nom de livre");
        String name = scanner.next();
        System.out.println("Entrez un nom d'auteur (Prenom nom)'");
        String author = scanner.next();

        Book wantedBook = library.searchBook(name, author);
        if (wantedBook == null){
            System.out.println("livre introuvable");
        }
        return wantedBook;
    }



}