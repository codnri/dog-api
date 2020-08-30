package com.udacity.bootstrap.service;


import com.udacity.bootstrap.entity.Dog;

import java.util.List;

public interface DogService {
    List<Dog> retrieveDogs();

    List<String> retrieveDogBreeds();

    List<String> retrieveDogNames();

    String retrieveDogBreedById(Long Id);
}

