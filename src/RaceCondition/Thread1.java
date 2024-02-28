package RaceCondition;

public class Thread1 extends Thread{

    private A a;

    public Thread1(A a){
        this.a = a;
    }

    @Override
    public void run(){
        for(int i=0;i<10000000;i++){
            a.updateX();
        }
    }
}
