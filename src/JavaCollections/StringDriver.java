package JavaCollections;

public class StringDriver {
    public static void main(String []args){

        String s = "abc";
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+"  ");
        }
        System.out.println();

        // we can not directly modify any index of String in java as we do in cpp, because strings are immutable
        // in java
        // so we have to use setCharAt(index,element) of StringBuilder to do this

        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            System.out.print(sb.charAt(i)+"  ");
        }
        System.out.println();
        sb.setCharAt(0,'k');
        System.out.println(sb);

    }
}
