package ConstructorChaining;

public class Person {
    private String name;
    private int age;

    public Person(){ // constructor chaining
        this("No Name",0);
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void getPerson(){
        System.out.println("Welcome "+name+", "+age);
    }
}
