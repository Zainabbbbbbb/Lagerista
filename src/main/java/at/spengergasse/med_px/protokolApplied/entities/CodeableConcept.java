package at.spengergasse.med_px.protokolApplied.entities;

import javax.persistence.*;


@Entity
//@Table(name = "codeable_concept")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class CodeableConcept {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToOne(cascade =CascadeType.PERSIST)
    @JoinColumn(name = "coding_id")
    Coding coding;
    String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Coding getCoding() {
        return coding;
    }

    public void setCoding(Coding coding) {
        this.coding = coding;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}