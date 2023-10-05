package ConstructorChaining;

public class Main {
    public static void main(String[] args){

        Person details = new Person("Ajay",22);
        Person details2 = new Person("Alen",23);
        Person details3 = new Person();


        details.getPerson();
        details2.getPerson();
        details3.getPerson();

    }
}
