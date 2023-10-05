package PojoToString;

public class Student {
    private String id;
    private String name;

    public Student(String id, String name){
        this.id = id;
        this.name = name;
    }


    @Override //generated toString() method
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


}
