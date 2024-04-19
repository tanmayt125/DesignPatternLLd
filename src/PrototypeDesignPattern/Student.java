package PrototypeDesignPattern;

public class Student implements Prototype{
    private String name;
    private int roll_no;
    public Student(String name,int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }
    @Override
    public Prototype clone() {
        return new Student(name,roll_no);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                '}';
    }
}
