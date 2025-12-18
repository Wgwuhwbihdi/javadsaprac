package sorting;
// import java.lang.reflect.Array;

// public class bblsort {

//     public static void main(String[] args) {
//         int[] data = {34,56,76,78,98,54,34,65,78,34,23,67};
//         Bubble(data);
//         System.out.println(data);
//     }

//     static void Bubble(int[] arr) {
//         // run the step n-1 time
//         for (int i = 0; i < arr.length; i++) {
//             // for each step max item will come at the last respective index
//             for(int j=0; j<arr.length-i;i++){
//                 // swap if the item is smaller then previous item
//                 if(arr[i] <arr[j-1]){
//                     // swap
//                     int temp = arr[j];
//                     arr[j] = arr[i-1];
//                     arr[i-1] = temp;
//                 }
//             }
//         }
//     }
// }

// ----------------------------------------------------------------------------------------------------------------------
public class bblsort {
    
    // Function to perform Bubble Sort on an array
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop to compare adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Function to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {23,43,56,67,78,89,56,4,56,78897,5,34,34};

        System.out.println("Original array:");
        printArray(numbers);

        // Call the bubbleSort function
        bubbleSort(numbers);

        System.out.println("Sorted array:");
        printArray(numbers);
    }
}