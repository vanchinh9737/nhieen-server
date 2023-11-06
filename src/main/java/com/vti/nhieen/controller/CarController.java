package com.vti.nhieen.controller;

import com.vti.nhieen.dto.CarDto;
import com.vti.nhieen.entity.Car;
import com.vti.nhieen.form.CarCreateForm;
import com.vti.nhieen.form.CarUpdateForm;
import com.vti.nhieen.service.CarService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // danh cho tang controller va co body tra ve dang json
// rest la response
@AllArgsConstructor
@Validated // xu li loi
@CrossOrigin("http://127.0.0.1:5500/") // de duong dan thi chi cap phep cho luong truy cap do vao
// de dau * thi ai cung co the vao sẻvẻ duov
public class CarController {
    private final CarService carService;
    @PostMapping("/api/v1/cars")
    @ResponseStatus(HttpStatus.CREATED) // da tao thanh cong
    public CarDto create(@RequestBody @Valid CarCreateForm form) {
        //    @Valid kiem tra tinh hop le cua form roi bat loi gui ve xu ly
        return carService.create(form);

    }

    @GetMapping("/api/v1/cars")
    public Page<CarDto> findAll(Pageable page) {
        return carService.findAll(page);
    }

    @PutMapping ("/api/v1/cars")
    public CarDto update(@RequestBody @Valid CarUpdateForm form) {
        return carService.update(form);
    }

    @DeleteMapping("/api/v1/cars")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@RequestBody Car.PrimaryKey pk) {
        carService.deleteById(pk);
    }
}
