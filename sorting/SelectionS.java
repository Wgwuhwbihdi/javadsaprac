package sorting;

import java.lang.reflect.Array;

public class SelectionS {
    public static void main(String[] args) {
       int[] data = {32,43,5,67,45,68,97,4697,547,54,7,756,678,78};
       SlS(data);
      for(int data1 : data){
        System.out.println(data1+"");
      }
    }

    static void SlS(int[] arr) {
        // n is used as the size of the array
        int n = arr.length;
        // checking all the element where 0 is the starting of the element and n-1 is end of the array
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // finding the minimum element of unorted array
            for(int j = i+1; j<n;j++){
                 if(arr[j]<arr[minIndex]){
                    minIndex = j;
                 }
            }
            // swaping the found the minimum element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
