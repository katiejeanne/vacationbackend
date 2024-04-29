package dev.katiejeanne.d288oa.services;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PurchaseResponse {

    private String orderTrackingNumber;

    public PurchaseResponse(String orderTrackingNumber) {
        this.orderTrackingNumber = orderTrackingNumber;
    }

}
