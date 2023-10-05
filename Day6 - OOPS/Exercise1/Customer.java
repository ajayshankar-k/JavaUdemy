package Exercise1;

public class Customer {
    private String name;
    private int creditLimit;
    private String email;

    // Constructors
    public Customer(String name,int CreditLimit,String email){
        this.name = name;
        this.creditLimit = CreditLimit;
        this.email = email;
    }


    public Customer(){ // constructor chaining

        this("No Name",0,"default@gmail.com");
    }
    public Customer(String name,String email){
        this(name,0,email);

    }



    //--------------------------------------------------------------

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
