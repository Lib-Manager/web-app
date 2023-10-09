package libmanager.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import libmanager.enumeration.Genre;
import libmanager.enumeration.Type;

import java.util.Date;

@Entity(name = "Product")
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "reference")
    private String reference;

    @Column(name = "type")
    private Type type;

    @Column(name = "genre")
    private Genre genre;

    @Column(name = "autorr")
    private String autor;

    @Column(name = "releaseDate")
    private Date releaseDate;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "productPrice")
    private double productPrice;

    @Column(name = "imageLink")
    private String imageLink;

    @Column(name = "disponibility")
    private boolean disponibility;
}
