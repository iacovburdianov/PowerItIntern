package date_and_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TaskNo4 {
    public static void main(String[] args) {
        try {
            String originalString = "2022-06-13 16:55:02";
            Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(originalString);
            String newstr = new SimpleDateFormat("MM/dd/yyyy, H:mm:ss").format(date);
            System.out.println("\n"+newstr+"\n");
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
