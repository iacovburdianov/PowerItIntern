package string;
/*a Java program to concatenate a given string to the end of another string.*/
public class TaskNo4 {
    public static void main(String[] args) {
        String str1 = "I'm a student";
        String str2 = "I like to study!";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        // Concatenate the two strings together.
        String concatenatedString = str1.concat(str2);

        System.out.println("The concatenated string: " + concatenatedString);
    }
}
