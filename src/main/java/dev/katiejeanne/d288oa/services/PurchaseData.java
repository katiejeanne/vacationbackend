package dev.katiejeanne.d288oa.services;

import dev.katiejeanne.d288oa.entities.Cart;
import dev.katiejeanne.d288oa.entities.CartItem;
import dev.katiejeanne.d288oa.entities.Customer;
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
