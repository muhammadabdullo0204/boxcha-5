package boxcha.uz.boxcha.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Uqituvchi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ism;
    private String familiya;
    private String sharif;
    private int yosh;
    private String jins;
    private int maosh;
    private int ishvaqti;

    public Uqituvchi() {
    }

    public Uqituvchi(Long id, String ism, String familiya, String sharif, int yosh, String jins, int maosh, int ishvaqti) {
        this.id = id;
        this.ism = ism;
        this.familiya = familiya;
        this.sharif = sharif;
        this.yosh = yosh;
        this.jins = jins;
        this.maosh = maosh;
        this.ishvaqti = ishvaqti;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsm() {
        return ism;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }

    public String getFamiliya() {
        return familiya;
    }

    public void setFamiliya(String familiya) {
        this.familiya = familiya;
    }

    public String getSharif() {
        return sharif;
    }

    public void setSharif(String sharif) {
        this.sharif = sharif;
    }

    public int getYosh() {
        return yosh;
    }

    public void setYosh(int yosh) {
        this.yosh = yosh;
    }

    public String getJins() {
        return jins;
    }

    public void setJins(String jins) {
        this.jins = jins;
    }

    public int getMaosh() {
        return maosh;
    }

    public void setMaosh(int maosh) {
        this.maosh = maosh;
    }

    public int getIshvaqti() {
        return ishvaqti;
    }

    public void setIshvaqti(int ishvaqti) {
        this.ishvaqti = ishvaqti;
    }
}
