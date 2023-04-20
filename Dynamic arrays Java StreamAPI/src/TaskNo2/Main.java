package TaskNo2;

/**
 * Created by Admin on 4/20/2023
 *
 * @author : Admin
 * @date : 4/20/2023
 * @project : PowerItIntern
 */
public class Main {
    public static void main(String[] args) {
        ListOfPersons listOfPersons = new ListOfPersons();
        Person leonid = new Person("Leonid","Vacarciuc",23,"Chisinau","Buiucani");
        listOfPersons.addPerson(leonid);
        Person ion = new Person("Ion","Consita",23,"Straseni","Centru");
        listOfPersons.addPerson(ion);
        listOfPersons.addPerson(new Person("Valera","Paras",23,"Balti","Centru"));
        listOfPersons.addPerson(new Person("Vasile","Momel",23,"Orhei","Nistreana"));
        listOfPersons.addPerson(new Person("Aurel","Viva",23,"Ocnita","Centru"));
        listOfPersons.addPerson(new Person("John","Vile",23,"Chisinau","Buiucani"));


        listOfPersons.modifyPerson(leonid,"Leonid","Veghea",24,"Chisinau","Riscanovca");
        System.out.println("In chisinau live "  + listOfPersons.countPersonsByCity("Chisinau") + " persons.\n");
        listOfPersons.removePerson(ion);
        System.out.println("Average age of all person in this list: " + listOfPersons.computeAverageAge() + "\n");
        listOfPersons.printAllPersons();
    }
}
