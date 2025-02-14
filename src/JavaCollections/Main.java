package JavaCollections;

public class Main {
    public static void main(String[] args){
        Student s1 = new Student("Aman",26);
        Student s2 = new Student("Abishek",25);
        if(s1.compareTo(s2)>0){
            System.out.println("Age of Aman is more than Abhishek");
        }
        System.out.println(s1);
        System.out.println(s2);
    }
}
