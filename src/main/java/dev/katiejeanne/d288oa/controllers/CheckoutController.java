package dev.katiejeanne.d288oa.controllers;

import dev.katiejeanne.d288oa.services.CheckoutService;
import dev.katiejeanne.d288oa.services.PurchaseData;
import dev.katiejeanne.d288oa.services.PurchaseResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping()
    public PurchaseResponse placeOrder(@RequestBody PurchaseData purchaseData) {

        return checkoutService.placeOrder(purchaseData);

    }

}
