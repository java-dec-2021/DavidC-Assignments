package com.dcogbill.LanguagesAssignment.Services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcogbill.LanguagesAssignment.Models.Language;
import com.dcogbill.LanguagesAssignment.Repository.LanguageRepository;

@Service
public class LanguageService {
	
	@Autowired
	private LanguageRepository languageRepository;
	
	// returns all the languages
    public List<Language> allLanguages() {
        return languageRepository.findAll();
    }
    
 // creates a language
    public Language createLanguage(Language lang) {
        return languageRepository.save(lang);
    }
    
 // retrieves a language
    public Language findLanguage(Long id) {
        Optional<Language> optionalLanguage = languageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
    }

	public void deleteLanguage(Long id) {
		
		languageRepository.deleteById(id);		
	}


}
