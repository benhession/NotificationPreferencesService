package com.benhession.notificationpreferencesservice.model;

import io.swagger.v3.oas.annotations.media.Schema;
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
    @Schema(defaultValue = "1")
    private String customerId;
}
