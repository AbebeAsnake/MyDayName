package me.abebe.demo;

import javax.persistence.*;

@Entity
@Table(name = "zodiac")
public class Zodiac {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;

    @Column(name = "month")
    private long yearStart;

    @Column(name = "image")
    private String image;

    @Column(name = "lucky_numbers")
    private String luckyNumbers;

    @Column( name = "lucky_colors")
    private String luckyColors;

    @Column(name = "lucky_flowers")
    private String luckyFlowers;

    public Zodiac(String name, Long yearStart, String image, String luckyNumbers, String luckyColors, String luckyFlowers) {
        this.name = name;
        this.yearStart = yearStart;
        this.image = image;
        this.luckyNumbers = luckyNumbers;
        this.luckyColors = luckyColors;
        this.luckyFlowers = luckyFlowers;
    }

    public Zodiac() {
    }

    @Override
    public String toString() {
        return "Zodiac{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", month='" + yearStart + '\'' +
                ", image='" + image + '\'' +
                '}';
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getYearStart() {
        return yearStart;
    }

    public void setYearStart(long yearStart) {
        this.yearStart = yearStart;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    public String getLuckyNumbers() {
        return luckyNumbers;
    }

    public void setLuckyNumbers(String luckyNumbers) {
        this.luckyNumbers = luckyNumbers;
    }

    public String getLuckyColors() {
        return luckyColors;
    }

    public void setLuckyColors(String luckyColors) {
        this.luckyColors = luckyColors;
    }

    public String getLuckyFlowers() {
        return luckyFlowers;
    }

    public void setLuckyFlowers(String luckyFlowers) {
        this.luckyFlowers = luckyFlowers;
    }
}
