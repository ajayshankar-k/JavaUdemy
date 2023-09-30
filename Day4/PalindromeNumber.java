import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // used to get input
        System.out.println("Enter a number");

        int num  = scan.nextInt(); // storing integer input

        int change = num;
        int rev =0;
        while(num!=0){
            int dig  = num % 10;
            rev = (rev*10)+dig;
            num /= 10;
        }

        if(change==rev){
            System.out.println("True "+rev);
        }else{
            System.out.println("False "+rev);
        }
    }
}
