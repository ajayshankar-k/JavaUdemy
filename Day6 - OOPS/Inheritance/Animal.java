package Inheritance;

public class Animal {
    private String name;
    private double weight;

    public Animal(String name , double weight){
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
