class One{
  
  void calculate( int x){
    System.out.println("Squre value="+(x*x));

  }}

class Two extends One{

    void calculate( int x){
      System.out.println("Squre value="+(x*x*x));  

    }

public static void main(String[]args){
    One obj1=new One();
    Two obj2=new Two();
    One ref;
    ref=obj2;


    obj1.calculate(4);
    obj2.calculate(4);
    ref.calculate(4);


}

}