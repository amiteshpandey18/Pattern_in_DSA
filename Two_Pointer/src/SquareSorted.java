import java.util.Arrays;

public class SquareSorted {

    public static void main(String[] args) {
        int[] arr = {-7, -3, 2, 3, 11};
        int[] result = square(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] square(int[] arr) {
        int[] result = new int[arr.length];
        int j = result.length - 1;

        int left = 0;
        int right = result.length - 1;

        while (left <= right) {
            int leftsq = arr[left] * arr[left];
            int rightsq = arr[right] * arr[right];

            if (leftsq > rightsq) {
                result[j--] = leftsq;
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}