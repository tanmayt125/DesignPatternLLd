package JavaCollections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueueDriver {
    public static void main(String[] args){

        Stack<Integer>st = new Stack<>();
        for(int i=0;i<5;i++){
            st.add(i);
        }

        // traversal over stack
        while(!st.empty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
