package TaskNo8Polymorphism;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */
public class JohnDoe {
    public String check(Object o) {
        if (o instanceof Whale) {
            return "Whale";
        }
        if (o instanceof Cow) {
            return "Cow";
        }
        if (o instanceof Dog) {
            return "Dog";
        }else {
            return "unknown animal";
        }
    }
}
