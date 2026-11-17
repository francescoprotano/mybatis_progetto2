package it.exolab.mapper;

import java.util.List;

import it.exolab.model.Studente;

public interface StudenteMapper {
	
	void insert(Studente model);
	void update(Studente model);
	List<Studente> findAll();
	
	Studente find(Long id);
	Studente findAndJoinCorso(Long id);
	
	void delete(Long id);
	

}
