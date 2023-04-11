import java.io.*;

/**
 * Created by Admin on 4/11/2023
 *
 * @author : Admin
 * @date : 4/11/2023
 * @project : FileIO
 */
public class TaskNo4 {
    public static void main(String[] args) {
        String strLine = "";
        try {
            LineNumberReader reader =
                    new LineNumberReader(
                            new InputStreamReader(
                                    new FileInputStream(
                                            "D:\\PowerIT\\repositories\\PowerItIntern\\FileIO\\src\\internship\\powerit\\test.txt"),
                                    "UTF-8"));
            while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= 3){
                System.out.println(strLine);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
