package org.example.cloud.controller;

import org.example.cloud.model.Car;
import org.example.cloud.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public ResponseEntity<List<Car>> getAllCars() {
        List<Car> cars = carService.findAll();
        return ResponseEntity.ok(cars);
    }

    @PostMapping
    public ResponseEntity<Car> addCar(@RequestBody Car car) {
        Car newCar = carService.save(car);
        return ResponseEntity.ok(newCar);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable Long id) {
        Car car = carService.findById(id);
        return ResponseEntity.ok(car);
    }

    @PatchMapping
    public ResponseEntity<Car> updateCar(@RequestBody Car car) {
        Car updatedCar = carService.update(car);
        return ResponseEntity.ok(updatedCar);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCar(@PathVariable Long id) {
        carService.delete(id);
        return ResponseEntity.ok("Car deleted successfully");
    }

//    @GetMapping("/get-all-admins")
//    public ResponseEntity<String> getAllAdmins() {
//        return ResponseEntity.ok(carService.getAllAdmins());
//    }
}
