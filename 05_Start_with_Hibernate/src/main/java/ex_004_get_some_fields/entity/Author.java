package ex_004_get_some_fields.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@DynamicUpdate // изменит только те значения, которые реально изменились, а не всё, что передаём
@DynamicInsert
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String name;

    @Column(name = "last_name")
    private String lastName;


    public Author(long id, String name) {
        this.id = id;
        this.lastName = name;
    }

    public Author(String name) {
        this.name = name;
    }

    public Author(long id) {
        this.id = id;
    }

    public Author() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
