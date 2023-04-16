package TaskNo13Polymorphism;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setInfo("Ion",34,"Orhei");
        Student student2 = new Student();
        student2.setInfo("Valera",23,"Balti");
        Student student3 = new Student();
        student3.setInfo("Cristina",20,"Chisinau");
        Student student4 = new Student();
        student4.setInfo("Ionela",24,"Chisinau");
        Student student5 = new Student();
        student5.setInfo("Maria",34,"Orhei");
        Student student6 = new Student();
        student6.setInfo("Valea",34,"Orhei");
        Student student7 = new Student();
        student7.setInfo("Carina",34,"Orhei");
        Student student8 = new Student();
        student8.setInfo("Jana",34,"Orhei");
        Student student9 = new Student();
        student9.setInfo("Iosif",34,"Orhei");
        Student[] students = new Student[] {
                student1,student2,student3,
                student4,student5,student6,
                student7,student8,student9
        };
        for(Student student: students) {
            System.out.println(student);
        }
    }
}
