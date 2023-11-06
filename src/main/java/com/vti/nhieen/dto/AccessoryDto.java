package com.vti.nhieen.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class AccessoryDto {

    private Long id;
    private String name;
    private Long price;
    private String statusDamaged;
    private String repairStatus;
    @JsonProperty("licensePlate")
    private String carPkLicensePlate;// de ten bien khi map model mappler
    @JsonProperty("repairDate")
    private LocalDate carPkRepairDate;



}
