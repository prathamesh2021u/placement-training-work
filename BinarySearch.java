public class BinarySearch {
    
    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == key) {
                return mid;
            }
            
            if (arr[mid] < key) {
                start = mid + 1;
            } 
            
            else {
                end = mid - 1;
            }
        }    
        return -1;

    }


    
    


    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 50;

        int result = binarySearch(arr, key);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
    }
    }
}

