<%-- 
    Document   : invoice
    Created on : Dec 1, 2021, 2:38:51 AM
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

<h1>Your invoice</h1>

<table>
  <tr>
    <th>Date</th>
    <td>${invoice.invoiceDateDefaultFormat}</td>
    <td></td>
  </tr>
  <tr>
      <th class="top">Ship To</th>
    <td>${user.addressHTMLFormat}</td>
    <td></td>
  </tr>
  <tr>
      <td colspan="3"><hr></td>
  </tr>
  <tr>
      <th>Qty</th>
      
      <th>Price</th>
  </tr>

  <c:forEach var="item" items="${invoice.lineItems}">
  <tr>
    <td>${item.quantity}</td>
    <td>${item.totalCurrencyFormat}</td>
  </tr>
  </c:forEach>

  <tr>
    <th>Total:</th>
    <td></td>
    <td>${invoice.invoiceTotalCurrencyFormat}</td>
  </tr>
</table>

<form action="<c:url value='/order/displayUser' />" method="post" id="float_left">
     <input type="submit" value="Edit Address">
</form>

<form action="<c:url value='/order/displayCreditCard' />" method="post">
     <input type="submit" value="Continue">
</form>
    </body>
</html>
