package JavaCollections;

import java.util.*;

public class ListAndMapDriver {
    public static void main(String[] args){
        List<Integer>lt = new ArrayList<>();
        for(int i=0;i<5;i++){
            lt.add(i*5);
        }

        // traversal
        for(int x:lt){
            System.out.print(x + " ");
        }
        System.out.println();

//        lt[0]+=5;
        System.out.println(lt.get(0));
        lt.set(0,lt.get(0)+10);
        System.out.println(lt.get(0));


        // sort
        // in cpp
        // sort(ar.begin(),ar.end())
        // reverse(ar.begin(),ar.end())

        Collections.sort(lt);
        Collections.reverse(lt);

        // traversal through iterator
        Iterator<Integer>it = lt.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // updating any index
        lt.set(0,100);
        System.out.println(lt.get(0));


        // map

        // hashMap in java is equivalent to unordered_map in cpp
        Map<Integer,Integer>mp = new HashMap<>();
        for(int i=0;i<5;i++){
            mp.put(i,i*5);
        }

        // traversal
        for(Map.Entry<Integer,Integer>x: mp.entrySet()){
            System.out.println(x.getKey()+"   "+x.getValue());
        }

        // set
        Set<Integer>st = new HashSet<>();
        for(int i=0;i<10;i++){
            st.add(i);
        }

        // traversal
        for(int x:st){
            System.out.println(x);
        }

        // traversal through iterator
        Iterator<Integer>itr = st.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next());
        }

    }
}
