package com.skiraindustries.dio_class.devweek.Entity;

import javax.persistence.*;

@Entity
public class Incidence {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Integer regionId;
    private Integer month;
    private Long ageGroupId;
    private Integer qtyExams;

    public Incidence(Long id, Integer regionId, Integer month, Long ageGroupId, Integer qtyExams) {
        this.id = id;
        this.regionId = regionId;
        this.month = month;
        this.ageGroupId = ageGroupId;
        this.qtyExams = qtyExams;
    }

    public Incidence() {
    }

    public Long getId() {
        return id;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Long getAgeGroupId() {
        return ageGroupId;
    }

    public void setAgeGroupId(Long ageGroupId) {
        this.ageGroupId = ageGroupId;
    }

    public Integer getQtyExams() {
        return qtyExams;
    }

    public void setQtyExams(Integer qtyExams) {
        this.qtyExams = qtyExams;
    }
}
