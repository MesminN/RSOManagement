package com.rso.multilayered.model;

import com.rso.multilayered.utils.Advisor;
import com.rso.multilayered.utils.President;
import com.rso.multilayered.utils.RsoStatus;

import java.util.Objects;

public class RSO {

    private int id;
    private String name;
    private String address;
    private RsoStatus status;
    private String notes;
    private President president;
    private Advisor advisor;
    private boolean isRenewed;
    private boolean osRosterSubmitted;
    private boolean isRoomReserved;
    private boolean isOnWebsite;
    private boolean isAddedToAdvocate;

    public RSO() {
    }

    public int getId() {
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

    public boolean isRenewed() {
        return isRenewed;
    }

    public void setRenewed(boolean renewed) {
        isRenewed = renewed;
    }

    public boolean isOsRosterSubmitted() {
        return osRosterSubmitted;
    }

    public void setOsRosterSubmitted(boolean osRosterSubmitted) {
        this.osRosterSubmitted = osRosterSubmitted;
    }

    public boolean isRoomReserved() {
        return isRoomReserved;
    }

    public void setRoomReserved(boolean roomReserved) {
        isRoomReserved = roomReserved;
    }

    public boolean isOnWebsite() {
        return isOnWebsite;
    }

    public void setOnWebsite(boolean onWebsite) {
        isOnWebsite = onWebsite;
    }

    public boolean isAddedToAdvocate() {
        return isAddedToAdvocate;
    }

    public void setAddedToAdvocate(boolean addedToAdvocate) {
        isAddedToAdvocate = addedToAdvocate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RSO)) return false;
        RSO RSO = (RSO) o;
        return getId() == RSO.getId() &&
                isRenewed() == RSO.isRenewed() &&
                isOsRosterSubmitted() == RSO.isOsRosterSubmitted() &&
                isRoomReserved() == RSO.isRoomReserved() &&
                isOnWebsite() == RSO.isOnWebsite() &&
                isAddedToAdvocate() == RSO.isAddedToAdvocate() &&
                getName().equals(RSO.getName()) &&
                Objects.equals(getAddress(), RSO.getAddress()) &&
                getStatus() == RSO.getStatus() &&
                Objects.equals(getNotes(), RSO.getNotes()) &&
                Objects.equals(getPresident(), RSO.getPresident()) &&
                Objects.equals(getAdvisor(), RSO.getAdvisor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAddress(), getStatus(), getNotes(), getPresident(), getAdvisor(), isRenewed(), isOsRosterSubmitted(), isRoomReserved(), isOnWebsite(), isAddedToAdvocate());
    }
}
