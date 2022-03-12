package com.skiraindustries.dio_class.devweek.Entity;
import javax.persistence.*;

@Entity
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    private String region;
    private Long qty_exams;

    public Region(Long id, String region, Long qty_exams) {
        this.id = id;
        this.region = region;
        this.qty_exams = qty_exams;
    }

    public Region(String region, Long qty_exams) {
        this.region = region;
        this.qty_exams = qty_exams;
    }

    public Region(){}

    public Long getId() {
        return id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Long getQty_exams() {
        return qty_exams;
    }

    public void setQty_exams(Long qty_exams) {
        this.qty_exams = qty_exams;
    }
}
