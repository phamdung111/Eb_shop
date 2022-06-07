package Entitys;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    private int yearOfBirth;
    private String description;
    private String website;
    private String organization;

    public Author() {
    }

    public Author(Long id, String firstName, String lastName, int yearOfBirth, String description, String website, String organization) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.description = description;
        this.website = website;
        this.organization = organization;
    }
}
