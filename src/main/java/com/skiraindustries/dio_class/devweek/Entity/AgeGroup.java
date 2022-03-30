package com.skiraindustries.dio_class.devweek.Entity;

import javax.persistence.*;

@Entity
public class AgeGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    private Long age_groupi;
    private Long age_groupn;
    private String description;

    public AgeGroup(Long id, Long age_groupi, Long age_groupn, String description) {
        this.id = id;
        this.age_groupi = age_groupi;
        this.age_groupn = age_groupn;
        this.description = description;
    }

    public AgeGroup() {}

    public Long getId() {
        return id;
    }

    public Long getAgeGroupI() {
        return age_groupi;
    }

    public void setAgeGroupI(Long age_groupi) {
        this.age_groupi = age_groupi;
    }

    public Long getAgeGroupN() {
        return age_groupn;
    }

    public void setAgeGroupN(Long age_groupn) {
        this.age_groupn = age_groupn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
