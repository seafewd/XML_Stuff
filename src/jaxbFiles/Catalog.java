
package jaxbFiles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="book">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="publishedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="pages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="chapters" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "book"
})
@XmlRootElement(name = "catalog")
public class Catalog {

    @XmlElement(required = true)
    protected Catalog.Book book;

    /**
     * Gets the value of the book property.
     * 
     * @return
     *     possible object is
     *     {@link Catalog.Book }
     *     
     */
    public Catalog.Book getBook() {
        return book;
    }

    /**
     * Sets the value of the book property.
     * 
     * @param value
     *     allowed object is
     *     {@link Catalog.Book }
     *     
     */
    public void setBook(Catalog.Book value) {
        this.book = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="publishedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="pages" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="chapters" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "title",
        "author",
        "publishedDate",
        "pages",
        "chapters"
    })
    public static class Book {

        @XmlElement(required = true)
        protected String title;
        @XmlElement(required = true)
        protected String author;
        @XmlElement(required = true)
        protected String publishedDate;
        protected int pages;
        protected int chapters;

        /**
         * Gets the value of the title property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * Gets the value of the author property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthor() {
            return author;
        }

        /**
         * Sets the value of the author property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthor(String value) {
            this.author = value;
        }

        /**
         * Gets the value of the publishedDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPublishedDate() {
            return publishedDate;
        }

        /**
         * Sets the value of the publishedDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPublishedDate(String value) {
            this.publishedDate = value;
        }

        /**
         * Gets the value of the pages property.
         * 
         */
        public int getPages() {
            return pages;
        }

        /**
         * Sets the value of the pages property.
         * 
         */
        public void setPages(int value) {
            this.pages = value;
        }

        /**
         * Gets the value of the chapters property.
         * 
         */
        public int getChapters() {
            return chapters;
        }

        /**
         * Sets the value of the chapters property.
         * 
         */
        public void setChapters(int value) {
            this.chapters = value;
        }

    }

}
