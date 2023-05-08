package at.spengergasse.med_px.protokolApplied.entities;

import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "coding")
public class Coding {
    @Id
    @GeneratedValue
    private Long id;
    String system;
    String code;
    String display;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
