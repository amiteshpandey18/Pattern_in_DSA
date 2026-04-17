import java.util.Arrays;

public class Sort_0_1_2 {
    public static void main(String[] args) {

        // Dutch Flag Algorithm

        int arr[] = {1, 1, 1, 2, 2, 0, 1, 2, 2, 1, 0, 1, 2, 0, 2, 1};

        int i = 0;
        int j = 0;
        int k = arr.length - 1;

        while (i <= k) {
            if (arr[i] == 0) {
                swap(i, j, arr);
                i++;
                j++;
            } else if (arr[i] == 1) {
                i++;
            } else {
                swap(i, k, arr);
                k--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int i, int k, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
}