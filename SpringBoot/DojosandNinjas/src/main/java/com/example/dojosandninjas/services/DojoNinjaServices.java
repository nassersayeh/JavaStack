package com.example.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.dojosandninjas.models.Dojo;
import com.example.dojosandninjas.models.Ninja;
import com.example.dojosandninjas.repositories.Dojos;
import com.example.dojosandninjas.repositories.Ninjas;
@Service
public class DojoNinjaServices {
private final Dojos dojorepo ;
private final Ninjas ninjarepo;
public DojoNinjaServices(Dojos dojorepo, Ninjas ninjarepo) {
	this.dojorepo = dojorepo;
	this.ninjarepo = ninjarepo;
}
public List<Dojo> alldojos(){
	return dojorepo.findAll();
}
public List<Ninja> allninja(){
	return ninjarepo.findAll();
}
public Dojo creatDojo(Dojo d) {
	return dojorepo.save(d);
}
public Ninja creatNinja(Ninja n) {
	return ninjarepo.save(n);
}
public Dojo findDojoById(long id){
	Optional<Dojo> optionalLanguage = dojorepo.findById(id);
	if (optionalLanguage.isPresent()) {
		return optionalLanguage.get();
	} else {
		return null;
	}
}
public List<Ninja> findAllByDojo(Dojo x) {
	return ninjarepo.findAllByDojo(x);
}
public List<Dojo> findAllDojos(){
	return dojorepo.findAll();
}
}
