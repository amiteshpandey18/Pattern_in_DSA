import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

        int arr1[] = {1, 3, 5};
        int arr2[] = {2, 3, 4, 6};

        int[] mergeArray = new int[arr1.length + arr2.length];

        mergeSortedArray(arr1, arr2, mergeArray);
    }

    public static void mergeSortedArray(int[] arr1, int[] arr2, int[] mergeArray) {

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergeArray[k++] = arr1[i++];
            } else if (arr2[j] < arr1[i]) {
                mergeArray[k++] = arr2[j++];
            } else {
                mergeArray[k++] = arr1[i++];
                mergeArray[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            mergeArray[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            mergeArray[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(mergeArray));

        // Leet Code Solution ---------------------------------------------------------

    /**    int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {1,2,3};
        int m = 3;
        int n = 3;
        int arr[] = {1,2,2,3,4,4,5};


        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }


        System.out.println(Arrays.toString(nums1));  */
    }
}
