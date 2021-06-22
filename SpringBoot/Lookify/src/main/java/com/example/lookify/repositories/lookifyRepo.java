package com.example.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.lookify.models.lookifyModel;

public interface lookifyRepo extends CrudRepository<lookifyModel, Long> {
	List<lookifyModel> findAll();
	List<lookifyModel> findTop10ByOrderByRatingDesc();
	lookifyModel searchByArtist(String name);
	List<lookifyModel> findAllByArtist(String name);
}
