package me.abebe.demo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name ="day_names")
public class DayNames {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "female_name")
    private String femaleName;

    @Column(name = "male_name")
    private String maleName;

    @Column( name = "days")
    private String days;

    @ManyToOne(fetch = FetchType.EAGER)
    private AppUser users;


    public DayNames() {
        this.users = users;
    }

    public DayNames(String femaleName, String maleName, String days, AppUser users) {
        this.femaleName = femaleName;
        this.maleName = maleName;
        this.days = days;
        this.users = users;
    }


    @Override
    public String toString() {
        return "DayNames{" +
                "id=" + id +
                ", femaleName='" + femaleName + '\'' +
                ", maleName='" + maleName + '\'' +
                ", days='" + days + '\'' +
                ", users=" + users +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFemaleName() {
        return femaleName;
    }

    public void setFemaleName(String femaleName) {
        this.femaleName = femaleName;
    }

    public String getMaleName() {
        return maleName;
    }

    public void setMaleName(String maleName) {
        this.maleName = maleName;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public AppUser getUsers() {
        return users;
    }

    public void setUsers(AppUser users) {
        this.users = users;
    }
}
