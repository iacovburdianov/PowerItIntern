package TaskNo5Inheritance;


import java.util.List;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */
public class Veterinary {
    public void treatAnimal(Animal[] animal) {
        for (Animal anm: animal) {
            getVaccinated(anm);
            System.out.println(anm);
        }
    }
    public void getVaccinated(Animal animal) {
        animal.setVaccinated(true);
    }
}
