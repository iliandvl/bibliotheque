import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }
    public static void emprunt(Library library){
        Book book = cherche_livre(library);
        if (book != null){
            if (book.available){

            } else {
                System.out.println("ce livre n'est pas disponible");
            }
        }
    }
    public static Book chercheLivre(Library library){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nom de livre");
        String name = scanner.next();
        System.out.println("Entrez un nom d'auteur'");
        String autor = scanner.next();
        boolean bookFound = false;
        for (Book book : library.bookList){
            if (book.name == name && book.autor.name == autor){
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