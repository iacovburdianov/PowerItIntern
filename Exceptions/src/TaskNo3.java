import java.io.*;
import java.util.Scanner;

/**
 * Created by Admin on 4/12/2023
 *
 * @author : Admin
 * @date : 4/12/2023
 * @project : Exceptions
 */

/*Write the program that reads a file that contains numbers and analyzes its contents.
* If the file contains numbers, their amount should be displayed.
* If it contains strings that are not numbers, an error message is displayed.*/
public class TaskNo3 {
    public static void main(String[] args) {
        try {
           int numberCount = 0;
            StreamTokenizer sTokenizer = new StreamTokenizer(new FileReader("src/file.txt"));
            while (sTokenizer.nextToken() != StreamTokenizer.TT_EOF) {
                if (sTokenizer.ttype == StreamTokenizer.TT_WORD) {
                    throw new NumberFormatException();
                } else if (sTokenizer.ttype == StreamTokenizer.TT_NUMBER) {
                    numberCount++;
                }
            }
            System.out.println("Numbers in file : " + numberCount);
        }


        catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}
