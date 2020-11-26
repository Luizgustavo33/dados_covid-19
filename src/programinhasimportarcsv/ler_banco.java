/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programinhasimportarcsv;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author JONATHAN
 */
public class ler_banco { 
    public static void connect( String city, 
                                String city_ibge_code, 
                                String date,
                                String epidemiological_week,
                                String estimated_population, 
                                String estimated_population_2019,
                                String is_last,
                                String is_repeated,
                                String last_available_confirmed,
                                String last_available_confirmed_per_100k_inhabitants,
                                String last_available_date,
                                String last_available_death_rate,
                                String last_available_deaths,
                                String order_for_place,
                                String place_type,
                                String state,
                                String new_confirmed,
                                String new_deaths
) throws SQLException {
        
        Connection connection = new conexao_banco().getConnection();

            //System.out.println("Conexão realizada !!!!");

            Statement statement = connection.createStatement();

            // criando uma tabela
            statement.execute("CREATE TABLE IF NOT EXISTS teste ( city VARCHAR(30),"
                    + "city_ibge_code INT,"
                    + " date DATE,"
                    + " epidemiological_week INT,"
                    + "estimated_population INT,"
                    + "estimated_population_2019 INT,"
                    + "is_last VACHAR(20),"
                    +"is_repeated VARCHAR(30),"
                    +"last_available_confirmed INT,"
                    +"last_available_confirmed_per_100k_inhabitants DOUBLE,"
                    +"last_available_date DATE ,"
                    +"last_available_death_rate DOUBLE ,"
                    +"last_available_deaths INT,"
                    +"order_for_place INT ,"
                    +"place_type VARCHAR(20) ,"
                    +"state VARCHAR(10),"
                    +"new_confirmed INT,"
                    +"new_deaths INT"
                        + ")");
            
           statement.execute("INSERT INTO teste ("
                    + "city,"
                    + "	city_ibge_code,"
                    + "	date,"
                    + "	epidemiological_week,"
                    + "	estimated_population,"
                    + "	estimated_population_2019,"
                    + "	is_last,"
                    + "	is_repeated,"
                    + "	last_available_confirmed,"
                    + "	last_available_confirmed_per_100k_inhabitants,"
                    + "	last_available_date,"
                    + "	last_available_death_rate,"
                    + "	last_available_deaths,"
                    + "	order_for_place	place_type,"
                    + "	state,"
                    + "	new_confirmed,"
                    + "	new_deaths) " 
                    +"VALUES ('"+city+"',"
                            + "'"+city_ibge_code+"',"
                            + "'"+date+"',"
                            + "'"+epidemiological_week+"',"
                            + "'"+estimated_population+"' "
                            + "'"+estimated_population_2019+"',"                                        
                            + "'"+is_last+"',"
                            + "'"+is_repeated+"',"
                            + "'"+last_available_confirmed+"',"
                            + "'"+last_available_confirmed_per_100k_inhabitants+"',"
                            + "'"+last_available_date+"',"
                            + "'"+last_available_death_rate+"',"
                            + "'"+last_available_deaths+"',"
                            + "'"+order_for_place+"',"
                            + "'"+place_type+"',"
                            + "'"+state+"',"
                            + "'"+new_confirmed+"',"
                            + "'"+new_deaths+"' )" );

              /*    statement.execute("CREATE TABLE IF NOT EXISTS teste ( city VARCHAR(20),"
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
                                                
                */    
    }
}