package com.example.graphqldemo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphqldemo.models.Address;
import com.example.graphqldemo.models.Customers;
import com.example.graphqldemo.repository.AddressRepository;
import com.example.graphqldemo.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
	private AddressRepository addressRepository;
	private CustomersRepository customersRepository;

	@Autowired
	public Query(AddressRepository addressRepository,CustomersRepository customersRepository) {
		this.addressRepository = addressRepository;
		this.customersRepository=customersRepository;
	}

	public Iterable<Address> findAllAddresses() {
		return addressRepository.findAll();
	}

	public long countAddress() {
		return addressRepository.count();
	}

	public Iterable<Customers> findAllCustomers() {
		return customersRepository.findAll();
	}

}