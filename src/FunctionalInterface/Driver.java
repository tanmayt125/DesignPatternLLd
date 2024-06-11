package FunctionalInterface;

public class Driver {
    public static void main(String[] args){
        @FunctionalInterface
        interface Print{
            public void print();
        }

        Print print = ()->{
            System.out.println("this is a lambda function and we have used functional interface to use this");
        };

        print.print();
        print.print();
    }
}
