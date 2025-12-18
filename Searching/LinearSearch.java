package Searching;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        
      
        System.out.println("enter the value you want to search");
        Scanner sc = new Scanner(System.in);
   int d2 = sc.nextInt();
   int[] nums = {200 , 343 ,44,34,34,43,4,3,4434,44,444,444 };
   int target = d2;
   int data = search(nums, target);
   System.out.println("the position of the data is "+data);
    }

    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}