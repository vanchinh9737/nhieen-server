package com.vti.nhieen.form;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Setter
@Getter
public class AccessoryCreateForm {

    //    @NotNull:not null
//@NotEmpty not null & length >0
//    @NotBlank  not null & length >0  va ko dc chua toan bo dau cach
    @NotBlank
    @Length(max = 255)
    private String name;

    @NotNull
    @PositiveOrZero  // nhap vo so >0
    private Long price;

    @NotBlank
    @Length(max = 255)
    private String statusDamaged;

    @NotBlank
    @Length(max = 255)
    private String repairStatus;

    @NotBlank
    @Length(max = 255)
    private String licensePlate;

    @NotNull
    @PastOrPresent
    private LocalDate repairDate;

}
