package InheritanceExercise1;

public class Worker {

    private String name;
    private int birthDate;
    private String endDate;

    public Worker(String name,int birthDate,String endDate){
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;

    }


    public int getAge(){
        return  2023-this.birthDate;
    }
    public double collectPay(){
        return 50.00;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }
}
