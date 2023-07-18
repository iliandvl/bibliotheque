import java.time.LocalDate;

public class Book {

    private final String name;

    private final Author[] author;

    String wrintingDate;

    private final String isbn;

    private boolean available;

    private LocalDate maxReturnDate;

    public Book(String name,  String isbn, Author... author){
        this.name=name;
        this.author=new Author[author.length];
        int i = 0;
        for (Author a : author){
            this.author[i]=a;
            i++;
        }
        this.isbn=isbn;
    }


    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
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

    public String getAuthorList(){
        StringBuilder sb = new StringBuilder();
        for (Author a : this.getAuthor()){

            sb.append(a.getFullName()+", ");
        }
        sb.delete(sb.length()-3, sb.length()-1);
        String s = sb.toString();
        return s;
    }
}
