package TaskNo3;

import java.io.*;


/**
 * Created by Admin on 4/18/2023
 *
 * @author : Admin
 * @date : 4/18/2023
 * @project : Recursion
 */
/*Provide the implementation of a recursive method
* that counts how many occurrences of 1 appear in a sequence of integers read from a file
*  (accessed through a BufferedReader).*/
public class Main {
    public static int countWord(String number, String fis) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(fis));
        String readLine = "";
        int count = 0;
        while ((readLine = in.readLine()) != null) {
            String[] words = readLine.split("");
            for (String s : words) {
                if (s.equals(number)) count++;
            }
        }
        return count;
    }
    public static void main (String[] args) throws IOException {
        System.out.println(countWord("5","src/TaskNo3/demo.txt"));

    }

}
