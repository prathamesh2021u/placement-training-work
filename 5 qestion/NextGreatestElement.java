import java.util.Stack;

public class NextGreatestElement {
    public static int[] nextGreatestElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        
        for (int i = n - 1; i >= 0; i--) {
           
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

           
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

           
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0};
        int[] result = nextGreatestElement(arr);

        // Print the result array
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}





// import java.util.Stack;

// public class NextGreatestElement {
//     public static int[] nextGreatestElement(int[] arr) {
//         int n = arr.length;
//         int[] result = new int[n];
//         Stack<Integer> stack = new Stack<>();

//         // Traverse the array from right to left
//         for (int i = n - 1; i >= 0; i--) {
//             // Remove elements from the stack that are less than or equal to the current element
//             while (!stack.isEmpty() && stack.peek() <= arr[i]) {
//                 stack.pop();
//             }

//             // If stack is empty, no greater element to the right
//             if (stack.isEmpty()) {
//                 result[i] = -1;
//             } else {
//                 result[i] = stack.peek();
//             }

//             // Push the current element onto the stack
//             stack.push(arr[i]);

//             // Print the stack and the current result array after processing each element
//             System.out.println("Stack after processing element " + arr[i] + ": " + stack);
//             System.out.println("Result array so far: " + java.util.Arrays.toString(result));
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         int[] arr = {2, 3, 1, 6};
//         int[] result = nextGreatestElement(arr);

//         // Print the final result array
//         System.out.println("Final result array: " + java.util.Arrays.toString(result));
//     }
// }
