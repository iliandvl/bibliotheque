import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library library = new Library("Test");
        library.addBook(new Book("Test","Test",new Author("Test"),new Author("Test"),new Author("Test")));

        int response;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Choisir une option");
            System.out.println("0. exit");
            System.out.println("1. Emprunter un livre");
            System.out.println("2. Rendre un livre");
            System.out.println("3. Ajouter un livre dans la bibliothèque");
            System.out.println("4. Afficher tous les livres");
            System.out.println("5. Supprimer un livre");
//            response = 0;
            response = sc.nextInt();
            switch (response){
                case 1:
                    emprunt(library);
                    break;
                case 2:
                    retour(library);
                    break;
                case 3:
                    addBook();
                    break;
                case 4:
                   afficherListeLivres(library);
                    break;
                case 5:
                    deleteBook(library);
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
   static void addBook(){
       System.out.println("Entrez un nom de livre");
       Scanner sc = new Scanner(System.in);
       String title = sc.nextLine();
       System.out.println("Entrez un nom d'auteur (Prenom nom)'");
       String author = sc.nextLine();
       Library library = new Library(title);
       library.addBook(new Book(title,title,new Author(author)));
       afficherListeLivres(library);
   }

   static void deleteBook(Library library) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Entrez un nom de livre");
       String name = scanner.next();
       System.out.println("Entrez un nom d'auteur (Prenom nom)'");
       String author = scanner.next();
       Book wantedBook = library.searchBook(name, author);
       if (wantedBook == null){
           System.out.println("livre introuvable");
       } else {
           library.removeBook(wantedBook);
           System.out.println("livre suprimé");
       }

   }

}