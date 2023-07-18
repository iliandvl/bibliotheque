import java.time.LocalDate;

public class Book {

    private final String name;

    private final Person[] author;

    String wrintingDate;

    private final String isbn;

    private boolean available;

    private LocalDate maxReturnDate;

    public Book(String name,  String isbn, Person... author){
        this.name=name;
        this.author=new Person[author.length];
        int i = 0;
        for (Person p : author){
            this.author[i]=p;
            i++;
        }
        this.isbn=isbn;
    }


    public String getName() {
        return name;
    }

    public Person[] getAutor() {
        return author;
    }

    public String getWrintingDate() {
        return wrintingDate;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setWrintingDate(String wrintingDate) {
        this.wrintingDate = wrintingDate;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public LocalDate getMaxReturnDate() {
        return maxReturnDate;
    }

    public void setMaxReturnDate(LocalDate maxReturnDate) {
        this.maxReturnDate = maxReturnDate;
    }
}
