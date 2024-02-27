package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsDriver {
    public static void main(String[] args){
        List<Integer>lt = new ArrayList<>();
        for(int i=0;i<5;i++){
            lt.add(i*5);
        }

        // traversal
        for(int x:lt){
            System.out.println(x);
        }

        // traversal throught iterator
        Iterator<Integer>it = lt.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // updating any index
        lt.set(0,100);
        System.out.println(lt.get(0));

    }
}
