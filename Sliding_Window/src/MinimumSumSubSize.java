public class MinimumSumSubSize {
    public static void main(String[] args) {

        // Minimum size of subarray sum

        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int winSum = 0;
        int winLength = Integer.MAX_VALUE;
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            winSum += arr[right];

            while (winSum >= target) {
                int winSize = right - left + 1;

                if (winLength > winSize) {
                    winLength = winSize;
                }

                winSum -= arr[left];
                left++;
            }
        }

       //  If no valid subarray exists, return 0

        if (winLength == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(winLength);
        }
    }
}