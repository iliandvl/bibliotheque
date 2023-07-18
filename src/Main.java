import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
    public static void emprunt(Library library){
        Book book = cherche_livre(library);
        if (book != null){
            if (book.available){
                library.borrowBook(book);
            } else {
                System.out.println("ce livre n'est pas disponible");
            }
        }
    }

    public static void retour(Library library){
        Book book = cherche_livre(library);
        if (book != null){
            library.returnBook(book)
        }
    }

    public static void afficherListeLivres(Library library){
        for (Book book : library.bookList){
            System.out.println(book.name + " : " + book.author.name);
        }
    }
    public static Book chercheLivre(Library library){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nom de livre");
        String name = scanner.next();
        System.out.println("Entrez un nom d'auteur'");
        String author = scanner.next();
        boolean bookFound = false;
        for (Book book : library.bookList){
            if (book.name == name && book.author.name == author){
                Book wantedBook = book;
                bookFound = true;
            }
        }
        if (!bookFound){
            Book noBook = null;
            return noBook;
        } else {
            return wantedBook;
        }
    }
}