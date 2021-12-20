package com.dcogbill.DojoSurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DojoSurveyController {
	
	@RequestMapping("/")
    public String index() {
            return "survey.jsp";
    }
	
	@RequestMapping(path="/survey", method=RequestMethod.POST)
    public String survey(@RequestParam(value="name") String name,
    		@RequestParam(value="location") String location,
    		@RequestParam(value="favoriteLanguage") String favoriteLanguage,
    		@RequestParam(value="comment") String comment,
    		HttpSession session) {
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("favoriteLanguage", favoriteLanguage);
		session.setAttribute("comment", comment);
		return "redirect:/result";
    }
	
	@RequestMapping("/result")
    public String result(Model model, HttpSession session) {
		model.addAttribute("name", session.getAttribute("name"));
		model.addAttribute("location", session.getAttribute("location"));
		model.addAttribute("favoriteLanguage", session.getAttribute("favoriteLanguage"));
		model.addAttribute("comment", session.getAttribute("comment"));
		return "result.jsp";
    }

}
