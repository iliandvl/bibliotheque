public class Author extends Person{

    private String fullName;

    public Author(String lastName, String firstName) {
        super(lastName, firstName);
        fullName=firstName+" "+lastName;
    }

    public Author(String pseudo){
        super("John","Doe");
        fullName=pseudo;
    }

    public String getFullName() {
        return fullName;
    }
}
