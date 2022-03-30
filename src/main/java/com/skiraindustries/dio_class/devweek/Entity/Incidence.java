package com.skiraindustries.dio_class.devweek.Entity;

import javax.persistence.*;

@Entity
public class Incidence {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Integer region_id;
    private Integer month;
    private Long age_groupid;
    private Integer qty_exams;

    public Incidence(Long id, Integer region_id, Integer month, Long age_groupid, Integer qty_exams) {
        this.id = id;
        this.region_id = region_id;
        this.month = month;
        this.age_groupid = age_groupid;
        this.qty_exams = qty_exams;
    }

    public Incidence() {
    }

    public Long getId() {
        return id;
    }

    public Integer getRegionId() {
        return region_id;
    }

    public void setRegionId(Integer region_id) {
        this.region_id = region_id;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Long getAgeGroupId() {
        return age_groupid;
    }

    public void setAgeGroupId(Long age_groupid) {
        this.age_groupid = age_groupid;
    }

    public Integer getQtyExams() {
        return qty_exams;
    }

    public void setQtyExams(Integer qty_exams) {
        this.qty_exams = qty_exams;
    }
}
