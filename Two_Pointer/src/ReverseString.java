import java.sql.SQLOutput;

public class ReverseString {

    public static void main(String[] args) {

//        String str = "Rohit";
//        System.out.println("Before reverse: " + str);
//
//        char[] ch = str.toCharArray();
//        int i = 0, j = str.length() - 1;
//
//        while (i < j) {
//            char temp = ch[i];
//            ch[i] = ch[j];
//            ch[j] = temp;
//            i++;
//            j--;
//        }
//
//        str = new String(ch);
//        System.out.println("After Reverse: " + str);


        // Optimize way

        String str = "A man, a plan, a canal: Panama";

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
                System.out.println("Not palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("palindrome");
    }
}
