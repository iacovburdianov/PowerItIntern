package TaskNo2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 4/19/2023
 *
 * @author : Admin
 * @date : 4/19/2023
 * @project : Dynamic arrays Java StreamAPI
 */
public class ListOfPersons{
    private List<Person> persons;

    public ListOfPersons() {
        persons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        persons.add(person);
    }
    public void removePerson(Person person) {
        persons.remove(person);
    }

    public void modifyPerson(Person person, String newName,String newSurname, int newAge, String newCity,String newResidence) {
        person.setName(newName);
        person.setSurname(newSurname);
        person.setAge(newAge);
        person.setCity(newCity);
        person.setResidence(newResidence);
    }

    public void printAllPersons() {
        for (Person person : persons) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }

    public int countPersonsByCity(String city) {
        int count = 0;
        for (Person person : persons) {
            if (person.getCity().equals(city)) {
                count++;
            }
        }
        return count;
    }
    public double computeAverageAge() {
        if (persons.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (Person person : persons) {
            sum += person.getAge();
        }
        return (double) sum / persons.size();
    }

}
