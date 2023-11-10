package com.vti.nhieen.service;

import com.vti.nhieen.dto.CarDto;
import com.vti.nhieen.entity.Car;
import com.vti.nhieen.form.CarCreateForm;
import com.vti.nhieen.form.CarUpdateForm;
import com.vti.nhieen.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service // trien khai phuong thuc cua interfaceService

@AllArgsConstructor  // tao ra constructor (animasition cua lombok)
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;
    private final ModelMapper modelMapper;

    @Override
    public CarDto create(CarCreateForm form) {
        var car = modelMapper.map(form, Car.class);
        var pk = modelMapper.map(form, Car.PrimaryKey.class);
        car.setPk(pk);

        var savedCar = carRepository.save(car);
        return modelMapper.map(savedCar, CarDto.class);
    }
    @Override
    public Page<CarDto> findAll(Pageable page) {
        return carRepository.findAll(page)
                .map(car -> modelMapper.map(car, CarDto.class));
    }
    @Override
    public CarDto update(CarUpdateForm form) {

        var pk = modelMapper.map(form, Car.PrimaryKey.class);
        var car = carRepository.findById(pk).get();  /// get ra het pk trong Primakey
        modelMapper.map(form, car);
        var savedCar = carRepository.save(car);

        return modelMapper.map(savedCar, CarDto.class);
    }

    @Override
    public void deleteById(Car.PrimaryKey pk) {
        carRepository.deleteById(pk);

    }
}
