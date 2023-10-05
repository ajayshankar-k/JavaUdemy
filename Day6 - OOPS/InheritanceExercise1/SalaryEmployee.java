package InheritanceExercise1;

public class SalaryEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;

    public boolean retire(){
        this.isRetired = true;
        return true;
    }
}
