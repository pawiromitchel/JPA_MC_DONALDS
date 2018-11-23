package sr.unasat.jpa.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @ManyToMany
    @JoinTable(name="emp_filiaal",
    joinColumns=@JoinColumn(name="employee_id"),
    inverseJoinColumns=@JoinColumn(name="mc_donald_id"))
    private Set<McDonalds> mcDonalds = new HashSet<McDonalds>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Set<McDonalds> getMcDonalds() {
        return mcDonalds;
    }

    public void setMcDonalds(Set<McDonalds> mcDonalds) {
        this.mcDonalds = mcDonalds;
    }
}
