
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
                <h2>Ficha Policial</h2>
            </div>
                   

                    <form action="mvc">
                        <input type="text" style="display: none;" value="AdicionaContatoLogic" name="logica" />
                            Nome: <input type="text" name="nome"/><br><br>
                            cpf: <input type="text" name="cpf"/><br><br>
                            Residencia: <input type="text" name="residencia"/><br><br>
                            Delito: <input type="text" name="delito"/><br><br>
                            Data: <input type="text" name="data"/><br><br>
                            Hora: <input type="text" name="hora"/><br><br>
                            Local: <input type="text" name="local"/><br><br>
                            Estado: <input type="text" name="estado"/><br><br>
                            Avatar: <input type="text" name="avatar"/><br><br>
                        <input type="submit"></input> 
                    </form>
                          <a href="index.jsp">Voltar</a><br>
        </div>
    </body>
</html>
