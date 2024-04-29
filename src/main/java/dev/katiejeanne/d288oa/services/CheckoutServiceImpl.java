package dev.katiejeanne.d288oa.services;

import dev.katiejeanne.d288oa.dao.CartRepository;
import dev.katiejeanne.d288oa.dao.CustomerRepository;
import dev.katiejeanne.d288oa.entities.Cart;
import dev.katiejeanne.d288oa.entities.CartItem;
import dev.katiejeanne.d288oa.entities.Customer;
import dev.katiejeanne.d288oa.entities.StatusType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Set;
import java.util.UUID;

@CrossOrigin
@Service
public class CheckoutServiceImpl implements CheckoutService{

    private CustomerRepository customerRepository;

    private CartRepository cartRepository;


    @Autowired
    public CheckoutServiceImpl(CustomerRepository customerRepository, CartRepository cartRepository) {
        this.customerRepository = customerRepository;
        this.cartRepository = cartRepository;
    }



    @Override
    public PurchaseResponse placeOrder(PurchaseData purchaseData) {

        // Make a Cart class
        Cart cart = purchaseData.getCart();

        // Attach the customer
        Customer customer = purchaseData.getCustomer();
        cart.setCustomer(customer);

        // Attach cart items
        Set<CartItem> cartItems = purchaseData.getCartItems();
        cartItems.forEach(cart::addCartItem);

        // Set the status to pending
        cart.setStatus(StatusType.pending);

        // Create an order tracking number and attach it to the cart
        cart.setOrderTrackingNumber(createOrderTrackingNumber());

        // Save the customer (cascades to cart and cart items)
        customerRepository.save(customer);
        cartRepository.save(cart);

        // Create a purchase response with the tracking number
        // Return the purchase response
        return new PurchaseResponse(cart.getOrderTrackingNumber());

    }

    private String createOrderTrackingNumber() {
        return UUID.randomUUID().toString();
    }
}
