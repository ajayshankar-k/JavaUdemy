import java.util.*;

public class MainClass {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name :");
        String customerName = scan.nextLine();

        System.out.println("Enter amount to deposit :");
        int accountBalance = scan.nextInt();
        scan.nextLine(); // Add this line to consume the newline character

        BankAccount bank = new BankAccount(accountBalance, customerName);

        System.out.println("Congrats you have deposited: " + bank.getAccountBalance() + "Rs " + bank.getCustomerName());
        boolean toggle = true;

        while (toggle) {
            System.out.println("To deposit fund type 'deposit', " +
                    "To see your current balance type 'balance', " +
                    "To withdraw amount type 'withdraw'");
            String decision = scan.nextLine();
            if (decision.equalsIgnoreCase("deposit")) {
                System.out.println("Enter the amount to deposit:");
                int amount = scan.nextInt();
                bank.depositFunds(amount);
            } else if (decision.equalsIgnoreCase("balance")) {
                System.out.println("Your current balance is: " + bank.getAccountBalance());
            } else if (decision.equalsIgnoreCase("withdraw")) {
                System.out.println("Enter the amount to withdraw: ");
                int amount = scan.nextInt();
                bank.withdrawFunds(amount);
            } else {
                System.out.println("Something went wrong!");
            }

            System.out.println("Do you want to exit app? type y for yes, n for no");
            String yesOrNo = scan.nextLine();
            if (yesOrNo.equalsIgnoreCase("y")) {
                toggle = false;
            }


        }
        scan.close();
    }
}
