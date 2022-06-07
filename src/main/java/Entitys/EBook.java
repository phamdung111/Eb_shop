package Entitys;


import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.hibernate.annotations.ColumnDefault;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table (name = "ebook")

public class EBook {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(unique = true)
    private String isbn;

    private String description;

    @ManyToOne
    private Author athorId;

    @ManyToOne
    private Publisher publisherId;

    private Date publicationDate;

    private int pages;

    private Long price;

    private int quantity;

    private boolean deleted;

    public EBook() {
    }

    public EBook(Long id, String title, String isbn, String description, Author athorId, Publisher publisherId, Date publicationDate, int pages, Long price, int quantity, boolean deleted) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.description = description;
        this.athorId = athorId;
        this.publisherId = publisherId;
        this.publicationDate = publicationDate;
        this.pages = pages;
        this.price = price;
        this.quantity = quantity;
        this.deleted = deleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Author getAthorId() {
        return athorId;
    }

    public void setAthorId(Author athorId) {
        this.athorId = athorId;
    }

    public Publisher getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Publisher publisherId) {
        this.publisherId = publisherId;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
