/**
 * Created by Admin on 4/12/2023
 *
 * @author : Admin
 * @date : 4/12/2023
 * @project : Modifiers In Java
 */
public class TaskNo2 {
    public void countVowels(String string) {
        string = string.toLowerCase();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e'
                || string.charAt(i) == 'i'
                || string.charAt(i) == 'o'
                || string.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println(
                "Total no of vowels in string are: " + count);
    }

    public static void main(String[] args) {
        new TaskNo2().countVowels("Iacov Burdianov");
    }
}
