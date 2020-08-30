package com.udacity.bootstrap.controller;

import com.udacity.bootstrap.entity.Dog;
import com.udacity.bootstrap.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {
    private DogService dogService;

    @Autowired
    public void setDogService(DogService dogService) {
        this.dogService = dogService;
    }
//
//    public DogController(DogService dogService) {
//        this.dogService = dogService;
//    }

    @GetMapping("/dogs")
    public ResponseEntity<List<Dog>> getAllDogs(){
        List<Dog> dogs = dogService.retrieveDogs();
        return new ResponseEntity<>(dogs, HttpStatus.OK);
    }

    @GetMapping("/dogs/breed")
    public ResponseEntity<List<String>> getAllBreeds(){
        List<String> breeds = dogService.retrieveDogBreeds();
        return new ResponseEntity<>(breeds,HttpStatus.OK);
    }
    @GetMapping("/{id}/breed")
    public ResponseEntity<String> getBreedById(@PathVariable Long id){
        String breed = dogService.retrieveDogBreedById(id);
        return new ResponseEntity<>(breed,HttpStatus.OK);
    }
    @GetMapping("/dogs/name")
    public ResponseEntity<List<String>> getAllNames(){
        List<String> names = dogService.retrieveDogNames();
        return new ResponseEntity<>(names,HttpStatus.OK);
    }

}
