import java.sql.SQLOutput;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Rohit";
        System.out.println("Before reverse: " + str);

        char[] ch = str.toCharArray();
        int i = 0, j = str.length() - 1;

        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }

        str = new String(ch);
        System.out.println("After Reverse: " + str);
    }
}
