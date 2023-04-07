package string;

public class TaskNo8 {
    public static String ReverseWordsInAGivenString(String str1) {
        StringBuilder sb = new StringBuilder(str1);
        String StringReversed = sb.reverse().toString();

        String[] words = StringReversed.split(" ");
        StringBuilder reverse = new StringBuilder();
        for (String temp: words) {
            sb = new StringBuilder(temp);
            reverse.append(sb.reverse() + " ");
        }
        reverse.deleteCharAt(reverse.length() - 1);
        return reverse.toString();
    }
    public static void main(String[] args) {
        String str1 = "Java programming tutorial is designed for students and working professionals";
        System.out.println("The given string is: " + str1);
        System.out.println("The new string after reversed the words: " + ReverseWordsInAGivenString(str1));
    }
}
