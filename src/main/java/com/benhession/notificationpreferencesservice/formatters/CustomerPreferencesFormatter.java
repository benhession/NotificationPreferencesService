package com.benhession.notificationpreferencesservice.formatters;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.benhession.notificationpreferencesservice.entities.Customer;
import com.benhession.notificationpreferencesservice.entities.Notification;
import com.benhession.notificationpreferencesservice.model.CustomerPreferences;

@Component
public class CustomerPreferencesFormatter {

    public CustomerPreferences format(Customer customer, Optional<Notification> notificationOptional) {

        return CustomerPreferences.builder()
            .status(notificationOptional.map(Notification::getStatus).orElse(null))
            .statusDescription(notificationOptional.map(Notification::getStatusDescription).orElse(null))
            .smsPreferenceFlag(customer.isSmsPreferenceFlag())
            .emailPreferenceFlag(customer.isEmailPreferenceFlag())
            .emailAddress(customer.getEmailAddress())
            .phoneNumber(customer.getPhoneNumber())
            .build();
    }
}
