package string;

/*Write a Java program which reverses string “my name is” without using ready functions.
* (not allowed -> toCharArray, reverse, etc.)
* Optional task: Write the same, but using only 4 lines of code,
*  1 for, 2 for variable declarations and 1 for showing the result (you can also use only 3).*/

public class TaskNo12 {
    public static void main(String[] args) {
        String originalString = "my name is";
        String reversedString = "";

        for (int i = 0; i < originalString.length(); i++) {
            reversedString = originalString.charAt(i) + reversedString;
        }

        System.out.println("Reversed string: "+ reversedString);
    }
}
