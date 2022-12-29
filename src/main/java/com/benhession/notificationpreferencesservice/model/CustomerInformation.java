package com.benhession.notificationpreferencesservice.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
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
    @Pattern(regexp = "^\\d*$")
    private String customerId;
}
