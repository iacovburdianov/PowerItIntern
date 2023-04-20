package TaskNo4;

public class MyStringSimulator {
    public static void main(String[] args) {
        MyString s1 = new MyString("hello");
        System.out.println(s1.substring(2, 4).toUpperCase().equals(new MyString("LL"))); // true

        MyString s2 = new MyString("world");
        s1.concat(s2.toString());
        System.out.println(s1.equals(new MyString("helloworld"))); // true

        MyString s3 = new MyString("12345");
        System.out.println(MyString.parseInt(s3)); // 12345

        MyString s4 = new MyString("12a45");
        try {
            int value = MyString.parseInt(s4);
            System.out.println(value);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage()); // "Invalid character: a"
        }
    }
}

