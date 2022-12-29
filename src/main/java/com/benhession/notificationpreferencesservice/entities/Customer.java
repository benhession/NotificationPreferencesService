package com.benhession.notificationpreferencesservice.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "CUSTOMER")
@Getter
@Setter
@ToString
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID")
    private int customerId;
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @Column(name = "EMAIL_PREFERENCE_FLAG")
    private boolean emailPreferenceFlag;
    @Column(name = "SMS_PREFERENCE_FLAG")
    private boolean smsPreferenceFlag;
}
