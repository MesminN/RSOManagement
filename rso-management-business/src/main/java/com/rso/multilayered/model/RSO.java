package com.rso.multilayered.model;

import com.rso.multilayered.utils.RsoStatus;
import com.rso.multilayered.utils.StatusAgreement;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RSO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull("Name can't be null")
    private String name;
    private String address;
    private RsoStatus status;
    private String notes;

    // President
    @NotNull("President's name can't be null")
    private String presidentName;
    @NotNull("President's email address can't be null")
    private String presidentAddress;

    //Advisor
    @NotNull("Advisor's name can't be null")
    private String advisorName;
    @NotNull("Advisor's email address can't be null")
    private String advisorAddress;
    @NotNull("Advisor's title can't be null")
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

    @NotNull
    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
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

    @NotNull
    public String getPresidentName() {
        return presidentName;
    }

    public void setPresidentName(@NotNull String presidentName) {
        this.presidentName = presidentName;
    }

    @NotNull
    public String getPresidentAddress() {
        return presidentAddress;
    }

    public void setPresidentAddress(@NotNull String presidentAddress) {
        this.presidentAddress = presidentAddress;
    }

    @NotNull
    public String getAdvisorName() {
        return advisorName;
    }

    public void setAdvisorName(@NotNull String advisorName) {
        this.advisorName = advisorName;
    }

    @NotNull
    public String getAdvisorAddress() {
        return advisorAddress;
    }

    public void setAdvisorAddress(@NotNull String advisorAddress) {
        this.advisorAddress = advisorAddress;
    }

    @NotNull
    public String getAdvisorTitle() {
        return advisorTitle;
    }

    public void setAdvisorTitle(@NotNull String advisorTitle) {
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
