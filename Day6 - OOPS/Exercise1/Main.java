package Exercise1;

public class Main {
    public static void main(String[] args) {
        Customer cus1 = new Customer("Ajay",15,"ajay@gmail.com");
        Customer cus2 = new Customer();
        Customer cus3 = new Customer("Alen","alen@gmail.com");

        System.out.println(cus1.getName()+", "+cus1.getCreditLimit()+", "+cus1.getEmail());

        System.out.println(cus2.getName()+", "+cus2.getCreditLimit()+", "+cus2.getEmail());

        System.out.println(cus3.getName()+", "+cus3.getCreditLimit()+", "+cus3.getEmail());

    }
}
