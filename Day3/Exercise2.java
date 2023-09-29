// switch statement exercise

import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any letter :");

        char y = scan.next().charAt(0); // stores one character "0" is the index range
        char z = Character.toLowerCase(y);

        nato(z);

    }
    public static void nato(char x){
        switch(x){
            case 'a':
                System.out.println("NATO word for 'A' is : Able");
                break;
            case 'b':
                System.out.println("NATO word for 'B' is : Baker");
                break;
            case 'c':
                System.out.println("NATO word for 'C' is : Charlie");
                break;
            case 'd':
                System.out.println("NATO word for 'D' is : Dog");
                break;
            case 'e':
                System.out.println("NATO word for 'E' is : Easy");
                break;
            default:
                System.out.println("NATO word of "+x+" not found");

        }
    }
}
