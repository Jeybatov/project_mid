package ada.edu.project.Library.domain;


import javax.persistence.*;

@Entity
@Table (name = "books")
public class Book{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id")
    private Integer id;
    @Column (name = "name")
    private String name;
    @Column (name = "author")
    private String author;
    @Column (name = "category")
    private String category;
    @Column (name = "date")
    private String date;
    @Column (name = "Availability")
    private String Availability;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAvailability() {
        return Availability;
    }

    public void setAvailability(String availability) {
        Availability = availability;
    }
}
