package at.spengergasse.med_px.protokolApplied.entities;

import javax.persistence.*;

@Entity
@Table(name = "Dose")
public class NumberDose {
    @Id
    @GeneratedValue
    @Column(name = "dose_id", nullable = false)
    private Long id;

    Integer doseNumberPositiveInt;
    String doseNumberString;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDoseNumberPositiveInt() {
        return doseNumberPositiveInt;
    }

    public void setDoseNumberPositiveInt(Integer doseNumberPositiveInt) {
        this.doseNumberPositiveInt = doseNumberPositiveInt;
    }

    public String getDoseNumberString() {
        return doseNumberString;
    }

    public void setDoseNumberString(String doseNumberString) {
        this.doseNumberString = doseNumberString;
    }
}
