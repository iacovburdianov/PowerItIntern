package string;
//compares two strings lexicographically
public class TaskNo3 {
    public static void main(String[] args) {
        String str1 = "I'm an intern at PowerIt!'";
        String str2 = "I'm an intern at PowerIt!";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Compare the two strings.
        int result = str1.compareTo(str2);

        // Display the results of the comparison.
        if (result < 0)
        {
            System.out.println("\"" + str1 + "\"is less than \"" + str2 + "\"");
        }else if (result == 0)
        {
            System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\"");
        }
        else // if (result > 0)
        {
            System.out.println("\"" + str1 + "\" is greater than \"" + str2 + "\"");
        }
    }
}
