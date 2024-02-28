package RaceCondition;

public class RaceDriver {

    public static void main(String[] args){
        A a = new A();

        // here all threads are sharing a single instance of class A
        // so x is a shared resource here
        for(int i=0;i<100000000;i++){
            new Thread1(a).start();
        }
        // here ideally the value of shared variable should be equal to x , but due to race condition
        // the value of will not be always equal to x

    }
}
