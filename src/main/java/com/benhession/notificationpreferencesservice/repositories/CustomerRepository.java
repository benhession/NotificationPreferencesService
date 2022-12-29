package com.benhession.notificationpreferencesservice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.benhession.notificationpreferencesservice.entities.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
