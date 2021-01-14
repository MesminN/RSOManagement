package com.rso.multilayered.model;

import com.rso.multilayered.utils.Advisor;
import com.rso.multilayered.utils.President;
import com.rso.multilayered.utils.RsoStatus;

import java.util.Objects;

public class RSO {

    private Integer id;
    private String name;
    private String address;
    private RsoStatus status;
    private String notes;
    private President president;
    private Advisor advisor;
    private Boolean isRenewed;
    private Boolean osRosterSubmitted;
    private Boolean isRoomReserved;
    private Boolean isOnWebsite;
    private Boolean isAddedToAdvocate;

    public RSO() {
    }

    public Integer getId() {
        return id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public RsoStatus getStatus() {
        return status;
    }

    public void setStatus(RsoStatus status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public President getPresident() {
        return president;
    }

    public void setPresident(President president) {
        this.president = president;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public Boolean isRenewed() {
        return isRenewed;
    }

    public void setRenewed(boolean renewed) {
        isRenewed = renewed;
    }

    public Boolean isOsRosterSubmitted() {
        return osRosterSubmitted;
    }

    public void setOsRosterSubmitted(boolean osRosterSubmitted) {
        this.osRosterSubmitted = osRosterSubmitted;
    }

    public Boolean isRoomReserved() {
        return isRoomReserved;
    }

    public void setRoomReserved(boolean roomReserved) {
        isRoomReserved = roomReserved;
    }

    public Boolean isOnWebsite() {
        return isOnWebsite;
    }

    public void setOnWebsite(boolean onWebsite) {
        isOnWebsite = onWebsite;
    }

    public Boolean isAddedToAdvocate() {
        return isAddedToAdvocate;
    }

    public void setAddedToAdvocate(boolean addedToAdvocate) {
        isAddedToAdvocate = addedToAdvocate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RSO)) return false;
        RSO rso = (RSO) o;
        return getId().equals(rso.getId()) &&
                getName().equals(rso.getName()) &&
                Objects.equals(getAddress(), rso.getAddress()) &&
                getStatus() == rso.getStatus() &&
                Objects.equals(getPresident(), rso.getPresident()) &&
                Objects.equals(getAdvisor(), rso.getAdvisor()) &&
                Objects.equals(isRenewed, rso.isRenewed) &&
                Objects.equals(osRosterSubmitted, rso.osRosterSubmitted) &&
                Objects.equals(isRoomReserved, rso.isRoomReserved) &&
                Objects.equals(isOnWebsite, rso.isOnWebsite) &&
                Objects.equals(isAddedToAdvocate, rso.isAddedToAdvocate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAddress(), getStatus(), getPresident(), getAdvisor());
    }
}
