package JavaCollections;

import java.util.ArrayList;
import java.util.List;

public class ListDriver {
    public static void main(String[] args){
        List<Integer>lt = new ArrayList<>();
        for(int i=0;i<5;i++){
            lt.add(i,i);
            // this is same as lt.add(i)
            // we can only add element at a index if other elements are present or at end of list
        }
        for(int x:lt){
            System.out.println(x+" ");
        }
    }
}
