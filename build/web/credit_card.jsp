<%-- 
    Document   : credit_card
    Created on : Dec 1, 2021, 3:45:55 AM
    Author     : jimmy
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- begin middle column -->

<section class="cart">

<h1>Enter your credit card information</h1>

<form action="<c:url value='completeOrder' />" method="post">
   <table>
   <tr> 
       <td><b>Credit card type</b></td>
      <td>
          <select name="creditCardType" size="1">
            <option value="Visa">Visa</option>
            <option value="Mastercard">Mastercard</option>
            <option value="AmEx">American Express</option>
          </select>
      </td>
   </tr>
   <tr> 
      <td><b>Card number</b></td>
      <td><input type="text" size="20" name="creditCardNumber" 
                 maxlength="25" required></td>
   </tr>
   <tr> 
      <td><b>Expiration date (mm/yyyy)</b></td>
      <td><select name="creditCardExpirationMonth">
            <option value="01">01</option>
            <option value="02">02</option>
            <option value="03">03</option>
            <option value="04">04</option> 
            <option value="05">05</option>
            <option value="06">06</option>
            <option value="07">07</option>
            <option value="08">08</option> 
            <option value="09">09</option>
            <option value="10">10</option>
            <option value="11">11</option>
            <option value="12">12</option> 
          </select>
          /
          
      <select name="creditCardExpirationYear">
                 <option value="2022">2022</option>
            <option value="2023">2023</option>
            <option value="2024">2024</option>
            <option value="2024">2024</option> 
            <option value="2026">2026</option>
            <option value="2027">2027</option>
            <option value="2028">2028</option>
            <option value="202908">2029</option> 
            <option value="2030">2030</option>
            <option value="2031">2031</option>
            <option value="2032">2032</option>
            <option value="2034">2034</option> 
         
              
      </td>
   </tr>
   <tr>
      <td></td>
      <td><input type="submit" value="Submit Order"></td>
   </tr>
   </table>
</form>
    </body>
</html>
