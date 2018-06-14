package BookCatalog;

import javax.xml.bind.annotation.*;


public class Book {

    @XmlElement(required = true)
    private String title, author, publishedDate;
    @XmlElement(required = true)
    private int pages, chapters;

    public Book() {}

    public Book(String title, String author, String publishedDate, int pages, int chapters) {
        this.title = title;
        this.author = author;
        this.publishedDate = publishedDate;
        this.pages = pages;
        this.chapters = chapters;
    }

    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }


    public String getPublishedDate() {
        return publishedDate;
    }


    public int getPages() {
        return pages;
    }


    public int getChapters() {
        return chapters;
    }

}
