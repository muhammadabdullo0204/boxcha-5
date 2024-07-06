package boxcha.uz.boxcha.entity;

import javax.persistence.*;

@Entity
public class Davomat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "kelganlar_soni")
    private Integer kelganlarSoni;

    @Column(name = "kelmaganlar_soni")
    private Integer kelmaganlarSoni;

    @Column(name = "jami_oquvchilar")
    private Integer jamiOquvchilar;

    public Davomat() {}

    public Davomat(Long id, Integer kelganlarSoni, Integer kelmaganlarSoni, Integer jamiOquvchilar) {
        this.id = id;
        this.kelganlarSoni = kelganlarSoni;
        this.kelmaganlarSoni = kelmaganlarSoni;
        this.jamiOquvchilar = jamiOquvchilar;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getKelganlarSoni() {
        return kelganlarSoni;
    }

    public void setKelganlarSoni(Integer kelganlarSoni) {
        this.kelganlarSoni = kelganlarSoni;
    }

    public Integer getKelmaganlarSoni() {
        return kelmaganlarSoni;
    }

    public void setKelmaganlarSoni(Integer kelmaganlarSoni) {
        this.kelmaganlarSoni = kelmaganlarSoni;
    }

    public Integer getJamiOquvchilar() {
        return jamiOquvchilar;
    }

    public void setJamiOquvchilar(Integer jamiOquvchilar) {
        this.jamiOquvchilar = jamiOquvchilar;
    }
}
