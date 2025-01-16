package com.codewithathul;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class Dao {
	
	ArrayList<IPLTeams> list = new ArrayList<IPLTeams>();
	public ArrayList<IPLTeams> getIPLTeams() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con =	DriverManager.getConnection("jdbc:mysql://localhost:3306/archon", "root", "root");
             Statement	stm =		con.createStatement();
		    ResultSet rs= stm.executeQuery("select * from iplteams");
            while(rs.next()) {
            String teamcaptainname =	rs.getString(1);
            int trophies =	rs.getInt(2);
            String teamownername =	rs.getString(3);
            String teamname =  	rs.getString(4);
            
            IPLTeams iplTeams = new IPLTeams(teamcaptainname, trophies, teamownername, teamname);
            list.add(iplTeams);
            
            }
		    
		}catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		return list;
		
		
	}

}
