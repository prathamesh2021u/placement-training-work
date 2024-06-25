import java.util.Arrays;

class Short {
    public static void main(String args[])
    {
        int[] arr = { 5, 3, 1, 7, 8};
        System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
   
       int size=arr.length;
        System.out.println("second laragest no in array is : \t"+(size-2));


    }

}