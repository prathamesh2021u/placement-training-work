
// public class Reverse{
//   public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40, 50};
//         int start = 0, end=arr.length-1;
//         while(start<end){
//             int temp=arr[start];
//             arr[start]= arr[end];
//             arr[end]= temp;

//             start++;
//             end--;


//         }

    //     int result = binarySearch(arr, key);
    //     if (result != -1) {
//     //         System.out.println("Element found at index " + result);
//     //     } else {
//     //         System.out.println("Element not found");
//     // }
//     }
// }


public class Reverse{
    
    public static void reverseArray(int[] array) {
        int[] arr = {10, 20, 30, 40, 50};
        int start = 0, end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]= arr[end];
            arr[end]= temp;

            start++;
            end--;
        }
    }
    
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
}



    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        
        System.out.println("Original array:");
        printArray(array);
        
        reverseArray(array);
        
        System.out.println("Reversed array:");
        printArray(array);
    }
}