package dev.katiejeanne.vacationbackend.services;

public interface CheckoutService {

    PurchaseResponse placeOrder(PurchaseData purchaseData);
}
