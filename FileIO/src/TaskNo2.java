import java.util.Scanner;

/**
 * Created by Admin on 4/11/2023
 *
 * @author : Admin
 * @date : 4/11/2023
 * @project : FileIO
 */
public class TaskNo2 {
    String name;
    String studentId;
    int score;
    public TaskNo2() {
        this(" ", " ",0);
    }

    public TaskNo2(String name, String studentId, int score) {
        this.name = name;
        this.studentId = studentId;
        this.score = score;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of students:");
        int nrOfStudents = Integer.parseInt(scanner.nextLine().trim());
        System.out.println("Input Student Name, ID, Score:");
        TaskNo2 student = new TaskNo2();
        TaskNo2 max = new TaskNo2();
        TaskNo2 min = new TaskNo2(" ", " ", 50);

        for (int i = 0; i < nrOfStudents; i++) {
            student.name = scanner.next();
            student.studentId = scanner.next();
            student.score = scanner.nextInt();
            if (max.score < student.score) {
                max.name = student.name;
                max.studentId = student.studentId;
                max.score = student.score;
            }
            if (min.score > student.score) {
                min.name = student.name;
                min.studentId = student.studentId;
                min.score = student.score;
            }
        }

        System.out.println("The highest score : " + max.name + ", " + max.score);
        System.out.println("Minimal score : " + min.name + ", " + min.score);
    }
}
