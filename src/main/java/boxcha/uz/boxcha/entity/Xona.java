package boxcha.uz.boxcha.entity;

import javax.persistence.*;

@Entity
public class Xona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom", columnDefinition = "VARCHAR(255)")
    private String nom;

    private String sigimi;
    private String jihozlar;

    public Xona() {
    }

    public Xona(Long id, String nom, String sigimi, String jihozlar) {
        this.id = id;
        this.nom = nom;
        this.sigimi = sigimi;
        this.jihozlar = jihozlar;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSigimi() {
        return sigimi;
    }

    public void setSigimi(String sigimi) {
        this.sigimi = sigimi;
    }

    public String getJihozlar() {
        return jihozlar;
    }

    public void setJihozlar(String jihozlar) {
        this.jihozlar = jihozlar;
    }
}
