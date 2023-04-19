package TaskNo4;

public class MyStringUtil {
    public static int parseIntIter(MyString str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                throw new NumberFormatException();
            }
            result = result * 10 + (c - '0');
        }
        return result;
    }

    public static int parseIntRec(MyString str) {
        return parseIntRecHelper(str, 0);
    }

    private static int parseIntRecHelper(MyString str, int index) {
        if (index == str.length()) {
            return 0;
        }
        char c = str.charAt(index);
        if (c < '0' || c > '9') {
            throw new NumberFormatException();
        }
        int value = c - '0';
        return value + 10 * parseIntRecHelper(str, index + 1);
    }
}
