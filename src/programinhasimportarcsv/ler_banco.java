/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programinhasimportarcsv;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author JONATHAN
 */
public class ler_banco { 
    public static void connect( String city, String city_ibge_code, String date, String epidemiological_week,
           String estimated_population ) throws SQLException {
        
        Connection connection = new conexao_banco().getConnection();

            System.out.println("Conexão realizada !!!!");

            Statement statement = connection.createStatement();

            // criando uma tabela
            statement.execute("CREATE TABLE IF NOT EXISTS teste ( city VARCHAR(20),"
                    + "city_ibge_code INT,"
                    + " date DATE,"
                    + " epidemiological_week INT,"
                    + "estimated_population INT)");
            
            statement.execute("INSERT INTO teste (city,city_ibge_code,date,epidemiological_week,estimated_population) "
                    + "VALUES ('"+city+"',"
                            + "'"+city_ibge_code+"',"
                            + "'"+date+"',"
                            + "'"+epidemiological_week+"',"
                            + "'"+estimated_population+"' ) ");
            
         
            
  
}

    static String connect(String city_ibge_code, String date, String epidemiological_week, String estimated_population) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}              