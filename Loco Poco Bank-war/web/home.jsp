<%-- 
    Document   : home
    Created on : 26 Jan, 2015, 4:50:38 PM
    Author     : mohd_aquib
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
        <form name="f1" method="post" action="NewServlet2">
        <tt>Welcome </tt> 
        <input type="hidden" name="h1" value="<% request.getAttribute("acno"); %>">
        <% out.println(request.getAttribute("acno")); %> 
        </br></br>
        <select name="s1">
        <option value="1">Account Info</option>
        <option value="2">Check Balance</option>
        <option value="3">Deposit</option>
        </select>
        <br></br>
        Amount:
        <input type="text" name="t2" size="5" maxlength="5" value="If Deposit">
        <br></br>
        <input type="submit" value="Submit">
        </form>
        </center>
        
        
    </body>
</html>
