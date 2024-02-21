package com.exam.cricbuzz.domain;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Plan {

    @Id
    private int id;
    private String name;
    private String description;
    private int actualPrice;
    private int discountPrice;
    private boolean masterPlan;

    public Plan() {
    }

    public int getId() {
        return id;
    }

    public Plan(int id, String name, String description, int actualPrice, int discountPrice, boolean masterPlan) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.actualPrice = actualPrice;
        this.discountPrice = discountPrice;
        this.masterPlan = masterPlan;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(int actualPrice) {
        this.actualPrice = actualPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    public boolean isMasterPlan() {
        return masterPlan;
    }

    public void setMasterPlan(boolean masterPlan) {
        this.masterPlan = masterPlan;
    }
}
