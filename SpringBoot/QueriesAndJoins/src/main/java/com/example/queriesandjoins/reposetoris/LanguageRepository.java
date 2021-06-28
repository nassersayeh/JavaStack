package com.example.queriesandjoins.reposetoris;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.queriesandjoins.models.Language;
@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{

}
