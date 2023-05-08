package at.spengergasse.med_px.protokolApplied.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Code {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    String version;
    String display;

    boolean userSelected;

    String system;
    String code;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public boolean isUserSelected() {
        return userSelected;
    }

    public void setUserSelected(boolean userSelected) {
        this.userSelected = userSelected;
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
}
