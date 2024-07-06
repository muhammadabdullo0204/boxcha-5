package boxcha.uz.boxcha.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class UquvYili {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate boshlanganVaqt;
    private LocalDate tugaganVaqt;
    private int jamiOquvchilar;
    private String izoh;

    public UquvYili() {
    }

    public UquvYili(Long id, LocalDate boshlanganVaqt, LocalDate tugaganVaqt, int jamiOquvchilar, String izoh) {
        this.id = id;
        this.boshlanganVaqt = boshlanganVaqt;
        this.tugaganVaqt = tugaganVaqt;
        this.jamiOquvchilar = jamiOquvchilar;
        this.izoh = izoh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getBoshlanganVaqt() {
        return boshlanganVaqt;
    }

    public void setBoshlanganVaqt(LocalDate boshlanganVaqt) {
        this.boshlanganVaqt = boshlanganVaqt;
    }

    public LocalDate getTugaganVaqt() {
        return tugaganVaqt;
    }

    public void setTugaganVaqt(LocalDate tugaganVaqt) {
        this.tugaganVaqt = tugaganVaqt;
    }

    public int getJamioquvchilar() {
        return jamiOquvchilar;
    }

    public void setJamioquvchilar(int jamioquvchilar) {
        this.jamiOquvchilar = jamioquvchilar;
    }

    public String getIzoh() {
        return izoh;
    }

    public void setIzoh(String izoh) {
        this.izoh = izoh;
    }
}
