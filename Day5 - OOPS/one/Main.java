package one; // package is nothing but folders and we need to import like this to use a class in the package.
public class Main {
    public static void main(String[] args){
        Car car= new Car();
        Car car2 = new Car();
        car.setCar(4,"Nissan",false);
        car.getCar();
        car2.setCar(2,"Ferrari",true);
        car2.getCar();
    }

}
