<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta charset="UTF-8"/>
        <meta name="viewport" content="width=width-device, initial-scale=">
        <title>Lista de itens.</title>
    </head>

    <body>
        <h1>Lista de frutas</h1>
        <c:forEach var="fruta" items="${listaFrutas}">
            <ul>
                <li>
                    <c:out value="${fruta}" />
                </li>
            </ul>
        </c:forEach>
    </body>
</html>