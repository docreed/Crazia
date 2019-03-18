package com.crazia.ergo.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeCon {

	  private static final Logger log = LoggerFactory.getLogger(HomeCon.class);
	  
	 
	  @Value("${messages.home2:default-value}")
	    private String message = "";
	  @Value("${home"+3+"}")
	  private String[] valuesArray;
	  
	  @Value("${home4}")
	  private String aluesArray;
	  
	  @RequestMapping(value="/")
	    public String wlcome(Model model) throws ParseException {
	        log.info("Spring Boot Thymeleaf Configuration Example");
	        model.addAttribute("bodyClass", "landing-page");
	       // model.addAttribute("message", aluesArray );
	        
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    	Date date = new Date();
	    	System.out.println(dateFormat.format(date)); //2013/10/15 16:16:39
	    	
	    	model.addAttribute("dats", date);
	        model.addAttribute("message", aluesArray);
	        return "views/index";
	    }

	    @RequestMapping(value="/hell")
	    public String welcome(Model model) {
	        log.info("Spring Boot Thymeleaf Configuration Example");
	        model.addAttribute("bodyClass", "ecommerce-page");
	       // model.addAttribute("message", message);
	        return "views/hell";
	    }

}
