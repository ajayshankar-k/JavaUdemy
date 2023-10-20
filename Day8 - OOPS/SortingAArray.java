import java.util.Arrays;
import java.util.Random;
public class SortingAArray {
    public static void main(String[] args) {
        int [] generatedArray = arrayGenerator(5);
        System.out.println(Arrays.toString(sortingArray(generatedArray)));
    }
    public static int[] arrayGenerator(int len){    //generating a random array
        Random rand = new Random();
        int [] numarray = new int[len];
        for(int i = 0 ; i<len ; i++){
            numarray[i] = rand.nextInt(100);
        }
        return numarray;
    }

    public static int[] sortingArray(int[] arr){ //  desc sorting array function "int[]" is used while returning a array and in parameter given
        for(int i = 0; i<arr.length;i++){
            for(int j = 0 ; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
