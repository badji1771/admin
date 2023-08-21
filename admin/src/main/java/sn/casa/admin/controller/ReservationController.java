package sn.casa.admin.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.casa.admin.entities.ReservationEntity;
import sn.casa.admin.repository.IReservationRepository;

import java.util.List;

@RestController
@RequestMapping("/reservations")
@AllArgsConstructor
public class ReservationController {

    private IReservationRepository reservationRepository;

    @GetMapping
    public List<ReservationEntity> reservationEntityList(){
        return reservationRepository.findAll();
    }



}
