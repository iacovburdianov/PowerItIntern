/**
 * Created by Admin on 4/11/2023
 *
 * @author : Admin
 * @date : 4/11/2023
 * @project : FileIO
 */

import java.io.BufferedReader;
        import java.io.FileReader;
        import java.io.IOException;

public class TaskNo4 {
    public static void main(String[] args) {
        String fileName = "D:\\PowerIT\\repositories\\PowerItIntern\\FileIO\\src\\internship\\powerit\\test.txt"; // Replace with your file name

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 1;
            while ((line = br.readLine()) != null && lineNumber <= 3) {
                System.out.println(line);
                lineNumber++;
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
