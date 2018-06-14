package BookCatalog;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"catalog"})
@XmlRootElement(name = "catalog")
public class Catalog {

    @XmlElement(required = true)
    List<Book> catalog;

    public Catalog() {
        catalog = new ArrayList<>();
        catalog.add(new Book("Test1", "Alex", "today", 490, 35));
        catalog.add(new Book("kurri", "Alex", "today", 490, 35));
        catalog.add(new Book("Flesket", "Alex", "today", 490, 35));
        catalog.add(new Book("The Cent", "Alex", "today", 490, 35));
        catalog.add(new Book("Fisker", "Alex", "today", 490, 35));
        catalog.add(new Book("Korpas", "Alex", "today", 490, 35));
        catalog.add(new Book("Lol", "Alex", "today", 490, 35));
        catalog.add(new Book("Test1", "Alex", "today", 490, 35));

        for (Book b : catalog) {
            System.out.println("Added " + b.getTitle() + " to list of books.");
        }
    }

    public static void main(String[] args) {
        Catalog catalog = new Catalog();
    }

}
