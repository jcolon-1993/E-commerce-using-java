<%-- 
    Document   : complete
    Created on : Dec 1, 2021, 8:06:48 PM
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
        <section>

<h1>Thank you, ${user.firstName}</h1>

<!-- store email address as a global variable and use EL to display it -->

<p>Your order has been submitted. We'll begin processing your 
order right away. A confirmation email has been sent to ${user.email}
<a href="mailto:${custServEmail}">${custServEmail}</a></p>
    </body>
</html>
