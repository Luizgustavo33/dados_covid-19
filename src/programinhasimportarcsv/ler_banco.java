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
            
         
            
           /* statement.execute("CREATE TABLE IF NOT EXISTS covid_19 (\n" +
"     idcovid_19                     INTEGER       NOT NULL,\n" +
"    [horario_estimado_divulgacao ] VARCHAR (100),\n" +
"    status_2                       VARCHAR (30),\n" +
"    origem                         VARCHAR (6),\n" +
"    ms                             VARCHAR (3),\n" +
"    data_boletim                   DATE,\n" +
"    data_coleta                    DATETIME,\n" +
"    state                          VARCHAR (4),\n" +
"    date_dados                     DATE,\n" +
"    confirmed                      INTEGER,\n" +
"    deaths                         VARCHAR (100),\n" +
"    PRIMARY KEY (\n" +
"        idcovid_19\n" +
"    )\n" +
");");
*/
          /*  // inserindo registros
            statement.execute("INSERT INTO covid_19(horario_estimado_divulgacao,status_2, origem, ms, data_boletim, data_coleta,   state, date_dados, confirmed, deaths) "
                                                   + "VALUES (00:44:00, 'ok','para','ok',2020/11/21, 2020/11/20, mg, 2020/11/20, 111, obit     ) ");

            // lendo os registros
            PreparedStatement stmt = connection.prepareStatement("select * from covid_19");
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                Integer id = resultSet.getInt("");
                String nome = resultSet.getString("");

                System.out.println( id + " - " + nome);
            }
*/
}

    static String connect(String city_ibge_code, String date, String epidemiological_week, String estimated_population) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}              