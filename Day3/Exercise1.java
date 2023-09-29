// Height conversion using method overload
public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Your height in cm : "+convertToCentimeters(20));
        System.out.println("Your height in cm : "+convertToCentimeters(6,0));
    }
    public static double convertToCentimeters(int inch){
        double cm= inch*2.54;
        return cm;
    }
    public static double convertToCentimeters(int ft,int remainInch){
        int onlyInch = ft*12;
        int totalInch = onlyInch+remainInch;
        return convertToCentimeters(totalInch);
    }
}
