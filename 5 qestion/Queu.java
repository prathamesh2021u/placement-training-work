// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.LinkedList;
import java.util.Queue;

 public class Queu {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("my");
        q.add("name");
        q.add("is prathamesh");
        q.offer(" kharade");

       System.out.println("Queue"+q); 
       
        String front =q.remove();
        System.out.println("romove element \t"+front);
        System.out.println("after remove"+q);
         System.out.println(" \n"); 
           System.out.println(" \n"); 
        String f =q.poll();
       System.out.println("romove element form poll \t"+f);
       System.out.println("after remove poll"+q);
        System.out.println(" \n"); 
          System.out.println(" \n"); 
          
        String fr =q.remove();
        System.out.println("romove element \t"+fr);
        System.out.println("after remove"+q);
          System.out.println(" \n"); 
            System.out.println(" \n"); 
            
          String fro =q.remove();
        System.out.println("romove element"+fro);
        System.out.println("after remove"+q);
          System.out.println(" \n"); 
            System.out.println(" \n"); 
      
       String p =q.peek();
      System.out.println("return\n"+p);
       System.out.println("after remove peek \t"+q); 
         System.out.println(" \n"); 
        System.out.println(" \n"); 
        
       String e =q.element();
      System.out.println("return\n"+e);
       System.out.println("after remove element \t"+q);
       
    }
}