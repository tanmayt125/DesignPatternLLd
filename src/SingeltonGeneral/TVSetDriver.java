package SingeltonGeneral;

public class TVSetDriver {

    public static void main(String[] args){
        TVSet tvSet1 = TVSet.getTvSetInstance();
        TVSet tvSet2 = TVSet.getTvSetInstance();
        System.out.println(tvSet1);
        System.out.println(tvSet2);
        // but this implementation is not thread safe
    }
}
