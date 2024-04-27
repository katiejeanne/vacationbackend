package dev.katiejeanne.d288oa.dao;

import dev.katiejeanne.d288oa.entities.Vacation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface VacationRepository extends JpaRepository<Vacation, Long> {

}

