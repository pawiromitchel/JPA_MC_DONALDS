package sr.unasat.jpa.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "adres")
public class Adres {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "adres")
    private List<McDonalds> mcDonaldsList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
