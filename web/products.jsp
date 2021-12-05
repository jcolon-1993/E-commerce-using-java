<%-- 
    Document   : products
    Created on : Nov 20, 2021, 5:31:26 PM
    Author     : jimmy
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Products Page</title>
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
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <body>
        
        <h2><a href="categories">Home</a></h2>
        
    <table>

    <tr>
      <th></th>
      <th>Name</th>
      <th>Description</th>
        <th><a href="products?action=display_user&amp;categoryID=${categoryID}&amp;page=${currentPage}&amp;orderByASC=true">Price</a></th>
    </tr>



  <c:forEach var="item" items="${products}">
       
                <tr>
                   
                      <td class="img-wrap"><img src="images/${item.productImage}.jpg" width="900" height="200""></td>
                    
                        <td class="title mt-2 h5">${item.name}</td>
                        <td>${item.description}</td>
                        
                            <div class="price-wrap mt-2">
                                <td class="price h5">$${item.price}</td>
                            </div>
                            <td> 
                                <a href="products?action=display_user&amp;categoryID=${categoryID}&amp;page=${i}&amp;orderByASC=${flag}">
                                <form  method="post" action="<c:url value='/order/addItem'/>">
                                    <input type="hidden" name="productCode" value="${item.code}">
                                    <input class="btn btn-primary" type="submit" value="Add To Cart"Add To Cart>
                                </form>
                                    </a>
                        </td>
                </tr>
            
  </c:forEach>
  
  
  </table>

    <c:if test="${currentPage != 1}">
        <td><a href="products?action=display_user&amp;categoryID=${categoryID}&amp;page=${currentPage - 1}&amp;orderByASC=${flag}">Previous</a></td>
    </c:if>

<table border="1" cellpadding="5" cellspacing="5">
        <tr>
            <c:forEach begin="1" end="${noOfPages}" var="i">
                <c:choose>
                    <c:when test="${currentPage eq i}">
                        <td>${i}</td>
                    </c:when>
                        <c:when test="${flag == true}">
                        <td><a href="products?action=display_user&amp;categoryID=${categoryID}&amp;page=${i}&amp;orderByASC=${flag}">${i}</a></td>
                    </c:when>
                    <c:otherwise>
                        <td><a href="products?action=display_user&amp;categoryID=${categoryID}&amp;page=${i}&amp;orderByASC=false">${i}</a></td>
                    </c:otherwise>
                        
                </c:choose>
            </c:forEach>
        </tr>
    </table>
  
  <c:if test="${currentPage lt noOfPages}">
        <td><a href="products?action=display_user&amp;categoryID=${categoryID}&amp;page=${currentPage + 1}&amp;orderByASC=false">Next</a></td>
    </c:if>

        

    </body>
</html>
