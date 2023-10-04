package Exercise1;

public class Main {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();

        account1.setAccountNumber("12345");
        account1.setAccountBalance(0);
        account1.setCustomerName("Ajay shankar");
        account1.setEmail("ajay@gmail.com");
        account1.setPhoneNumber("9823193737");

        account1.depositing(5000);

        System.out.println("Account Holder: Name = "+account1.getCustomerName()+", " +
                "Phone = "+account1.getPhoneNumber()+", Email = "+ account1.getEmail()+
                ", Account no = "+ account1.getAccountNumber()+", Account Balance = "+ account1.getAccountBalance());

        account1.withdrawing(2500);
        System.out.println("Account Holder: Name = "+account1.getCustomerName()+", " +
                "Phone = "+account1.getPhoneNumber()+", Email = "+ account1.getEmail()+
                ", Account no = "+ account1.getAccountNumber()+", Account Balance = "+ account1.getAccountBalance());

        account1.withdrawing(5000);
        System.out.println("Account Holder: Name = "+account1.getCustomerName()+", " +
                "Phone = "+account1.getPhoneNumber()+", Email = "+ account1.getEmail()+
                ", Account no = "+ account1.getAccountNumber()+", Account Balance = "+ account1.getAccountBalance());


    }
}
