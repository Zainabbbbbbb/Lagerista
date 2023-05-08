package at.spengergasse.med_px.protokolApplied;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Setter
@Getter
@Entity
public class DoseNumber {
    @Id
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
}
