package dev.katiejeanne.vacationbackend.dao;

import dev.katiejeanne.vacationbackend.entities.Excursion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface ExcursionRepository extends JpaRepository<Excursion, Long> {

}
