package com.vti.nhieen.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class CarDto {


    @JsonProperty("licensePlate")
    private String pkLicensePlate;


    @JsonProperty("repairDate")
    private LocalDate pkRepairDate;
    private String customerName;
    private String catalog;
    private String carMaker;


}
