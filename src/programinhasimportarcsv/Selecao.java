/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programinhasimportarcsv;

import static javafx.beans.binding.Bindings.select;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author JONATHAN
 */
class Selecao {
    
/* String DATABASE_URL = "jdbc:sqlite:C:\\Users\\JONATHAN\\Documents\\NetBeansProjects\\dados_covid-19\\Banco_de_dados\\teste.db" ;
    public Select * from (select * from teste){
        String  = "SELECT city";
    return
            }*/







    public Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:C:\\Users\\JONATHAN\\Documents\\NetBeansProjects\\dados_covid-19\\Banco_de_dados\\teste.db" ;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    
    /**
     * select all rows in the warehouses table
     */
    public void selectAll(){
        String sql = "SELECT teste FROM city";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("city") +  "\t"); //+ 
                                   //rs.getString("name") + "\t" +
                                  // rs.getDouble("capacity"));
                                  
                                  
                                  
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
   
    /**
     * @param args the command line arguments
     */
   /* public static void main(String[] args) {
        SelectApp app = new SelectApp();
        app.selectAll();
    }*/

}




