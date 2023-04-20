package TaskNo3;

import java.util.ArrayList;

public class CDListSimulator {
    public static void main(String[] args) {
        ListCDs cdList = new ListCDs();

        CD cd1 = new CD("John Lennon", "Imagine", 1971, 9.99);
        CD cd2 = new CD("The Beatles", "Abbey Road", 1969, 14.99);
        CD cd3 = new CD("Bob Dylan", "Highway 61 Revisited", 1965, 11.99);

        cdList.addCD(cd1);
        cdList.addCD(cd2);
        cdList.addCD(cd3);

        cdList.printCDs();
        System.out.println("Total price: $" + cdList.getTotalPrice());

        System.out.println("\nCDs by John Lennon:");
        ArrayList<CD> johnLennonCds = cdList.getCdsByAuthor("John Lennon");
        for (CD cd : johnLennonCds) {
            System.out.println(cd.getTitle() + " (" + cd.getPublicationYear() + ") - $" + cd.getPrice());
        }
    }
}
