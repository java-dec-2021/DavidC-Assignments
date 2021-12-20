package com.dcogbill.DisplayDate.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class DisplayDateController {
        @RequestMapping("/")
        public String index() {
                return "index.jsp";
        }
        
        @SuppressWarnings("deprecation")
		@RequestMapping("/date")
        public String date(Model model) {
        	Date date = new java.util.Date();
        	String[] dow = {"Sunday",
        			"Monday",
        			"Tuesday",
        			"Wednesday",
        			"Thursday",
        			"Friday",
        			"Saturday"};
        	
        	String[] moy = {"January",
        			"February",
        			"March",
        			"April",
        			"May",
        			"June",
        			"July",
        			"August",
        			"September",
        			"October",
        			"November",
        			"December"};
        	
        	int year = 1900 + date.getYear();
        	
        	model.addAttribute("dayOfWeek", dow[date.getDay()]);
        	model.addAttribute("date", date.getDate());
        	model.addAttribute("month", moy[date.getMonth()]);
        	model.addAttribute("year", year);        	
        	
        	return "date.jsp";
        }
        
        @SuppressWarnings("deprecation")
        @RequestMapping("/time")
        public String time(Model model) {
        	Date date = new java.util.Date();
        	int hour = date.getHours();
        	String meridian = "AM";
        	if ( hour > 11) {
        		meridian = "PM";
        	}
        	
        	if ( hour == 0 ) {
        		hour = 12;
        	} else if ( hour > 12) {
        		hour = hour - 12;
        	}
        	
        	String minutes = String.format("%02d", date.getMinutes());     	
        	model.addAttribute("hour", hour);
        	model.addAttribute("minutes", minutes );
        	model.addAttribute("meridian", meridian);
        	
        	
        	return "time.jsp";
        }
}