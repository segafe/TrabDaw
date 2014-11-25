/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maria.negocios;

import maria.persistencia.FichaPoliciaDao;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;

/**
 *
 * @author alunos
 */
public class jose {
    
    
    public static void main(String[] args) throws SQLException{

     
            

            FichaPolicial mariazinha = new FichaPolicial();
          
            mariazinha.setNome("Carmelo");
            mariazinha.setCpf("222222222322");
            mariazinha.setResidencia("Rua dos coqueiros");
            mariazinha.setDelito("estupro");
            mariazinha.setData("20/11/2001");
            mariazinha.setHora("09/15");
            mariazinha.setLocal(" bla");

            
            
            
            
          
           FichaPoliciaDao inferno = new FichaPoliciaDao();
           
           inferno.adiciona(mariazinha);
            
            
    
        }
}