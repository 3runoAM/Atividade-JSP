<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Página do formulário</title>
    </head>
    <body>
        <h3>Preencha o Formulário</h3>
        <form action="ProcessForm" method="post">
            Nome: <input type="text" name="nome"><br>
            Email: <input type="email" name="email"><br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
