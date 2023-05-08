package at.spengergasse.med_px.Period;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Period {
    @Id
    @Column(name="id", nullable = false)
    private long id;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Date start;
    public Date end;
}
