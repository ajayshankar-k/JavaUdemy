import java.util.*;

// Excercise using exceptional handling and asking input again and again using do while loop
public class GuessNumberGame {
    public static void main(String[] args) {
        boolean act = false;
        int guess = 6;
        int counter = 3;
        do{
            if (counter==0) {
                System.out.println("Game Over you have " + counter + " Life!!");
                act = true;
                break;
            }

            Scanner scan = new Scanner(System.in);
            System.out.println("Guess the number 1-10 :");

            //Exception handling
            try {
                int num = scan.nextInt();
                if (guess == num) {
                    System.out.println("Correct You Win!!");
                    act = true;
                } else {
                    counter--;
                    if (counter != 0) {
                        System.out.println("Incorrect you have " + counter + " Life left");
                    }
                }
            }catch (InputMismatchException nfe){
                System.out.println("Enter numbers only!!!");
                break;
            }
        }while (!act);


    }

}
