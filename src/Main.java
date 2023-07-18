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
        for (Book book : library.bookList){
            System.out.println(book.getName() + " : " + book.getAutor());
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