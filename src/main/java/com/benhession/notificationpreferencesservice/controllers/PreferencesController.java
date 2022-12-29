package com.benhession.notificationpreferencesservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.benhession.notificationpreferencesservice.model.CustomerInformation;
import com.benhession.notificationpreferencesservice.model.CustomerPreferences;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController(value = "notification/preferences")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PreferencesController {


    @GetMapping
    public ResponseEntity<CustomerPreferences> getCustomerPreferencesById(@Valid @RequestBody CustomerInformation customerInfo) {
        //TODO - fetch preferences
        return null;
    }
}
