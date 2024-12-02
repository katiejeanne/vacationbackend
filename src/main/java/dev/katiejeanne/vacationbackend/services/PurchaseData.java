package dev.katiejeanne.vacationbackend.services;

import dev.katiejeanne.vacationbackend.entities.Cart;
import dev.katiejeanne.vacationbackend.entities.CartItem;
import dev.katiejeanne.vacationbackend.entities.Customer;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class PurchaseData {

    private Customer customer;

    private Cart cart;

    private Set<CartItem> cartItems = new HashSet<>();

}
