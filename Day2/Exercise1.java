import java.util.*; // importing for scanner input class

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // input instance
        System.out.println("Enter a number :");

        int x = scan.nextInt(); // input stored
        boolean con = x > 5 ? true : false; // ternary operator

        if (con) {
            System.out.println("Given number is greater than 5");
        } else {
            System.out.println("Given number is smaller than 5");
        }

    }
}
