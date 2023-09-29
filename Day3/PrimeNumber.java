
// prime number using for loop

import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = scan.nextInt();

        System.out.println(num+" "+((isPrime(num))?" is a prime number":"is not a prime number"));
        // used ternary operator for output
    }

    public static boolean isPrime(int x){
        if (x<=2) {
            return true;
        }else{
            for(int i = 2; i<x ; i++){
                if (x%i==0){
                    return false;
                }else{
                    return true;
                }
            }
        }
        return false;
    }
}
