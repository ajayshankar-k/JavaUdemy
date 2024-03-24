public class PrintFromatting {
    public static void main(String[] args){

        // conversion symbol %d which used to format decimal values
        // there are many other conversion symbols refer java documentation
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Formatter.html

        int age = 22;
        System.out.printf("your age is %d\n",age); // %d is replaced by the variable we give
        //o/p: your age is 35
        //this method does not work in "println" only works on "printf"

        // you can also format multiple variables
        int year = 2001;
        System.out.printf("your age is %d, and you were born in %d",age,year);
        //the variables replace according to the order we give
        //o/p: your age is 22, and you were born in 2001
    }
}
