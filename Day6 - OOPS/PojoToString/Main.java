package PojoToString;

public class Main {
    public  static void main(String[] args){
        for(int i = 1; i<=5 ; i++){ // creating objects using loop and switch
            LPAstudent roll = new LPAstudent("96051810600"+i,
                    switch(i){
                        case 1 -> "Ajay";
                        case 2 -> "Alen";
                        case 3 -> "Rakesh";
                        case 4 -> "Siva";
                        case 5 -> "Venthan";
                        default -> "No Data";
            });
            System.out.println(roll); // this object directly calls the generated toString() method
        }

    }
}
