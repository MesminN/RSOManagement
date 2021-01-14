package com.rso.multilayered.dto;

import com.rso.multilayered.utils.Advisor;
import com.rso.multilayered.utils.President;
import com.rso.multilayered.utils.RsoStatus;

public class RsoDTO {

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


    public RsoDTO() {
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
}
