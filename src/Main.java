import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
    public static void emprunt(Library library){
        Book book = chercheLivre(library);
        if (book != null){
        if (book.isAvailable()){
                library.borrowBook(book);
            } else {
                System.out.println("ce livre n'est pas disponible");
            }
        }
    }

    public static void retour(Library library){
        Book book = chercheLivre(library);
        if (book != null){
            library.returnBook(book);
        } else {
            System.out.println("Erreur: livre ne trouve pas le livre");
        }
    }

    public static void afficherListeLivres(Library library){
        for (Map.Entry<String,Book> book : library.getBookList().entrySet()){
            System.out.println(book.getValue().getName() + " : " + book.getValue().getAutor().toString());
        }
    }
    public static Book chercheLivre(Library library){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nom de livre");
        String name = scanner.next();
        System.out.println("Entrez un nom d'auteur (Prenom nom)'");
        String author = scanner.next();

        Book wantedBook = library.searchBook(name, author);
        return wantedBook;

    }
}