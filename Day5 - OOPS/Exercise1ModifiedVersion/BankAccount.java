public class BankAccount {


    private String accountNumber;
    private int accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //construtor
    public BankAccount(int accountBalance,String customerName){
        this.accountBalance = accountBalance;
        this.customerName = customerName;
    }

    //getters
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public int getAccountBalance(){
        return this.accountBalance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getEmail() {
        return email;
    }

    //setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(int amount){
        setAccountBalance(this.accountBalance+amount);
        System.out.println("Amount deposited successfully, your balance: "+ getAccountBalance());
    }

    public void withdrawFunds(int amount){
        setAccountBalance(this.accountBalance-amount);
        if(getAccountBalance()>0){
            System.out.println("Amount "+amount+" withdrawn successfully, your balance: "+getAccountBalance());
        }else{
            System.out.println("Insufficient balance!");
        }

    }
}
