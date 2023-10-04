package one;
// getter and setter
public class Car {
    private int doors;
    private String name;
    private boolean starts;


    public void setCar(int x,String y,boolean z){ //setter method
        doors = x;
        name = y;
        starts = z;
    }

    public void getCar(){ //getter method
        System.out.println("Door : "+doors+" ,Name : "+name+" ,starts : "+starts);
        if(starts==true){
            System.out.println("Car Starts");
        }else {
            System.out.println("Car dont start");
        }
    }
}
