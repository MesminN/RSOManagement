package com.rso.multilayered.model;

import com.rso.multilayered.utils.RsoStatus;
import com.rso.multilayered.utils.StatusAgreement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class RSO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull(message = "Name can't be null")
    private String name;
    private String address;
    private RsoStatus status;
    private String notes;

    // President
    @NotNull(message = "President's name can't be null")
    private String presidentName;
    @NotNull(message = "President's email address can't be null")
    private String presidentAddress;

    //Advisor
    @NotNull(message = "Advisor's name can't be null")
    private String advisorName;
    @NotNull(message = "Advisor's email address can't be null")
    private String advisorAddress;
    @NotNull(message = "Advisor's title can't be null")
    private String advisorTitle;
    private String advisorPhoneNumber;
    private StatusAgreement advisorStatusAgreement;

    // booleans
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

    public String getPresidentName() {
        return presidentName;
    }

    public void setPresidentName(String presidentName) {
        this.presidentName = presidentName;
    }

    public String getPresidentAddress() {
        return presidentAddress;
    }

    public void setPresidentAddress(String presidentAddress) {
        this.presidentAddress = presidentAddress;
    }

    public String getAdvisorName() {
        return advisorName;
    }

    public void setAdvisorName(String advisorName) {
        this.advisorName = advisorName;
    }

    public String getAdvisorAddress() {
        return advisorAddress;
    }

    public void setAdvisorAddress(String advisorAddress) {
        this.advisorAddress = advisorAddress;
    }

    public String getAdvisorTitle() {
        return advisorTitle;
    }

    public void setAdvisorTitle(String advisorTitle) {
        this.advisorTitle = advisorTitle;
    }

    public String getAdvisorPhoneNumber() {
        return advisorPhoneNumber;
    }

    public void setAdvisorPhoneNumber(String advisorPhoneNumber) {
        this.advisorPhoneNumber = advisorPhoneNumber;
    }

    public StatusAgreement getAdvisorStatusAgreement() {
        return advisorStatusAgreement;
    }

    public void setAdvisorStatusAgreement(StatusAgreement advisorStatusAgreement) {
        this.advisorStatusAgreement = advisorStatusAgreement;
    }
}
