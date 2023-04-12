import java.util.Objects;

/**
 * Created by Admin on 4/12/2023
 *
 * @author : Admin
 * @date : 4/12/2023
 * @project : Modifiers In Java
 */
public class TaskNo10and11and12and13Modifiers {
    public static void main(String[] args) {
        Worker worker = new Worker("ION Caramitru");

        System.out.println("Brutto salary : " + worker.getBruttoSalary());
        System.out.println("Netto salary : " + worker.getNettoSalary());
        System.out.println("Salary increased : " + worker.increaseSalary(235));
        System.out.println("Salary decreased : " + worker.decreaseSalary(134));
        Worker.companyName = "Company1";
        Worker.companyName = "Company2";
    }
}
class Worker {
    private String name;
    private int salary;
    static String companyName;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getBruttoSalary() {
        return this.salary;
    }
    public int getNettoSalary() {
        return this.salary - (salary/100)*20;
    }
    public int increaseSalary(int sum) {
        return this.salary + sum;
    }
    public int decreaseSalary(int sum) {
       return this.salary - sum;
    }
    static void changeCompanyName(String name) {
        companyName = name;
    }

    //init block
    {
        this.salary = 1000;
    }
    {
        System.out.println(this.name + ": " + this.salary);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "CompanyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
}
