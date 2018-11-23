package sr.unasat.jpa.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "mc_donald")
public class McDonalds {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "phone", nullable = false)
    private String phoneNumber;

    @Column(name = "code", unique = true, nullable = false)
    private String code;

    @ManyToOne
    @JoinColumn(name = "adres_id")
    private Adres adres;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToMany
    private Set<Employee> employees = new HashSet<Employee>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String address) {
        this.name = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "McDonalds{" +
                "id=" + id +
                ", address=" + name +
                ", phoneNumber=" + phoneNumber +
                ", code=" + code +
                ", " + city.toString() + '}';
    }
}
