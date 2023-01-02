package com.benhession.notificationpreferencesservice.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class CustomerPreferences {
    @Schema(description = "Most recent notification status")
    Status status;
    @Schema(description = "Most recent notification description")
    String statusDescription;
    boolean smsPreferenceFlag;
    boolean emailPreferenceFlag;
    String emailAddress;
    String phoneNumber;
}