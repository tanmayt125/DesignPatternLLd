package PrototypeDesignPattern;

public class PrototypeDriver {
    // prototype design pattern is used when we have to create a clone/copy of an existing object
    public static void main(String args[]){
        Student obj1 = new Student("Aman",01);
        Student obj2 = (Student) obj1.clone();
        System.out.println(obj2);
    }
}
