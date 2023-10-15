import java.lang.reflect.Array;
import java.util.Arrays;

public class StringManipulation3 {
    public static void main(String[] args) {
        // slicing

        String string = "19/03/2001";

        System.out.println(string.substring(6));
        // substring has with one parameter it prints from that to the end

        System.out.println(string.substring(3, 5));
        // substring has two one parameter it prints from starting to end index -1

        String[] date = {"15","03","2001"};
        System.out.println(String.join("/",date));
        // joining a array

        String[] date2 = string.split("/");
        System.out.println(Arrays.toString(date2));
        // spliting a array

        System.out.println(string.replace("19","20"));
        // ".replace" used to replace a word or character from a string
        // it takes two parameters first is the old character and second is the new character to replace
        // ".replaceFirst" replaces the first occur word in the string
        // ".replaceAll" replaces all the word that in the string

        System.out.println("ABC\n".repeat(3)); // repeat is used to repeat a string like a loop
        System.out.println("Abc\n".repeat(3).indent(5)); // indent is used to indent the string

    }
}
