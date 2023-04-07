package string;

import java.util.ArrayList;
import java.util.List;

public class TaskNo7 {
    static void checkExistance(String str1, String stringToSearch) {
        int chk = 0;
        char chhr = ' ';
        int[] a = new int[Character.MAX_VALUE + 1];

        for (int i = 0; i < str1.length(); i++) {
            chhr = str1.charAt(i);
            ++a[chhr];
        }
        for (int i = 0; i < stringToSearch.length(); i++) {
            chhr = stringToSearch.charAt(i);
            if (a[chhr] >= 1)
                chk = 1;
        }
        if (chk == 1)
            System.out.println(str1);
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("is");
        list.add("a");
        list.add("popular");
        list.add("programming");
        list.add("language.");

        System.out.print("The given strings are: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "   ");
        }
        System.out.println("\nThe given word is: pro ");
        System.out.println("\nThe strings containing all the letters of the given word are: ");
        for (int j = 0; j < list.size(); j++) {
            checkExistance(list.get(j), "pro");
        }
    }
}
