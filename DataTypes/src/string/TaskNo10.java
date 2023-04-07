package string;

public class TaskNo10 {
    public int sumOfTheNumbersAppearInAGivenString(String string)
    {
        int l = string.length();
        int sum = 0;
        String temp = "";
        for (int i = 0; i < l; i++)
        {
            if (Character.isDigit(string.charAt(i)))
            {
                if (i < l-1 && Character.isDigit(string.charAt(i+1)))
                {
                    temp += string.charAt(i);
                }
                else
                {
                    temp += string.charAt(i);
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        TaskNo10 m= new TaskNo10();
        String str1 =  "Java 30 is a popular10 programming 15 language";
        System.out.println("The given string is: "+str1);
        System.out.println("The sum of numbers in the string is: "+m.sumOfTheNumbersAppearInAGivenString(str1));
    }
}
