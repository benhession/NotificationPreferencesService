package com.benhession.notificationpreferencesservice.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.benhession.notificationpreferencesservice.entities.Customer;
import com.benhession.notificationpreferencesservice.entities.Notification;
import com.benhession.notificationpreferencesservice.formatters.CustomerPreferencesFormatter;
import com.benhession.notificationpreferencesservice.model.CustomerPreferences;
import com.benhession.notificationpreferencesservice.repositories.CustomerRepository;
import com.benhession.notificationpreferencesservice.repositories.NotificationRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PreferencesService {

    private final CustomerRepository customerRepository;
    private final NotificationRepository notificationRepository;
    private final CustomerPreferencesFormatter preferencesFormatter;

    public Optional<CustomerPreferences> getPreferencesForCustomerById(int customerId) {
        Optional<Customer> customer = customerRepository.findById(customerId);

        if (customer.isEmpty()) {
            return Optional.empty();
        }

        Optional<Notification> mostRecentNotification = notificationRepository
            .findTopByCustomerOrderBySentAtDesc(customer.orElseThrow());

        return Optional.of(preferencesFormatter.format(customer.orElseThrow(), mostRecentNotification));
    }
}
