package Exercise1;

public class BankAccount {
    private String accountNumber;
    private int accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositing(int deposit){
        this.accountBalance += deposit;
        System.out.println("Your deposit amount "+deposit+" is successfully added, current balance is : "+this.accountBalance);
    }
    public void withdrawing(int withdraw){
        int sub = this.accountBalance - withdraw;
        if (sub<0){
            System.out.println("Process failed the withdraw amount exceeds the amount available");;
        }else{
            this.accountBalance = sub;
            System.out.println("withdraw for "+withdraw+" is success current balance is : "+this.accountBalance);
        }


    }
}

