package module08._04super;

public class OnlineCustomer extends Customer{
    private String email;

    public OnlineCustomer(String n, String a, String email) {
        super(n, a);
        this.email = email;
    }

    public String toString() {
       return super.toString() + "\nEmail: " + email;
    }

}
