package com.accenture.lkm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accenture.lkm.bean.Alien;
import com.accenture.lkm.dao.AlienRepo;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("hom")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("/addAlien")
	public String addalien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}

}
