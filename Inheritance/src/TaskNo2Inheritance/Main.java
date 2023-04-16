package TaskNo2Inheritance;

/**
 * Created by Admin on 4/13/2023
 *
 * @author : Admin
 * @date : 4/13/2023
 * @project : Inheritance
 */
public class Main {
    public static void main(String[] args) {
        var student = new Student("John", "Doe", 2018);
        System.out.println(student.name);
        System.out.println(student.surname);
        System.out.println(student.getFullName());
        System.out.println(student.year);
        System.out.println(student.getCourse());
    }
}
