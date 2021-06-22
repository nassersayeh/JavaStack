package com.example.lookify.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.lookify.models.lookifyModel;
import com.example.lookify.repositories.lookifyRepo;
@Service
public class lookifyService {
private final lookifyRepo lookify;
public lookifyService(lookifyRepo lookify) {
	this.lookify = lookify;
}
public List<lookifyModel> allsong() {
    return lookify.findAll();
}
public lookifyModel createSong(lookifyModel l) {
    return lookify.save(l);
}
public void deleteLookify(Long id) {
	// TODO Auto-generated method stub
	lookify.deleteById(id);
	
}
public lookifyModel findsong(Long id) {
    Optional<lookifyModel> optionalLanguage = lookify.findById(id);
    if(optionalLanguage.isPresent()) {
        return optionalLanguage.get();
    } else {
        return null;
    }

}
public lookifyModel searchByArtist(String name) {
	return lookify.searchByArtist(name);
}
public List<lookifyModel> findByName(String name){
	return lookify.findAllByArtist(name);
}
public List<lookifyModel> topTen() {
	return lookify.findTop10ByOrderByRatingDesc();
}
}
