<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link href="bootstrap-ecommerce-html/css/bootstrap.css" rel="stylesheet" type="text/css"/>

<!-- Font awesome 5 -->
<link href="bootstrap-ecommerce-html/fonts/fontawesome/css/all.min.css" type="text/css" rel="stylesheet">

<!-- ui style -->
<link href="bootstrap-ecommerce-html/css/ui.css" rel="stylesheet" type="text/css"/>
<link href="bootstrap-ecommerce-html/css/responsive.css" rel="stylesheet" />
<script src="bootstrap-ecommerce-html/js/jquery-2.0.0.min.js" type="text/javascript"></script>

<!-- Bootstrap -->
<script src="bootstrap-ecommerce-html/js/bootstrap.bundle.min.js" type="text/javascript"></script>

<!-- custom javascript -->
<script src="bootstrap-ecommerce-html/js/script.js" type="text/javascript"></script>
    
</head>
<body>

<h2>Select a genre</h2>

<table>

  

  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <c:forEach var="product" items="${products}">
  <tr>
    
    <td>${product.name}</td>
    
  </tr>
  </c:forEach>
  <div class="row">
  <c:forEach var="category" items="${categories}">
     
			<div class="img-wrap">
                            <figcaption class="info-wrap border-top">
  <tr>
      <td class="img-wrap"><img src="images/${category.productImage}.jpg" width="300" height="300"></td>
      <td class="section-title"><a href='products?action=display_user&amp;categoryID=${category.categoryID}&amp;page=1&amp;orderByASC=false'/>${category.name}</a></td>  
      
  </tr>
                
            </figcaption>
		
	
  </c:forEach>
  </div>

</table>
  </div>
  
  


</body>
</html>