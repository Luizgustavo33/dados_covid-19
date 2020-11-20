/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programinhasimportarcsv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JONATHAN
 */
public class conexao_banco {
    private final String DATABASE_URL = "jdbc:sqlite:C:\\Users\\JONATHAN\\Documents\\NetBeansProjects\\dados_covid-19\\Banco_de_dados\\covid_19.db";

      public Connection getConnection() {

        try {
            Connection conn = DriverManager.getConnection(DATABASE_URL);
            if (conn != null) {
                System.out.println("SQLite – Conexão Estabelecida!");
            } else {
                System.out.println("Falha ao tentar estabelecer a conexão");
            }
            return conn;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
      }
    
}
