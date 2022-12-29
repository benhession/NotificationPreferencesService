package com.benhession.notificationpreferencesservice.entities;

import java.time.LocalDateTime;

import com.benhession.notificationpreferencesservice.model.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "NOTIFICATION")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customer;
    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    private Status status;
    @Column(name = "STATUS_DESCRIPTION")
    private String statusDescription;
    @Column(name = "SENT_AT")
    private LocalDateTime sentAt;
}
