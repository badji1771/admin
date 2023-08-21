package sn.casa.admin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sn.casa.admin.entities.ReservationEntity;
import sn.casa.admin.entities.ReservationStatus;
import sn.casa.admin.repository.IReservationRepository;

@SpringBootApplication
public class AdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(IReservationRepository reservationRepository){
		return args -> {
			reservationRepository.save(ReservationEntity
					.builder().titre("TITRE 1").prix(150000).status(ReservationStatus.CREATED).build());
			reservationRepository.save(ReservationEntity
					.builder().titre("TITRE 2").prix(160000).status(ReservationStatus.CREATED).build());
			reservationRepository.save(ReservationEntity
					.builder().titre("TITRE 3").prix(170000).status(ReservationStatus.CREATED).build());
			reservationRepository.save(ReservationEntity
					.builder().titre("TITRE 4").prix(150000).status(ReservationStatus.CREATED).build());
		};
	}
}
