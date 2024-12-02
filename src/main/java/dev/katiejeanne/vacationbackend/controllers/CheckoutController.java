package dev.katiejeanne.vacationbackend.controllers;

import dev.katiejeanne.vacationbackend.services.CheckoutService;
import dev.katiejeanne.vacationbackend.services.PurchaseData;
import dev.katiejeanne.vacationbackend.services.PurchaseResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody PurchaseData purchaseData) {

        return checkoutService.placeOrder(purchaseData);

    }

}
