package boxcha.uz.boxcha.entity;

import javax.persistence.*;

@Entity
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ism;

    @Column(name = "familya")
    private String familya;

    @Column(name = "sharif")
    private String sharif;

    @Column(name = "yosh")
    private int yosh;

    @Column(name = "jins")
    private String jins;

    @Column(name = "maosh")
    private int maosh;

    public Director() {
    }

    public Director(Long id, String ism, String familya, String sharif, int yosh, String jins, int maosh) {
        this.id = id;
        this.ism = ism;
        this.familya = familya;
        this.sharif = sharif;
        this.yosh = yosh;
        this.jins = jins;
        this.maosh = maosh;
    }

    // Getters and setters
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

    public String getFamilya() {
        return familya;
    }

    public void setFamilya(String familya) {
        this.familya = familya;
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
}
