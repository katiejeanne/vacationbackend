package dev.katiejeanne.vacationbackend.dao;

import dev.katiejeanne.vacationbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
