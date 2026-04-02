import java.util.Arrays;

public class Two_sum {
    public static void main(String[] args) {

        // Find two number in sorted array

        int arr[] = {2, 3, 5, 7, 9};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] arr, int target) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                // return new int[]{i , j}; --> for return index
                return new int[]{arr[i], arr[j]};
            } else if (target > sum) {
                i++;
            }
            j--;
        }
        return new int[]{-1, -1};
    }
}
