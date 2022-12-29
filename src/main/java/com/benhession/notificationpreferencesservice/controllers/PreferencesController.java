package com.benhession.notificationpreferencesservice.controllers;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.benhession.notificationpreferencesservice.model.CustomerInformation;
import com.benhession.notificationpreferencesservice.model.CustomerPreferences;
import com.benhession.notificationpreferencesservice.services.PreferencesService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/notification/preferences")
@RequiredArgsConstructor
@Slf4j
public class PreferencesController {

    private final PreferencesService preferencesService;

    @PostMapping(path = "/", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomerPreferences> getCustomerPreferencesById(@Valid @RequestBody CustomerInformation customerInfo) {

        try {
            int customerId = Integer.parseInt(customerInfo.getCustomerId());

            return preferencesService.getPreferencesForCustomerById(customerId)
                .map(preferences -> ResponseEntity
                    .ok()
                    .body(preferences)
                ).orElseGet(() -> ResponseEntity
                    .noContent()
                    .build()
                );

        } catch (NumberFormatException e) {
            log.warn("unable to parse customer ID from request with value [{}]", customerInfo.getCustomerId());
            return ResponseEntity.badRequest().build();
        }
    }
}
