package TaskNo4;

/**
 * Created by Admin on 4/20/2023
 *
 * @author : Admin
 * @date : 4/20/2023
 * @project : PowerItIntern
 */
import java.util.ArrayList;

public class MyString {
    private char[] data;

    public MyString(String s) {
        data = s.toCharArray();
    }

    public void concat(String s) {
        data = (new String(data) + s).toCharArray();
    }

    public boolean equals(MyString s) {
        return (new String(data)).equals(new String(s.data));
    }

    public MyString substring(int start, int end) {
        return new MyString(new String(data).substring(start, end));
    }

    public int length() {
        return data.length;
    }

    public char charAt(int index) {
        return data[index];
    }

    public int indexOf(char c) {
        return new String(data).indexOf(c);
    }

    public MyString toUpperCase() {
        return new MyString(new String(data).toUpperCase());
    }

    public static int parseInt(MyString s) throws NumberFormatException {
        return parseIntIterative(s);
        // or use parseIntRecursive(s, 0, 0);
    }

    // iterative version of parseInt
    private static int parseIntIterative(MyString s) throws NumberFormatException {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                throw new NumberFormatException("Invalid character: " + c);
            }
            result = result * 10 + (c - '0');
        }
        return result;
    }

    // recursive version of parseInt
    private static int parseIntRecursive(MyString s, int index, int result) throws NumberFormatException {
        if (index == s.length()) {
            return result;
        }
        char c = s.charAt(index);
        if (c < '0' || c > '9') {
            throw new NumberFormatException("Invalid character: " + c);
        }
        int digit = c - '0';
        result = result * 10 + digit;
        return parseIntRecursive(s, index + 1, result);
    }
}


