package com.hexaware.restapi.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hexaware.restapi.entity.Customer;



@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
