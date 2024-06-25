//  on VS code 


class Area{
    public void Area_triangle(int b,int h) {
        //int b =5, h=15 ;  
        double A = 0.5 * b * h;
        System.out.println("the area of triangle:" + A );
    }
    
    public void Area_squ() {
        int side=52;
        int D = side*side;
        System.out.println("the area of squar:" + D );
    
    }    
    
}

    
   
class Cal extends Area {
    public static void main(String[] args) {
         Cal c = new Cal(); 
        
        c.Area_triangle(12,45);
        c.Area_squ();
        
    }
}