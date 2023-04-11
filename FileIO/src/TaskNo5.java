import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Admin on 4/11/2023
 *
 * @author : Admin
 * @date : 4/11/2023
 * @project : FileIO
 */
public class TaskNo5 {
    public static void main(String[] args) {
        IOFileExample iof = new IOFileExample("src/internship/powerit/test2.txt");
        iof.print();

        iof.write("src/input.txt","src/output.txt");
        long count = iof.countLines();
        System.out.println(count);
        iof.delete();


    }
}

class IOFileExample{
    private String fileName;

    public IOFileExample(String fileName) {
        this.fileName = fileName;
    }
    public int countLines() {
        //that returns the number of lines of the file;
        long count = 0;
        try {
            count = Files.lines(Paths.get(fileName)).count();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return (int) count;
    }

    public void write(String firstPath, String secondPath){

        try {
            FileReader fr = new FileReader(firstPath);
            FileWriter fw = new FileWriter(secondPath);
            String str = "";
            int i;

            while ((i = fr.read()) != -1) {
                str += (char)i;
            }
            System.out.println(str);
            fw.write(str);
            fr.close();
            fw.close();
            System.out.println(
                    "File reading and writing both done");
        }
        catch (IOException e) {
            System.out.println(
                    "There are some IOException");
        }

    }

    public void print() {
        String line;
        try
        {
            FileReader fileReader = new FileReader(fileName);

            // always wrap the FileReader in BufferedReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }

            // always close the file after its use
            bufferedReader.close();
        }
        catch(IOException ex)
        {
            System.out.println("\nError occurred");
            System.out.println("Exception Name: " +ex);
        }
    }


    public void delete() {
        //that deletes the file from mass-storage.
        File file = new File(fileName);
        if (file.delete()){
            System.out.println("File deleted successfully");
        }else {
            System.out.println("Failed to delete the file");
        }
    }
}


