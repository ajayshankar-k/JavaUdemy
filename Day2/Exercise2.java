public class Exercise2 {
    public static void main(String[] args) {
        double num1 = 20.00;
        double num2 = 80.00;
        double both = (num1 + num2) * 100.00;
        double remainder = both % 40.00;

        boolean ter = (remainder == 0.00) ? true : false; // ternary operator

        if (ter) {
            System.out.println("No remainder");
        } else {
            System.out.println("Got some remainder");
        }


    }
}
