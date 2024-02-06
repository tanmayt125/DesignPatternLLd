package SingeltonGeneral;

public class TVSet {
    private static TVSet tvSetInstance = null;

    private  TVSet(){
        System.out.println("TV Set instance created");
    }

    public static TVSet getTvSetInstance() {
        if(tvSetInstance == null){
            tvSetInstance = new TVSet();
        }
        return tvSetInstance;
    }
}
