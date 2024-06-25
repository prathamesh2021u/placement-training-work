// Q1)wap to print the subarray
// Q2)wap to print 1)max_sum 2)max_product in subarray


public class SubArrays{
    
     public static void printSubarrays(int[] arr) {
         int n = arr.length;
         for(int i=0;i<n;i++){
             for(int j=i;j<n;j++){
                 for(int k=i;k<=j;k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
             }
         }
         
     }
     
     public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,5};
        printSubarrays(arr);
}

}