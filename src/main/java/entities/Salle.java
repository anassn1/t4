package entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "salles")
public class Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String code;

    @OneToMany(mappedBy = "salle", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Machine> machines = new ArrayList<>();

    // ✅ Constructeurs
    public Salle() {
    }

    public Salle(String code) {
        this.code = code;
    }

    public Salle(String code, List<Machine> machines) {
        this.code = code;
        this.machines = machines;
    }

    // ✅ Getters et Setters standard (utilisés par Hibernate et ton code)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Machine> getMachines() {
        return machines;
    }

    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }
}
