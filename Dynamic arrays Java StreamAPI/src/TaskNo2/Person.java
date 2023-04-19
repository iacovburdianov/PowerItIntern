package TaskNo2;

/**
 * Created by Admin on 4/19/2023
 *
 * @author : Admin
 * @date : 4/19/2023
 * @project : Dynamic arrays Java StreamAPI
 */
public class Person {
    private String name;
    private String surname;
    private int age;
    private String city;
    private String residence;

    public Person(String name, String surname, int age, String city, String residence) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
        this.residence = residence;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getResidence() {
        return residence;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", residence='" + residence + '\'' +
                '}';
    }
}
