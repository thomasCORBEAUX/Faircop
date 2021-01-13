package com.emse.spring.faircop.model;

import javax.persistence.*;

@Entity
public class Heater {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    @Enumerated(EnumType.STRING)
    private HeaterStatus heaterStatus;

    private Long power;

    @ManyToOne(optional = false)
    private Room room;

    public Heater() {
    }

    public Heater(String name, HeaterStatus status, Room room) {
        this.heaterStatus = status;
        this.name = name;
        this.room= room;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeaterStatus getHeaterStatus() {
        return heaterStatus;
    }

    public void setHeaterStats(HeaterStatus heaterStatus) {
        this.heaterStatus = heaterStatus;
    }

    public Long getPower() {
        return power;
    }

    public Room getRoom() {
        return room;
    }

    public void setHeaterStatus(HeaterStatus heaterStatus) {
        this.heaterStatus = heaterStatus;
    }

    public void setPower(Long power) {
        this.power = power;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
