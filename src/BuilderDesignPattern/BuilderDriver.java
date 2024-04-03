package BuilderDesignPattern;

public class BuilderDriver {
    public static void main(String args[]){

//        StudentBuilder studentBuilder = new StudentBuilder();
//        studentBuilder.setRollNumber(1);
//        studentBuilder.setName("Abhishek the King");
//        studentBuilder.setAge(24);

//        This design pattern is generally used when there are too many fields in a class and most of them are optional

        Student student = new StudentBuilder()
                .setRollNumber(1)
                .setName("Abhishek the king")
                .setAge(24)
                .build();

        System.out.println(student.toString());

    }
}
