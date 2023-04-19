package TaskNo3;

/**
 * Created by Admin on 4/19/2023
 *
 * @author : Admin
 * @date : 4/19/2023
 * @project : Dynamic arrays Java StreamAPI
 */
public class CD {

    private String author;
    private String title;
    private int publicationYear;
    private double price;

    public CD(String author, String title, int publicationYear, double price) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return author + " - " + title + " (" + publicationYear + ") - $" + price;
    }
}

