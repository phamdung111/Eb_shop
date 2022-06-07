package Entitys;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;
    private String website;
    private String founder;

    @NotNull
    private int foundedYear;

    @NotNull
    private String address;

    public Publisher() {
    }

    public Publisher(Long id, String name, String website, String founder, int foundedYear, String address) {
        this.id = id;
        this.name = name;
        this.website = website;
        this.founder = founder;
        this.foundedYear = foundedYear;
        this.address = address;
    }
}
