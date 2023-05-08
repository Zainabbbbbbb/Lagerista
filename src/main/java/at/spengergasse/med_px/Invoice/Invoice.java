package at.spengergasse.med_px.Invoice;

import javax.persistence.*;

@Entity
public class Invoice {
    public enum Status {draft, issued, balanced, cancelled, enteredinerror};

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public Status status;

    public String cancelledReaseon;
}
