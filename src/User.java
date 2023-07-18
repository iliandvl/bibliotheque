public class User extends Person{


    private int customerId;

    private int countCustomerId=0;



    public User(String lastName, String firstName,int customerId) {
        super(lastName, firstName);
        countCustomerId++;
        this.customerId=customerId;

    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCountCustomerId() {
        return countCustomerId;
    }

    public void setCountCustomerId(int countCustomerId) {
        this.countCustomerId = countCustomerId;
    }
}
