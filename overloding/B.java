class Sample{
  
  void add( int x,int y){
    System.out.println(" Sum="+(x+y));
    }
  
  void sub( int x,int y,int z){
    System.out.println(" sum ="+(x+y+z));
    }
  }


  class B extends Sample{
    void add(int x,int y){
        System.err.println("sub="+(x-y));

    }

   public static void main(String[] args) {
       B b1=new B();
       Sample s=new Sample();

       b1.add(14, 24);
       b1.sub(24, 14, 12);
       s.add(30, 45);
   } 



  }