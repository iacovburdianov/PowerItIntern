package TaskNo4;

/**
 * Created by Admin on 4/19/2023
 *
 * @author : Admin
 * @date : 4/19/2023
 * @project : Dynamic arrays Java StreamAPI
 */
public class MyString {
    private char[] chars;

    public MyString(String str) {
        chars = str.toCharArray();
    }

    public void concat(MyString other) {
        char[] result = new char[chars.length + other.chars.length];
        for (int i = 0; i < chars.length; i++) {
            result[i] = chars[i];
        }
        for (int i = 0; i < other.chars.length; i++) {
            result[chars.length + i] = other.chars[i];
        }
        chars = result;
    }

    public boolean equals(MyString other) {
        if (chars.length != other.chars.length) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != other.chars[i]) {
                return false;
            }
        }
        return true;
    }

    public MyString substring(int start, int end) {
        if (start < 0 || start > end || end > chars.length) {
            throw new IndexOutOfBoundsException();
        }
        char[] result = new char[end - start];
        for (int i = start; i < end; i++) {
            result[i - start] = chars[i];
        }
        return new MyString(new String(result));
    }

    public int length() {
        return chars.length;
    }

    public char charAt(int index) {
        if (index < 0 || index >= chars.length) {
            throw new IndexOutOfBoundsException();
        }
        return chars[index];
    }

    public int indexOf(char c) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                return i;
            }
        }
        return -1;
    }

    public MyString toUpperCase() {
        char[] result = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            result[i] = Character.toUpperCase(chars[i]);
        }
        return new MyString(new String(result));
    }
}

