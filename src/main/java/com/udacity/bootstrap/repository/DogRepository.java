package com.udacity.bootstrap.repository;

import com.udacity.bootstrap.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog, Long> {

    @Query("select d.id, d.breed from Dog d where d.id=:id")
    String findBreedById(Long id);

    @Query("select d.id, d.breed from Dog d")
    List<String> findAllBreeds();

    @Query("select d.id, d.name from Dog d")
    List<String> findAllNames();
    /*
    @Query(value="SELECT breed FROM Dog",nativeQuery = true)
    public List<String> findAllBreeds();

    @Query(value="SELECT breed FROM Dog WHERE id=:Id",nativeQuery = true)
    public String findBreedById(Long Id);

    @Query(value="SELECT name FROM Dog",nativeQuery = true)
    public List<String> findAllNames();

     */
}
