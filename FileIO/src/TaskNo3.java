import java.io.File;

/**
 * Created by Admin on 4/11/2023
 *
 * @author : Admin
 * @date : 4/11/2023
 * @project : FileIO
 */

/*Write a Java program to check if a file or directory has permission to read and write data.*/
public class TaskNo3 {
    public static void main(String[] args) {
        // Create a File object
        File myFileDirectory = new File("D:\\PowerIT\\repositories\\PowerItIntern\\FileIO\\src\\internship\\powerit\\test.txt");
        if (myFileDirectory.canWrite())
        {
            System.out.println(myFileDirectory.getAbsolutePath() + " can write.\n");
        }
        else
        {
            System.out.println(myFileDirectory.getAbsolutePath() + " cannot write.\n");
        }
        if (myFileDirectory.canRead())
        {
            System.out.println(myFileDirectory.getAbsolutePath() + " can read.\n");
        }
        else
        {
            System.out.println(myFileDirectory.getAbsolutePath() + " cannot read.\n");
        }
    }
}
