package com.benhession.notificationpreferencesservice.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class CustomerInformation {
    @NotBlank
    private String customerId;
}
