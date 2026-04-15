import java.util.ArrayList;
import java.util.List;

public class ListInsideList {
    public static void main(String[] args) {


        ArrayList<List<String>> al3 = new ArrayList<>();
        ArrayList<String> al = new ArrayList<>();
        al.add(("One"));
        al.add(("two"));
        al.add(("three"));
        al.add(("four"));

        ArrayList<String> al2 = new ArrayList<>();
        al2.add(("One"));
        al2.add(("two"));
        al2.add(("three"));
        al2.add(("four"));

        al3.add(al2);
        al3.add(al);

        System.out.println(al3);

    }
}
