package dev.katiejeanne.vacationbackend.dao;

import dev.katiejeanne.vacationbackend.entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface CartItemRepository extends JpaRepository<CartItem, Long> {

}
