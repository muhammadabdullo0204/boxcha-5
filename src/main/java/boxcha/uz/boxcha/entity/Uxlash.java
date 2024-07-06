package boxcha.uz.boxcha.entity;

import javax.persistence.*;

@Entity
public class Uxlash {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int vaqt;
    private int davomiyligi;
    private int jamiOquvchiSoni;
    private int uxlaganOquvchiSoni;
    private int uxlamaganOquvchiSoni;

    public Uxlash() {
    }

    public Uxlash(Long id, int vaqt, int davomiyligi, int jamiOquvchiSoni, int uxlaganOquvchiSoni, int uxlamaganOquvchiSoni) {
        this.id = id;
        this.vaqt = vaqt;
        this.davomiyligi = davomiyligi;
        this.jamiOquvchiSoni = jamiOquvchiSoni;
        this.uxlaganOquvchiSoni = uxlaganOquvchiSoni;
        this.uxlamaganOquvchiSoni = uxlamaganOquvchiSoni;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVaqt() {
        return vaqt;
    }

    public void setVaqt(int vaqt) {
        this.vaqt = vaqt;
    }

    public int getDavomiyligi() {
        return davomiyligi;
    }

    public void setDavomiyligi(int davomiyligi) {
        this.davomiyligi = davomiyligi;
    }

    public int getJamiOquvchiSoni() {
        return jamiOquvchiSoni;
    }

    public void setJamiOquvchiSoni(int jamiOquvchiSoni) {
        this.jamiOquvchiSoni = jamiOquvchiSoni;
    }

    public int getUxlaganOquvchiSoni() {
        return uxlaganOquvchiSoni;
    }

    public void setUxlaganOquvchiSoni(int uxlaganOquvchiSoni) {
        this.uxlaganOquvchiSoni = uxlaganOquvchiSoni;
    }

    public int getUxlamaganOquvchiSoni() {
        return uxlamaganOquvchiSoni;
    }

    public void setUxlamaganOquvchiSoni(int uxlamaganOquvchiSoni) {
        this.uxlamaganOquvchiSoni = uxlamaganOquvchiSoni;
    }
}
