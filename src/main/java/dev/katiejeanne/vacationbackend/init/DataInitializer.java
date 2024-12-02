package dev.katiejeanne.vacationbackend.init;

import dev.katiejeanne.vacationbackend.dao.CustomerRepository;
import dev.katiejeanne.vacationbackend.dao.DivisionRepository;
import dev.katiejeanne.vacationbackend.entities.Customer;
import dev.katiejeanne.vacationbackend.entities.Division;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {


    private CustomerRepository customerRepository;

    private DivisionRepository divisionRepository;

    public DataInitializer(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        List<Customer> currentCustomers = customerRepository.findAll();
        if (currentCustomers.size() < 6) {
            Division division = divisionRepository.findById(35L).orElseThrow();

            createCustomer("Sally",
                    "Ride",
                    "1234 Starship Way",
                    "12345",
                    "555-555-5555",
                    division);

            createCustomer("Buzz",
                    "Aldrin",
                    "5678 Lunar Lane",
                    "54321",
                    "555-555-5555",
                    division);

            createCustomer("Mae",
                    "Jemison",
                   "9101 Shuttle Circle",
                    "98765",
                    "555-555-5555",
                    division);

            createCustomer("Neil",
                    "Armstrong",
                    "2468 Rocket Blvd",
                    "54321",
                    "555-555-5555",
                    division);

            createCustomer("Kathryn",
                    "Sullivan",
                    "1357 Stellar Road",
                    "57239",
                    "555-555-5555",
                    division);

        }

    }

    private Customer createCustomer(String firstName,
                                    String lastName,
                                    String address,
                                    String postalCode,
                                    String phone,
                                    Division division) {

        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setAddress(address);
        customer.setPostalCode(postalCode);
        customer.setPhone(phone);
        customer.setDivision(division);
        customerRepository.save(customer);
        return customer;
    }
}
