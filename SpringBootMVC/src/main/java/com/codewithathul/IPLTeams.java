package com.codewithathul;


public class IPLTeams {

	String teamName;
	
	int trophies;
	
	String teamownername;
	
	String teamcaptionname;

	public String getTeamname() {
		return teamName;
	}

	public void setTeamname(String teamname) {
		this.teamName = teamname;
	}

	public int getTrophies() {
		return trophies;
	}

	public void setTrophies(int trophies) {
		this.trophies = trophies;
	}

	public String getTeamownername() {
		return teamownername;
	}

	public void setTeamownername(String teamownername) {
		this.teamownername = teamownername;
	}

	public String getTeamcaptionname() {
		return teamcaptionname;
	}

	public void setTeamcaptionname(String teamcaptionname) {
		this.teamcaptionname = teamcaptionname;
	}

	public IPLTeams(String teamName, int trophies, String teamownername, String teamcaptionname) {
		super();
		this.teamName = teamName;
		this.trophies = trophies;
		this.teamownername = teamownername;
		this.teamcaptionname = teamcaptionname;
	}

	public IPLTeams() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
}
