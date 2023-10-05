public class StringManipulation {

    public  static void main(String[] args){
        String hello = "Hello world";

        String one = hello.substring(1,4); // 1 is start index 4 is ending index but its not included so its print upto index 3

        String two = hello.substring(6); // if one index is give it will print all after and including the index

        String interger = "10";
        int num = Integer.parseInt(interger) - 5; // converting string to interger

        String conv = Integer.toString(num); // converting integer to string
        String conv2 = conv + "5";

        System.out.println(one);
        System.out.println(two);
        System.out.println(num);
        System.out.println(conv2);
    }
}
