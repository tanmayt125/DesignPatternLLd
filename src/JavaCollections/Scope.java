package JavaCollections;

public class Scope {
    public static void main(String[] args){
        int x = 10;
        {
            int y = 20;
            System.out.println(y);
        }
        System.out.println(x);
//        System.out.println(y); -> y can not be used here as it is out of scope
    }
}
