package com.codewithathul;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	Dao dao;
	
	public ArrayList<IPLTeams> getIPLTeam() {
	return	dao.getIPLTeams();
	}

}
