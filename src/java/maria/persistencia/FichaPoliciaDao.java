/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maria.persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import maria.negocios.FichaPolicial;

/**
 *
 * @author alunos
 */
public class FichaPoliciaDao {
// a conexão com o banco de dados private Connection connection; public FichaPoliciaDao() {
 private Connection connection; 
 
public FichaPoliciaDao() throws SQLException {
        this.connection = new ConnectionFactory().getConnection ();
    }



public void adiciona(FichaPolicial contato) {
    String sql = "insert into fichapolicial " + "(nome,cpf,residencia,delito,data,hora,local,estado,avatar)" + " values (?,?,?,?,?,?,?,?,?)";
    try{
        // prepared statement para inserção
        PreparedStatement stmt = connection.prepareStatement(sql);
        // seta os valores
        
        
        stmt.setString(1, contato.getNome());
        stmt.setString(2, contato.getCpf());
        stmt.setString(3, contato.getResidencia());
        stmt.setString(4, contato.getDelito());
        stmt.setString(5, contato.getData());
        stmt.setString(6, contato.getHora());
        stmt.setString(7, contato.getLocal());
        stmt.setString(8, contato.getEstado());
        stmt.setString(9, contato.getAvatar());
        // executa
         stmt.execute();
         stmt.close();
    } catch (SQLException e) {
    throw new RuntimeException(e);

    } 
 } 

public List<FichaPolicial> getLista() throws SQLException{
    
        PreparedStatement stmt = this.connection.prepareStatement("select * from fichapolicial order by delito, nome");
        ResultSet rs = stmt.executeQuery();
        List<FichaPolicial> contatos = new ArrayList<FichaPolicial>();
        while (rs.next()) {
            // criando o objeto FichaPolicial
            FichaPolicial contato = new FichaPolicial(); 

            contato.setId(rs.getLong("id"));
            
            contato.setNome(rs.getString("nome")); 
            
            contato.setCpf(rs.getString("cpf")); 
            
            contato.setResidencia(rs.getString("residencia"));
                        
            contato.setDelito(rs.getString("delito"));
                        
            contato.setData(rs.getString("data"));
                        
            contato.setHora(rs.getString("hora"));
                        
            contato.setLocal(rs.getString("local"));
            
            contato.setEstado(rs.getString("estado"));
            
            contato.setAvatar(rs.getString("avatar"));

            
            contatos.add(contato);
        }
        rs.close(); stmt.close(); 
        return contatos;
    
}
public List<FichaPolicial> getListaForagidos() throws SQLException{
       String sql = "select * from fichapolicial where estado='foragido' order by nome";
    
        // prepared statement para inserção
        PreparedStatement stmt = connection.prepareStatement(sql);

        stmt.execute();
        

        ResultSet rs = stmt.executeQuery();
        List<FichaPolicial> contatos = new ArrayList<FichaPolicial>();
        while (rs.next()) {
            // criando o objeto FichaPolicial
            FichaPolicial contato = new FichaPolicial(); 

            
            contato.setNome(rs.getString("nome")); 
            
            contato.setCpf(rs.getString("cpf")); 
            
            contato.setResidencia(rs.getString("residencia"));
                        
            contato.setDelito(rs.getString("delito"));
                        
            contato.setData(rs.getString("data"));
                        
            contato.setHora(rs.getString("hora"));
                        
            contato.setLocal(rs.getString("local"));
            
            contato.setEstado(rs.getString("estado"));
            
            contato.setAvatar(rs.getString("avatar"));

            
            contatos.add(contato);
        }
        rs.close(); stmt.close(); 
        return contatos;
    
}


public void alteraContato ( FichaPolicial contato ) throws SQLException {
    
        PreparedStatement stmt = connection.prepareStatement ("update fichapolicial set nome= ?, cpf = ? , residencia = ?, delito =?, data = ?, hora = ?, local = ?, avatar = ? where id = ?");
        
        stmt.setString (1 ,contato.getNome());
        stmt.setString (2 ,contato.getCpf());
        stmt.setString (3 ,contato.getResidencia());
        stmt.setString (4 ,contato.getDelito());
        stmt.setString (5 ,contato.getData());
        stmt.setString (6 ,contato.getHora());
        stmt.setString (7 ,contato.getLocal());
        stmt.setString (8, String.valueOf(contato.getId()));
        stmt.setString (9, contato.getAvatar());

        stmt.execute () ;
        stmt.close () ;
 }
public void removeContato(FichaPolicial contato) throws SQLException{
        String sql = "DELETE FROM fichapolicial WHERE id=(?)";
    
        // prepared statement para inserção
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setLong(1, contato.getId());
        stmt.execute();
        stmt.close();
}



}