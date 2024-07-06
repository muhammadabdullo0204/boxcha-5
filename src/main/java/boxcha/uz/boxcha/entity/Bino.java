package boxcha.uz.boxcha.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private int joylashuv;
    private String maydoni;
    private String nechiQavat;

    public Bino() {
    }

    public Bino(String nom, int joylashuv, String maydoni, String nechiQavat) {
        this.nom = nom;
        this.joylashuv = joylashuv;
        this.maydoni = maydoni;
        this.nechiQavat = nechiQavat;
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

    public int getJoylashuv() {
        return joylashuv;
    }

    public void setJoylashuv(int joylashuv) {
        this.joylashuv = joylashuv;
    }

    public String getMaydoni() {
        return maydoni;
    }

    public void setMaydoni(String maydoni) {
        this.maydoni = maydoni;
    }

    public String getNechiQavat() {
        return nechiQavat;
    }

    public void setNechiQavat(String nechiQavat) {
        this.nechiQavat = nechiQavat;
    }
}
