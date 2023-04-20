package TaskNo3;

/**
 * Created by Admin on 4/20/2023
 *
 * @author : Admin
 * @date : 4/20/2023
 * @project : PowerItIntern
 */
import java.util.ArrayList;

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
}

