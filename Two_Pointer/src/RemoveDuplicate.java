import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {

        // Remove duplicate from sorted Array

        int[] arr = {1, 2, 3, 3, 4, 5};
        int left = 0;

        for (int right = 1; right < arr.length; right++) {

            if (arr[left] != arr[right]) {
                left++;
                arr[left] = arr[right];
            }
        }

        for (int i = 0; i <= left; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
