<%-- 
    Document   : index
    Created on : Jul 22, 2016, 12:16:18 PM
    Author     : Anghel Leonard
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proxy data source</title>
    </head>
    <body>        
        <h1>Insert three records ...</h1>
        <form method="get" action="${pageContext.request.contextPath}/insertwithbatching">
            <input type="submit" value="Insert 500 records"/>
        </form>
    </body>
</html>
