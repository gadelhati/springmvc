<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Aplicação Demo Spring MVC</title>
    </head>
    <body>
        <h1>Listagem de uvas</h1>
        <table>
            <thead>
                <tr>
                    <th>idUva</th>
                    <th>nomeUva</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="uva" items="${uvas}">
                    <tr>
                        <td>${uva.idUva}</td>
                        <td>${uva.nomeUva}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>