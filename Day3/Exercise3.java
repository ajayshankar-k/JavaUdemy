import java.util.*;

//  while loop exercise
public class Exercise3 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("The even numbers are :");
        while(num<=20){
            if (isEvenNumber(num)){
                System.out.println(num);
            }
            num++;
        }
    }
    public static boolean isEvenNumber(int x){
        if (x%2==0){
            return true;
        }else{
            return false;
        }
    }
}
