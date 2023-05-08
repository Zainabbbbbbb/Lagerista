package at.spengergasse.med_px.protokolApplied.entities;

import javax.persistence.*;

@Entity
@Table(name = "series_doses")
public class DosesSeries {
    @Id
    @GeneratedValue
    private Long id;
    Integer seriesDosesPositivInt;
    String seriesDosesString;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSeriesDosesPositivInt() {
        return seriesDosesPositivInt;
    }

    public void setSeriesDosesPositivInt(Integer seriesDosesPositivInt) {
        this.seriesDosesPositivInt = seriesDosesPositivInt;
    }

    public String getSeriesDosesString() {
        return seriesDosesString;
    }

    public void setSeriesDosesString(String seriesDosesString) {
        this.seriesDosesString = seriesDosesString;
    }
}