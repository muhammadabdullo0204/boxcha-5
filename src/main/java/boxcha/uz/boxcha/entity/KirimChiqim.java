package boxcha.uz.boxcha.entity;
import javax.persistence.*;

@Entity
public class KirimChiqim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "foyda")
    private int foyda;
    @Column(name = "zarar")
    private int zarar;
    @Column(name = "jamiMablag")
    private  int jamiMablag;

    public KirimChiqim() {
    }

    public KirimChiqim(Long id, int foyda, int zarar, int jamimablag) {
        this.id = id;
        this.foyda = foyda;
        this.zarar = zarar;
        this.jamiMablag = jamimablag;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFoyda() {
        return foyda;
    }

    public void setFoyda(int foyda) {
        this.foyda = foyda;
    }

    public int getZarar() {
        return zarar;
    }

    public void setZarar(int zarar) {
        this.zarar = zarar;
    }

    public int getJamimablag() {
        return jamiMablag;
    }

    public void setJamimablag(int jamimablag) {
        this.jamiMablag = jamimablag;
    }
}
