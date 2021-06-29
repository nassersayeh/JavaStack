package com.example.authontication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.authontication.model.Message;

@Repository
public interface MessageRepo extends CrudRepository<Message, Long>{

}
