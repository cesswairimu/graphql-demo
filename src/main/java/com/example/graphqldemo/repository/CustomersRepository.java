package com.example.graphqldemo.repository;

import com.example.graphqldemo.models.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<Customers, Long> {
}
