/**
 * Created by Admin on 4/12/2023
 *
 * @author : Admin
 * @date : 4/12/2023
 * @project : Modifiers In Java
 */
public class TaskNo9Modifiers {
    public static void main(String[] args) {
        Person personIon = new Person("Ion", "masculin",34);
        String genderOfIon = personIon.getGender();
        System.out.println(genderOfIon);
        personIon.setGender("feminin");
        System.out.println(personIon.getGender());
    }

}
class Person {
    private String name, gender;
    protected String address;
    protected int phoneNumber;
    private int age;
    private long cardNumber;




    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void print() {
        System.out.println("Name : " + name +
                "\nAge : " + age +
                "\nGender : " + gender);
    }
}
