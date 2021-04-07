<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Aplicação Demo Spring MVC</title>
    </head>
    <body>
        <h1>Listagem de vinhos</h1>
        <table>
            <thead>
                <tr>
                    <th>nomeVinho</th>
                    <th>ano</th>
                    <th>tipo</th>
                    <th>qtdEstoque</th>
                    <th>preco</th>
                    <th>uva</th>
                    <th>idUva</th>
                    <th>nomeUva</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="vinho" items="${vinhos}">
                    <tr>
                        <td>${vinho.nomeVinho}</td>
                        <td>${vinho.ano}</td>
                        <td>${vinho.tipo}</td>
                        <td>${vinho.qtdEstoque}</td>
                        <td>${vinho.preco}</td>
                        <td>${vinho.uva}</td>
                        <td>${vinho.uva.idUva}</td>
                        <td>${vinho.uva.nomeUva}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>