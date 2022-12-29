package com.benhession.notificationpreferencesservice.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class CustomerPreferences {
    Status status;
    String statusDescription;
    boolean smsPreferenceFlag;
    String emailAddress;
    String phoneNumber;
}