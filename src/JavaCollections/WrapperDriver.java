package JavaCollections;

public class WrapperDriver {
    private void increment(Integer x){
        x+=1;
    }
    private void increment_arr(int []x){
        x[0]+=1;
    }
    public static void main(String[] args){
        WrapperDriver obj = new WrapperDriver();

        // here value of Integer is not increment with pass by reference because of autoboxing and unboxing
        Integer b = 6;
        b+=1;
        obj.increment(b);
        System.out.println(b);

        int a[] = new int[1];
        a[0] = 6;
        a[0]+=1;
        obj.increment_arr(a);
        System.out.println(a[0]);
    }

}
