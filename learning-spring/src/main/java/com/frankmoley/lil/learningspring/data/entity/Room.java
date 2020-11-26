package com.frankmoley.lil.learningspring.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROOM")
public class Room {
    @Id
    @Column(name="ROOM_ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long roomId;
    @Column(name="NAME")
    private String roomName;
    @Column(name="ROOM_NUMBER")
    private String roomNumber;
    @Column(name="BED_INFO")
    private String bedInfo;

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(final long roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(final String roomName) {
        this.roomName = roomName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(final String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBedInfo() {
        return bedInfo;
    }

    public void setBedInfo(final String bedInfo) {
        this.bedInfo = bedInfo;
    }
}
