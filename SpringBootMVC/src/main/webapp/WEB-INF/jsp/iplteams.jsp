<%@page import="com.codewithathul.IPLTeams"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
    body{
    display:flex;
    justify-content:center;
    align-items:center;
    }

</style>
<body>


<table border="2">
     <tr>
        <th>Teamcaptainname</th>
        <th>Trophies</th>
        <th>Teamownername</th>
        <th>Teamname</th>
     </tr>
<%
  List<IPLTeams> ipl = (List<IPLTeams>) request.getAttribute("iplteams");

   for(IPLTeams iplteams : ipl){
%>
<tr>
  <td><%= iplteams.getTeamcaptionname() %></td>
  <td><%= iplteams.getTrophies() %></td>
  <td><%= iplteams.getTeamownername() %></td>
  <td><%= iplteams.getTeamname() %></td>
</tr>
<%
   }
%>
</table>
</body>
</html>