package at.spengergasse.med_px.therapyrooms;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
@Table(name="therapyrooms")
public class TherapyEntitie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer raumid;
    private String raumname;
    private Integer raumgroese;
    private String sonstiges;

    public TherapyEntitie(Integer raumid, String raumname, Integer raumgroese, String sonstiges) {
        this.raumid = raumid;
        this.raumname = raumname;
        this.raumgroese = raumgroese;
        this.sonstiges = sonstiges;
    }

    public TherapyEntitie(){

    }

    @Override
    public String toString() {
        return "TherapyEntitie{" +
                "raumid=" + raumid +
                ", raumname=" + raumname +
                ", raumgroese=" + raumgroese +
                ", sonstiges='" + sonstiges + '\'' +
                '}';
    }

    public Integer getRaumid() {
        return raumid;
    }

    public void setRaumid(Integer raumid) {
        this.raumid = raumid;
    }

    public String getRaumname() {
        return raumname;
    }

    public void setRaumname(String raumname) {
        this.raumname = raumname;
    }

    public Integer getRaumgroese() {
        return raumgroese;
    }

    public void setRaumgroese(Integer raumgroese) {
        this.raumgroese = raumgroese;
    }

    public String getSonstiges() {
        return sonstiges;
    }

    public void setSonstiges(String sonstiges) {
        this.sonstiges = sonstiges;
    }
}