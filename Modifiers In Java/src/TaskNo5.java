/**
 * Created by Admin on 4/12/2023
 *
 * @author : Admin
 * @date : 4/12/2023
 * @project : Modifiers In Java
 */

/*Write a Java method to check whether a string is a valid password.
Password rules:

Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.*/
public class TaskNo5 {
    public static void main(String[] args) {
        check("I2");
    }

    public static void check(String password) {
        String pattern = "^(?=.*?\\d.*\\d)[a-zA-Z0-9]{8,}$";
        if ((password.length() >= 10)) {
            if (password.matches(pattern)) {
                System.out.println("Password " + password + " is valid");
            }else {
                System.out.println("Incorect password.");
            }
        }System.out.println("Incorect password.");
    }
}
