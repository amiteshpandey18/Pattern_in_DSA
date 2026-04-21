public class Basic {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int winSize = 2;
        int winSum = arr[0] + arr[1];
        System.out.println(winSum);
        for (int i = winSize; i < arr.length; i++) {
            winSum = winSum - arr[i - winSize] + arr[i];
            System.out.println(winSum);
        }
    }
}