package TaskNo3;

import java.util.ArrayList;

public class ListCDs {
    private ArrayList<CD> cds;

    public ListCDs() {
        cds = new ArrayList<>();
    }

    public void addCD(CD cd) {
        cds.add(cd);
    }

    public void removeCD(CD cd) {
        cds.remove(cd);
    }

    public void printCDs() {
        for (CD cd : cds) {
            System.out.println(cd.getAuthor() + " - " + cd.getTitle() + " (" + cd.getPublicationYear() + ") - $" + cd.getPrice());
        }
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (CD cd : cds) {
            totalPrice += cd.getPrice();
        }
        return totalPrice;
    }

    public ArrayList<CD> getCdsByAuthor(String author) {
        ArrayList<CD> result = new ArrayList<>();
        for (CD cd : cds) {
            if (cd.getAuthor().equals(author)) {
                result.add(cd);
            }
        }
        return result;
    }
}
