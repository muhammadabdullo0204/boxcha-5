package boxcha.uz.boxcha.entity;

import javax.persistence.*;

@Entity
public class Ovqatlanish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name = "soat")
    private int soat;
    @Column(name = "davomiyligi")
    private int davomiyligi;
    @Column(name = "ovqat")
    private String ovqat;

    public Ovqatlanish() {}

    public Ovqatlanish(Long id, int soat, int davomiyligi, String ovqat) {
        this.id = id;
        this.soat = soat;
        this.davomiyligi = davomiyligi;
        this.ovqat = ovqat;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSoat() {
        return soat;
    }

    public void setSoat(int soat) {
        this.soat = soat;
    }

    public int getDavomiyligi() {
        return davomiyligi;
    }

    public void setDavomiyligi(int davomiyligi) {
        this.davomiyligi = davomiyligi;
    }

    public String getOvqat() {
        return ovqat;
    }

    public void setOvqat(String ovqat) {
        this.ovqat = ovqat;
    }
}
