import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {

        // Remove duplicate from sorted Array

        // For loop

        int[] arr = {1, 2, 3, 3, 4, 5};
        int left = 0;

        for (int right = 1; right < arr.length; right++) {

            if (arr[left] != arr[right]) {
                left++;
                arr[left] = arr[right];
            }
        }

        // Using While loop

        /**
         *     int left = 0;
         *         int right = 1;
         *         while(right < arr.length) {
         *
         *             if(arr[left] == arr[right]) {
         *                 right++;
         *                 continue;
         *             }
         *             left++;
         *             arr[left] = arr[right];
         *             right++;
         *         }
         *
         */

        for (int i = 0; i <= left; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
