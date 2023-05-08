package at.spengergasse.med_px.symptomlist;

import javax.persistence.*;

@Entity
@Table(name = "symptomlist")
public class Symptomlist {
    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String symptom;

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }
}
