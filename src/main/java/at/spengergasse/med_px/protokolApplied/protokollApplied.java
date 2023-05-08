package at.spengergasse.med_px.protokolApplied;

import at.spengergasse.med_px.protokolApplied.entities.NumberDose;
import at.spengergasse.med_px.protokolApplied.entities.DosesSeries;
import at.spengergasse.med_px.protokolApplied.entities.DiseaseTarget;

import javax.persistence.*;

@Entity
public class protokollApplied {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;
    String series;
    String authority;
    @OneToOne(cascade =CascadeType.PERSIST)
    DiseaseTarget targetDisease;
    @OneToOne(cascade =CascadeType.PERSIST)
    NumberDose doseNumber;
    @OneToOne(cascade =CascadeType.PERSIST)
    DosesSeries seriesDoses;

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public DiseaseTarget getTargetDisease() {
        return targetDisease;
    }

    public void setTargetDisease(DiseaseTarget targetDisease) {
        this.targetDisease = targetDisease;
    }

    public NumberDose getDoseNumber() {
        return doseNumber;
    }

    public void setDoseNumber(NumberDose numberDose) {
        this.doseNumber = numberDose;
    }

    public DosesSeries getSeriesDoses() {
        return seriesDoses;
    }

    public void setSeriesDoses(DosesSeries seriesDoses) {
        this.seriesDoses = seriesDoses;
    }
}
