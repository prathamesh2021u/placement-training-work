import java.util.*;
 


class Reves {
    public static void main(String args[])
    {
         Integer array[] = { 1, 6, 3, 7, 5 };
        System.out.println("The original array is: ");
        /*for (int i = 0; i < array.; i++) {
          System.out.print(i + " ");  
        }*/
        System.out.print("\n ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        Arrays.sort(array,Collections.reverseOrder());
        System.out.println("\nThe sorted array is: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }


}



// Java Program to Sort the Elements in Descending Order

/*
// Driver Class
class GFG {
      // Main Method
    public static void main(String[] args)
    {
        // Initializing the array
        Integer array[] = { 1, 2, 3, 4, 5 };

        // Sorting the array in descending order
        Arrays.sort(array, Collections.reverseOrder());

        // Printing the elements
        System.out.println(Arrays.toString(array));
    }
}
*/