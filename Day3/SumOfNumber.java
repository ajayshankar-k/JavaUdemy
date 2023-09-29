import java.util.*;


public class SumOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");

        int num = scan.nextInt();
        System.out.println(sum(num));

    }
    public static int sum(int x){
        int added = 0;
        while(x!=0){
           int sliced = x%10;
           added+=sliced;
           x /= 10;
        }
        return added;

    }
}
