package org.example.cloud.service;

import org.example.cloud.dao.CarRepository;
import org.example.cloud.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;
//    private final AdminClient adminClient;

    //    public CarService(CarRepository carRepository, AdminClient adminClient) {
//        this.carRepository = carRepository;
//        this.adminClient = adminClient;
//    }
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Car save(Car car) {
        return carRepository.save(car);
    }

    public Car findById(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    public Car update(Car car) {
        return carRepository.save(car);
    }

    public void delete(Long id) {
        carRepository.deleteById(id);
    }
}
