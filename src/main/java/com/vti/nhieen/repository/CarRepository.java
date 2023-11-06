package com.vti.nhieen.repository;

import com.vti.nhieen.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository  extends JpaRepository<Car,Car.PrimaryKey> {



}
