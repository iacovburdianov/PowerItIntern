package string;

public class TaskNo5 {
    public static void main(String[] args) {
        String a = "moldova";
        String b = "romania";

        int sumOfaAndbStrings = a.length()+b.length();
        System.out.println(sumOfaAndbStrings);

        int result = a.compareTo(b);

        // Display the results of the comparison.
        if (result < 0)
        {
            System.out.println("\"" + a + "\"is less than \"" + b + "\"");
        }else if (result == 0)
        {
            System.out.println("\"" + a + "\" is equal to \"" + b + "\"");
        }
        else // if (result > 0)
        {
            System.out.println("\"" + a + "\" is greater than \"" + b + "\"");
        }

        if (a.toLowerCase().charAt(0) < b.toLowerCase().charAt(0))
            System.out.println(a + " (comes first alphabetically)");
        else if (a.toLowerCase().charAt(0) > b.toLowerCase().charAt(0))
            System.out.println(b + " (comes first alphabetically)");



        a = a.substring(0,1).toUpperCase() + a.substring(1).toLowerCase();
        b = b.substring(0,1).toUpperCase() + b.substring(1).toLowerCase();
        System.out.println(a + " " + b);
    }
}
