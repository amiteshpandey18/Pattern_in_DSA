public class ValidPalindrome {
    public static void main(String[] args) {

        int n = 121;
        String str = "malayalam";

        // System.out.println(validPalindrone(n));

        System.out.println(validPalindrone(str));
    }

    // With number

    /**
     * public static boolean validPalindrone(int n) {
     * String s = String.valueOf(n);
     * int i = 0;
     * int j = s.length() - 1;
     * while ((i < j)) {
     * if (s.charAt(i) != s.charAt(j)) {
     * return false;
     * }
     * i++;
     * j--;
     * }
     * return true;
     * }
     */

    // with String
    //  public static boolean validPalindrone(String str) {
//
//        int i = 0;
//        int j = str.length() - 1;
//
//        while (i < j) {
//            if (str.charAt(i) != str.charAt(j)) {
//                return false;
//            }
//
//            i++;
//            j--;
//        }
//        return true;


    // Best Solution

    public static boolean validPalindrone(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
                if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                    return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
