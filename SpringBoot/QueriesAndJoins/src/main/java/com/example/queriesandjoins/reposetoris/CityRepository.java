package com.example.queriesandjoins.reposetoris;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.queriesandjoins.models.City;
@Repository
public interface CityRepository extends CrudRepository<City, Long>{

}
