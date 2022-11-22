package com.dailycodework.excel2database.repository;

import com.dailycodework.excel2database.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer, Integer> {
}
