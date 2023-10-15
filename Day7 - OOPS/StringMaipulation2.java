import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMaipulation2 {
    public static void main(String[] args) {
        String string = "Hello World";
        String string1 = "";


        System.out.println(string.length()); // prints length
        System.out.println(string.charAt(0)); // prints single character
        System.out.println(string1.isEmpty()); // checks string  is empty or not
        System.out.println(string.indexOf('o')); // show the index of the character

        String string2 = string.toLowerCase();

        if(string.equals(string2)){ // ".equals" used to compare strings
            System.out.println("Yes");
        }else {
            System.out.println("no");
        }

        if(string.equalsIgnoreCase(string2)){ // ".equalsIgnoreCase" is used to compare strings by ingnoring case sensitive
            System.out.println("case ignored");
        }

        if(string.startsWith("Hello")){ // checks the string starts with
            System.out.println("yes starts");
        }
        if(string.endsWith("World")){ // checks the string ends with
            System.out.println("yes ends");
        }
        if(string.contains("ello")){ // checks that string contains a word
            System.out.println("yes contains");
        }

    }
}
