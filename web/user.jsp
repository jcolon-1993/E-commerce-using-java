<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
    

<h1>Enter your name and contact information</h1>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form action="<c:url value='/order/processUser' />" method=post>
    <p id="required">Required <span class="required">*</span></p>
    
    <label>First Name</label>
    <input type="text" name="firstName"  maxlength=20 
               value="${user.firstName}" required>
    <p class="required">*</p><br>
    
    <label>Last Name</label>
    <input type="text" name="lastName" value="${user.lastName}" required>
    <p class="required">*</p><br>
    
    <label>Email Address</label>
    <input type="email" name="email" value="${user.email}" required>
    <p class="required">*</p><br>
    
    
    <label>Address1</label>
    <input type="text" name="address1" value="${user.address1}" required> 
    <p class="required">*</p><br>
    
    
    
    <label>City</label>
    <input type="text" name="city" value="${user.city}" required>
    <p class="required">*</p><br>
    
    <label>State</label>
    <input type="text" name="state" value="${user.state}" required>
    <p class="required">*</p><br>
    
    <label>Zip Code</label>
    <input type="text" name="zip" value="${user.zip}" required>
    <p class="required">*</p><br>
    
    <label>Country</label>
    <input type="text" name="country" value="${user.country}" required> 
    <p class="required">*</p><br>
    
    <label>&nbsp;</label>
    <input type="submit" value="Continue">
</form>
</body>
</html>