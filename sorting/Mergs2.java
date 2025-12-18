package sorting;

public class Mergs2 {

    static void mergsort(int[] arr, int L, int R) {
        // Base condition
        if (L < R) {
            int mid = L + (R - L) / 2;

            // Recursive calls
            mergsort(arr, L, mid);
            mergsort(arr, mid + 1, R);

            // Merge the sorted halves
            merge(arr, L, mid, R);
        }
    }

    static void merge(int[] arr, int L, int mid, int R) {
        // Temporary array
        int[] temp = new int[R - L + 1];

        int i = L; // left subarray index
        int j = mid + 1; // right subarray index
        int k = 0; // temp array index

        // Merge both halves
        while (i <= mid && j <= R) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= R) {
            temp[k++] = arr[j++];
        }

        // Copy back to original array
        for (int p = 0; p < temp.length; p++) {
            arr[L + p] = temp[p];
        }
    }

    public static void main(String[] args) {
        int[] data = { 5, 4, 3, 2, 1 };

        mergsort(data, 0, data.length - 1);

        for (int i : data) {
            System.out.print(i + " ");
        }
    }
}
