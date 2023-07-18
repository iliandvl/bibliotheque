import java.time.LocalDate;
import java.util.HashMap;

public class Library {

    private final String name;

    private HashMap<String,Book> bookList;

    Library(String name){

        this.name = name;

        bookList= new HashMap<String, Book>();
    }

    private void addBook(Book book){
        bookList.put(book.getIsbn(), book);
        book.setAvailable(true);
    }

    private void removeBook(Book book){
        bookList.remove(book.getIsbn(), book);

    }


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

    public void borrowBook(Book book){
        book.setAvailable(false);
        LocalDate current = LocalDate.now();
        book.setMaxReturnDate(current.plusDays(21));
    }

    public void returnBook(Book book){
        book.setAvailable(true);
        book.setMaxReturnDate(null);
    }


}
