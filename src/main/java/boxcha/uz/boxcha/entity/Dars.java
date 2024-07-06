package boxcha.uz.boxcha.entity;

import javax.persistence.*;

@Entity
public class Dars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "uquvchi_id")
    private Uquvchi uquvchi;

    @ManyToOne
    @JoinColumn(name = "uqituvchi_id")
    private Uqituvchi uqituvchi;

    @ManyToOne
    @JoinColumn(name = "xona_id")
    private Xona xona;

    @ManyToOne
    @JoinColumn(name = "uquv_yili_id")
    private UquvYili uquvYili;

    @ManyToOne
    @JoinColumn(name = "uxlash_id")
    private Uxlash uxlash;

    @ManyToOne
    @JoinColumn(name = "ovqatlanish_id")
    private Ovqatlanish ovqatlanish;

    @ManyToOne
    @JoinColumn(name = "davomat_id")
    private Davomat davomat;

    // Constructors, getters, and setters
    public Dars() {}

    public Dars(Uquvchi uquvchi, Uqituvchi uqituvchi, Xona xona, UquvYili uquvYili, Uxlash uxlash, Ovqatlanish ovqatlanish, Davomat davomat) {
        this.uquvchi = uquvchi;
        this.uqituvchi = uqituvchi;
        this.xona = xona;
        this.uquvYili = uquvYili;
        this.uxlash = uxlash;
        this.ovqatlanish = ovqatlanish;
        this.davomat = davomat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Uquvchi getUquvchi() {
        return uquvchi;
    }

    public void setUquvchi(Uquvchi uquvchi) {
        this.uquvchi = uquvchi;
    }

    public Uqituvchi getUqituvchi() {
        return uqituvchi;
    }

    public void setUqituvchi(Uqituvchi uqituvchi) {
        this.uqituvchi = uqituvchi;
    }

    public Xona getXona() {
        return xona;
    }

    public void setXona(Xona xona) {
        this.xona = xona;
    }

    public UquvYili getUquvYili() {
        return uquvYili;
    }

    public void setUquvYili(UquvYili uquvYili) {
        this.uquvYili = uquvYili;
    }

    public Uxlash getUxlash() {
        return uxlash;
    }

    public void setUxlash(Uxlash uxlash) {
        this.uxlash = uxlash;
    }

    public Ovqatlanish getOvqatlanish() {
        return ovqatlanish;
    }

    public void setOvqatlanish(Ovqatlanish ovqatlanish) {
        this.ovqatlanish = ovqatlanish;
    }

    public Davomat getDavomat() {
        return davomat;
    }

    public void setDavomat(Davomat davomat) {
        this.davomat = davomat;
    }
}
