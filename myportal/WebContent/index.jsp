<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<html>
<head>
<title> Login Form</title>

<link rel="stylesheet" href="mycss.css" media="all"/>

</head>
<body>
    <form:form action = "login" method="POST" >
        <div  class="login-form">
            <table cellspacing="20">
               <tr><td> </td>
               <td><h3 style="color:blue;align:center;">Log In Form</h3></td></tr>
                <tr >
                    <td style = "color:black;">User Name</td>
                    <td ><form:input type="text" path="userName" /></td>
                </tr>
                <tr>
                    <td style = "color:black;">Password</td>
                    <td><form:input type="password" path="password" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td ><input class="login-button"  type="submit" value="Log In" /></td>
                </tr>
            </table>
            <div style="color: red">${error}</div>
        </div>
    </form:form>
</body>
</html>