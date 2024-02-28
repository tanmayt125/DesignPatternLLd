package RaceCondition;

public class RaceDriver {
    public static void main(String[] args){
        for(int i=0;i<10000;i++){
            new Thread1().run();
        }
        // here ideally the value of shared variable should be 0 , but due to race condition the value of x
        // will not be equal to 0 always
    }
}
