package com.dcogbill.LanguagesAssignment.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dcogbill.LanguagesAssignment.Models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{
	
	//returns list of all languages
	List<Language> findAll();
	
}
