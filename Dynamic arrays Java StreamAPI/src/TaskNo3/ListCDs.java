package TaskNo3;

/**
 * Created by Admin on 4/19/2023
 *
 * @author : Admin
 * @date : 4/19/2023
 * @project : Dynamic arrays Java StreamAPI
 */
import java.util.ArrayList;

public class ListCDs {

    private ArrayList<CD> cds;

    public ListCDs() {
        cds = new ArrayList<CD>();
    }

    public void addCD(CD cd) {
        cds.add(cd);
    }

    public void removeCD(int index) {
        cds.remove(index);
    }

    public void printCDs() {
        for (CD cd : cds) {
            System.out.println(cd);
        }
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (CD cd : cds) {
            totalPrice += cd.getPrice();
        }
        return totalPrice;
    }

    public ArrayList<CD> getCDsByAuthor(String author) {
        ArrayList<CD> cdsByAuthor = new ArrayList<CD>();
        for (CD cd : cds) {
            if (cd.getAuthor().equals(author)) {
                cdsByAuthor.add(cd);
            }
        }
        return cdsByAuthor;
    }
}

