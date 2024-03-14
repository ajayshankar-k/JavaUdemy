
import java.util.Arrays;
import java.util.Random;

public class Arrayss {
    public static void main(String[] args) {
        int[] arr = new int[5]; // creating a array with length
        arr[2] = 50; //adding a value in the first index because index is 'arr[2] => 0,1'
        System.out.println(Arrays.toString(arr));

//-------------------------------------------------------------------------------------------------

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10}; // another method to create a array with data
        System.out.println(Arrays.toString(arr2)); // "Arrays.toString()" to show array in console
        System.out.println(arr2.length); // prints length

//-------------------------------------------------------------------------------------------------

        int[] arr3;
        arr3 = new int[] {1,2,3,4}; // creating a array after declaring array variable

//-------------------------------------------------------------------------------------------------

        for(int i : arr2){      // for each example
            System.out.println(i);
        }

//-------------------------------------------------------------------------------------------------

        Object[] multi = new Object[5]; // creating a multi dimensional array with diff data types
        multi[0] = "hello";
        multi[1] = 1;
        multi[2] = arr3;

        System.out.println(Arrays.toString(multi));

//-------------------------------------------------------------------------------------------------

        Random ran = new Random(); // generating random number
        int num = ran.nextInt(10);
        System.out.println(num);

//-------------------------------------------------------------------------------------------------

        int[] arr4 = new int[5];
        System.out.println(Arrays.toString(arr4)); // prints default value
        Arrays.fill(arr4,5);
        System.out.println(Arrays.toString(arr4)); // filling in the default value

//-------------------------------------------------------------------------------------------------

        int[] arr5 = Arrays.copyOf(arr4,arr4.length); //copying a array
        System.out.println(Arrays.toString(arr5));
    }
}
