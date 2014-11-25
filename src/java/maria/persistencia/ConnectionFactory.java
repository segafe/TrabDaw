/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package maria.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
*
* @author alunos
*/
public class ConnectionFactory {
public Connection getConnection() throws SQLException{
DriverManager.registerDriver(new com.mysql.jdbc.Driver());
try {

return DriverManager.getConnection("jdbc:mysql://150.164.102.160/daw-aluno2","daw-aluno2","daw02");
//return DriverManager.getConnection("jdbc:mysql://localhost/escola","root","");
} catch (SQLException ex) {
throw new RuntimeException(ex);
}
}
}