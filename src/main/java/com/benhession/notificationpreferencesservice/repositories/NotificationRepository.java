package com.benhession.notificationpreferencesservice.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.benhession.notificationpreferencesservice.entities.Customer;
import com.benhession.notificationpreferencesservice.entities.Notification;

@Repository
public interface NotificationRepository extends CrudRepository<Notification, Integer> {
    Optional<Notification> findTopByCustomerOrderBySentAtDesc(Customer customer);
}
