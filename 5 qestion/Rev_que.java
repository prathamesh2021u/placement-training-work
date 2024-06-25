
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

 public class Rev_que {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(101);
        q.add(102);
        q.add(103);
        q.add(104);
        q.add(105);


        
       System.out.println("Queue"+q); 

         // Reverse the queue using a stack
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

         // Print the elements in reversed order
        System.out.println("Elements in reversed order:");
        while (!q.isEmpty()) {
            System.out.println(q.remove());

}



        // int n=q.size();
        //  System.out.println("Queue lenth \t"+n); 

        //  for( int i=n-1;i >= 0; i--){
            
        //     if(n-1 % i==0){

        //         System.out.println("Queue lenth \t"+n-1);

        //     }
   
        //  }
       
    //     String front =q.remove();
    //     System.out.println("romove element \t"+front);
    //     System.out.println("after remove"+q);
    //      System.out.println(" \n"); 
    //        System.out.println(" \n"); 
    //     String f =q.poll();
    //    System.out.println("romove element form poll \t"+f);
    //    System.out.println("after remove poll"+q);
    //     System.out.println(" \n"); 
    //       System.out.println(" \n"); 
          
    //     String fr =q.remove();
    //     System.out.println("romove element \t"+fr);
    //     System.out.println("after remove"+q);
    //       System.out.println(" \n"); 
    //         System.out.println(" \n"); 
            
    //       String fro =q.remove();
    //     System.out.println("romove element"+fro);
    //     System.out.println("after remove"+q);
    //       System.out.println(" \n"); 
    //         System.out.println(" \n"); 
      
    //    String p =q.peek();
    //   System.out.println("return\n"+p);
    //    System.out.println("after remove peek \t"+q); 
    //      System.out.println(" \n"); 
    //     System.out.println(" \n"); 
        
    //    String e =q.element();
    //   System.out.println("return\n"+e);
    //    System.out.println("after remove element \t"+q);
       
    }
}