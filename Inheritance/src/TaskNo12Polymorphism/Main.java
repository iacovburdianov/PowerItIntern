package TaskNo12Polymorphism;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */

/*
* Different signature of method
* Create a class to print an integer and a character with two methods
* having the same name but different sequence of the integer and the character parameters.
* For example, if the parameters of the first method are of the form (int n, char c),
* then that of the second method will be of the form (char c, int n).
* */
public class Main {
    void print(int i, char c) {
        System.out.println(i + ", " + c);
    }
    void print(char c, int i) {
        System.out.println(c + ", " + i);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.print('a',34);
        main.print(234,'s');
    }
}
