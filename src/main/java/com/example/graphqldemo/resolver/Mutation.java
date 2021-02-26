package com.example.graphqldemo.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphqldemo.models.Address;
import com.example.graphqldemo.models.Customers;
import com.example.graphqldemo.repository.AddressRepository;
import com.example.graphqldemo.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {
    private AddressRepository addressRepository;
    private CustomersRepository customersRepository;

    @Autowired
    public Mutation(AddressRepository addressRepository,  CustomersRepository customersRepository) {
        this.addressRepository = addressRepository;
        this.customersRepository = customersRepository;
    }

    public Address createAddress(String name, String region, String landmark) {
        Address address = new Address();
        address.setName(name);
        address.setRegion(region);
        address.setLandmark(landmark);
        //addressRepository.save(address);

        return address;
    }




    public Customers createNewCustomer(String firstName, String lastName, Long addressId) {
        Customers customers = new Customers();
        customers.setFirstName(firstName);
        customers.setLastName(lastName);
        customers.setAddress(new Address(addressId));
       // customersRepository.save(customers);
        return customers;
    }


}
