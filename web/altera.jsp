
<%@page import="java.util.List"%>
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
                <h2>alterar ficha</h2>
            </div>        <table class="table-bordered">
            <thead>
            <td>ID</td>
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
            List<FichaPolicial> delitos = dao.getLista();

            for (FichaPolicial delito : delitos) {
        %>
        <tr>
            <td> <%= delito.getId()%></td>
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

                    <form action="mvc">
                        <input type="text" style="display: none;" value="AlteraFichaLogic" name="logica" />
                            ID da ficha a ser alterada: <br><input type="text" name="id"/><br><br>
                            Nome: <br><input type="text" name="nome"/><br><br>
                            cpf: <br><input type="text" name="cpf"/><br><br>
                            Residencia: <br><input type="text" name="residencia"/><br><br>
                            Delito: <br><input type="text" name="delito"/><br><br>
                            Data: <br><input type="text" name="data"/><br><br>
                            Hora: <br><input type="text" name="hora"/><br><br>
                            Local: <br><input type="text" name="local"/><br><br>
                            Estado: <br><input type="text" name="estado"/><br><br>
                            Avatar: <br><input type="text" name="avatar"/><br><br>
                        <input type="submit"></input> 
                    </form>
                          <a href="index.jsp">Voltar</a><br>
        </div>
    </body>
</html>
