package com.skiraindustries.dio_class.devweek.Entity;

import javax.persistence.*;

@Entity
public class AgeGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    private Long ageGroupI;
    private Long ageGroupN;
    private String description;

    public AgeGroup(Long id, Long ageGroupI, Long ageGroupN, String description) {
        this.id = id;
        this.ageGroupI = ageGroupI;
        this.ageGroupN = ageGroupN;
        this.description = description;
    }

    public AgeGroup() {}

    public Long getId() {
        return id;
    }

    public Long getAgeGroupI() {
        return ageGroupI;
    }

    public void setAgeGroupI(Long ageGroupI) {
        this.ageGroupI = ageGroupI;
    }

    public Long getAgeGroupN() {
        return ageGroupN;
    }

    public void setAgeGroupN(Long ageGroupN) {
        this.ageGroupN = ageGroupN;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
