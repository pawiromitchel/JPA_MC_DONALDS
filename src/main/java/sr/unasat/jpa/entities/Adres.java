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

    @OneToOne(mappedBy = "adres")
    private McDonalds mcDonalds;

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

    public McDonalds getMcDonalds() {
        return mcDonalds;
    }

    public void setMcDonalds(McDonalds mcDonalds) {
        this.mcDonalds = mcDonalds;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
