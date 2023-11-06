package com.vti.nhieen.service;

import com.vti.nhieen.dto.CarDto;
import com.vti.nhieen.entity.Car;
import com.vti.nhieen.form.CarCreateForm;
import com.vti.nhieen.form.CarUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CarService {
    CarDto create(CarCreateForm form);

    Page<CarDto> findAll(Pageable page);

    CarDto update(CarUpdateForm form);

    void deleteById(Car.PrimaryKey pk);




}
