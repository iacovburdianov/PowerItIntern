package string;
/*Write a Java program to read a string and return the string without the first two characters.
* Keep the first character if it is 'g' and keep the second character if it is 'h'.*/
public class TaskNo9 {
    public String exceptFirstTwo(String stng)
    {
        int len = stng.length();
        String temp = "";
        for (int i = 0; i < len; i++)
        {
            if (i == 0 && stng.charAt(i) == 'g')
                temp += 'g';
            else if (i == 1 && stng.charAt(i) == 'h')
                temp += 'h';
            else if (i > 1)
                temp += stng.charAt(i);
        }
        return temp;
    }
    public static void main(String[] args) {
        TaskNo9 m= new TaskNo9();
        String str1 = "good";
        String str2 = "photo";
        String str3 = "ghost";
        System.out.println("The given strings are: "+str1+"\n"+str2+"\n"+str3);
        System.out.println("The new string is: \n"+
                "new str1: " + m.exceptFirstTwo(str1) +
                "\nnew str2: " + m.exceptFirstTwo(str2) +
                "\nnew str3: " + m.exceptFirstTwo(str3));
    }
}
