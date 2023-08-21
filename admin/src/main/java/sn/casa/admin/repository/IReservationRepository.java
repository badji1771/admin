package sn.casa.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.casa.admin.entities.ReservationEntity;

public interface IReservationRepository extends JpaRepository<ReservationEntity, Long> {
}
