package Searching;
public class Binarysearch {
    public static void main(String[] args) {
        System.out.println("Binary Serach");
        int[] arr = { -10, -20, -30, 40, 50, 60, 70, 80, 90, 100 };
        int target = 50;
        int ans = binarys(arr, target);
        System.out.println("the position is " + ans);
    }

    static int binarys(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find the middel element
            // int mid = (start+end)/2;
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
