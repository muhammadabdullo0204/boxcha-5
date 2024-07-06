package boxcha.uz.boxcha.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;


import javax.validation.constraints.Size;
import java.util.Set;


@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String ism;

    @Column(nullable = false)
    private String familiya;

    @Size(max = 30 ,min = 6)
    @NotNull
    @Column(nullable = false)
    private String login;

    @Size(max = 30 ,min = 6)
    @NotNull
    @Column(nullable = false)
    private String parol;


    @ElementCollection(targetClass = Lavozim.class ,fetch = FetchType.EAGER)
    @CollectionTable(name = "user_lavozim",
            joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "lavozim_id")
    private Set<Lavozim> lavozimlar;



    private Boolean active;


    public User() {
    }

    public User(Long id, String ism, String familiya, String login, String parol, Boolean active) {
        this.id = id;
        this.ism = ism;
        this.familiya = familiya;
        this.login = login;
        this.parol = parol;
        this.active = active;
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

    public @Size(max = 30, min = 6) String getLogin() {
        return login;
    }

    public void setLogin(@Size(max = 30, min = 6) String login) {
        this.login = login;
    }

    public @Size(max = 30, min = 6) String getParol() {
        return parol;
    }

    public void setParol(@Size(max = 30, min = 6) String parol) {
        this.parol = parol;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Set<Lavozim> getLavozimlar() {
        return lavozimlar;
    }

    public void setLavozimlar(Set<Lavozim> lavozimlar) {
        this.lavozimlar = lavozimlar;
    }
}
