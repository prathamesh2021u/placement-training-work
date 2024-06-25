//Q1 wap to find Minvalue in array.
public class Minvalu{
  public static int findMinValue(int[] arr) {
        // Check if the array is empty
        if (arr == null || arr.length == 0) {
            System.err.println("Array should not be null or empty");
        }
        int minValue = arr[0];  // Initialize the minimum value with the first element of the array

        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Update minValue if a smaller element is found
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }

        return minValue;
    }

    public static int findMaxValue(int[] arr) {
        // Check if the array is empty
        if (arr == null || arr.length == 0) {
            System.err.println("Array should not be null or empty");
        }
        int maxValue = arr[0];  // Initialize the minimum value with the first element of the array

        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Update minValue if a smaller element is found
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        return maxValue;
    }



public static void main(String[] args) {
        int[] array = {5, 3, 8, 6, 4, 7, 2};
        int minValue = findMinValue(array);
        System.out.println("The minimum value in the array is: " + minValue);
   
       int maxValue = findMaxValue(array);
       System.out.println("The minimum value in the array is: " + maxValue);
    }

 }