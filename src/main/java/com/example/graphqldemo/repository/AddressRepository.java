package com.example.graphqldemo.repository;


import com.example.graphqldemo.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
