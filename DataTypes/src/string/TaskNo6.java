package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

//Write a Java program to print after removing duplicates from a given string.
public class TaskNo6 {
    static void removeDuplicate(char str[], int n)
    {
        // Create a set using String characters
        // excluding
        HashSet<Character> s = new LinkedHashSet<>(n - 1);
        // HashSet doesn't allow repetition of elements
        for (char x : str)
            s.add(x);

        // Print content of the set
        for (char x : s)
            System.out.print(x);
    }
    public static void main(String[] args) {
        char str[] = "Hello World!!!".toCharArray();
        int n = str.length;

        removeDuplicate(str, n);
    }
}
