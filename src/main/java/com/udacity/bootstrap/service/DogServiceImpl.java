package com.udacity.bootstrap.service;

import com.udacity.bootstrap.entity.Dog;
import com.udacity.bootstrap.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements DogService{
    @Autowired
    DogRepository dogRepository;

    public List<Dog> retrieveDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    public List<String> retrieveDogBreeds(){
        return (List<String>)dogRepository.findAllBreeds();
    }
    public List<String> retrieveDogNames(){
        return (List<String>)dogRepository.findAllNames();
    }
    public String retrieveDogBreedById(Long Id){
        return (String)dogRepository.findBreedById(Id);
    }

}
