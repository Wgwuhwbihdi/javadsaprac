package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Qsort {

    public static void main(String[] args) {
    int[] arr = {32,34,45,56,76,54};
    sort(arr, 0, 0);
      for (int i : arr) {
        System.out.println(i);
      }
    
    }
    static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;
        int pivot = nums[s];
        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }
            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        sort(nums, low, e);
        sort(nums, s, high);
    }
}
