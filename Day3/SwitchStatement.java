import java.util.*;
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");

        int num = scan.nextInt();
        // Traditional switch
        switch(num){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("A random number");
        }
        System.out.println(switching(num));
    }


    // Enhanced Switch with return inside a method
    public static String switching(int x){
        return switch (x){
            case 1-> "one";
            case 2-> "Two";
            default -> "Note one and two";
        };
    }
}

