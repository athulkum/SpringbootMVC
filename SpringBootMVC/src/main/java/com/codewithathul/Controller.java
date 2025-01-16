package com.codewithathul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired 
	Service service;

	@GetMapping("/ipl")
	public String getIPLTeams(Model model) {
	model.addAttribute("iplteams", service.getIPLTeam());
	return	"iplteams";
	}
}
