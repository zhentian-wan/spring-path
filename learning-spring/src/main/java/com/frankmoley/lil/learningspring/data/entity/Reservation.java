package com.frankmoley.lil.learningspring.data.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RESERVATION")
public class Reservation {

    @Id
    @Column(name = "RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reservationId;

    @Column(name = "ROOM_ID")
    private long roomId;

    @Column(name = "GUEST_ID")
    private long guestId;

    public long getReservationId() {
        return reservationId;
    }

    public void setReservationId(final long reservationId) {
        this.reservationId = reservationId;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(final long roomId) {
        this.roomId = roomId;
    }

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(final long guestId) {
        this.guestId = guestId;
    }

    public Date getResDate() {
        return resDate;
    }

    public void setResDate(final Date resDate) {
        this.resDate = resDate;
    }

    @Column(name = "RES_DATE")
    private Date resDate;

}
