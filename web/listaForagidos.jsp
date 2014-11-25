
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="maria.persistencia.FichaPoliciaDao"%>
<%@page import="maria.negocios.FichaPolicial"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

            <!-- Latest compiled and minified CSS -->
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">

            <!-- Optional theme -->
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">

            <!-- Latest compiled and minified JavaScript -->
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <div class="jumbotron"> 
                <h1>Oz</h1>
                <h2>listar ficha de foragidos</h2>
            </div>
        <table class="table-bordered">
            <thead>
            <td>Nome</td>
            <td>CPF</td>
            <td>Residencia</td>
            <td>Tipo de Delito</td>
            <td>Data</td>
            <td>Hora</td>
            <td>Local</td>
            <td>Estado</td>
            <td>Avatar</td>
        </thead>
        <%
            FichaPoliciaDao dao = new FichaPoliciaDao();
            List<FichaPolicial> delitos = dao.getListaForagidos();

            for (FichaPolicial delito : delitos) {
        %>
        <tr>
            <td> <%= delito.getNome()%></td>
            <td> <%= delito.getCpf()%> </td>
            <td> <%= delito.getResidencia()%> </td>
            <td> <%= delito.getDelito()%> </td>
            <td> <%= delito.getData()%> </td>
            <td> <%= delito.getHora()%> </td>
            <td> <%= delito.getLocal()%> </td>
            <td> <%= delito.getEstado()%> </td>
            <td> <img src="<%= delito.getAvatar()%>" alt="avatarum" width="30px" height="30px" > </td>

        </tr>
        <%
            }
        %>
    </table>
    <a href="index.jsp">Voltar</a><br>
        </div>
</body>
</html>
