package com.bojjaClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bojjaClasses.DMS.Models.Dog;



public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);

}
