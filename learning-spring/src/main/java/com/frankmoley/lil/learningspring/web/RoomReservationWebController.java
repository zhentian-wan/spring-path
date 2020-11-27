package com.frankmoley.lil.learningspring.web;

import com.frankmoley.lil.learningspring.busniess.domain.RoomReservation;
import com.frankmoley.lil.learningspring.busniess.service.ReservationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/reservations")
public class RoomReservationWebController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping
    public String getReservations (@RequestParam(value="date", required = false) String dateString, Model model) {
        Date date = DateUtils.createDateFromDateString(dateString);
        List<RoomReservation> roomReservations = this.reservationService.getRoomReservationsForDate(date);
        model.addAttribute("roomReservations", roomReservations);
        return "reservations";
    }
}
