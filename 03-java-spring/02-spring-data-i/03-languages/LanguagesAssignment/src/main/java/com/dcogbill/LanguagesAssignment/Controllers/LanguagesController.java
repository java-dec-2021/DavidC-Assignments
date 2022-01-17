package com.dcogbill.LanguagesAssignment.Controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dcogbill.LanguagesAssignment.Models.Language;
import com.dcogbill.LanguagesAssignment.Services.LanguageService;

@Controller
public class LanguagesController {
	
	private final LanguageService languageService;
	
	public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }
	
	@RequestMapping("/languages")
	public String index(@ModelAttribute("lang") Language lang, Model model) {
		List<Language> languages = languageService.allLanguages();
		model.addAttribute("languages",languages);
		return "index.jsp";
	}
	
	@RequestMapping(path="/languages", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("lang") Language lang, BindingResult result) {
		if (result.hasErrors()) {
            return "index.jsp";
        } else {
            languageService.createLanguage(lang);
            return "redirect:/languages";
        }
    }
	
	@RequestMapping("/languages/{id}")
	public String show(@PathVariable Long id, Model model) {
		Language lang = languageService.findLanguage(id);
		model.addAttribute("lang", lang);
		return "show.jsp";
	}
	
	@RequestMapping("/languages/{id}/edit")
	public String edit(@PathVariable Long id, @ModelAttribute("lang") Language lang, Model model) {
		
		Language targetLang = languageService.findLanguage(id);
		model.addAttribute("lang", targetLang);
		
		return "edit.jsp";
	}
	
	@RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("lang") Language lang, BindingResult result, @PathVariable Long id) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
            languageService.createLanguage(languageService.findLanguage(id));
            return "redirect:/languages/{id}";
        }
    }
	
	@RequestMapping(value="/languages/{id}", method=RequestMethod.DELETE)
    public String destroy(@PathVariable("id") Long id) {
        languageService.deleteLanguage(id);
        return "redirect:/languages";
    }
	
	

}
