/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programinhasimportarcsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author JONATHAN
 */
public class importcsv {
    
    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
            
       //abre um arquivo e cria um file
       File arquivoCSV = new File("C:\\Users\\JONATHAN\\Documents\\NetBeansProjects\\dados_covid-19\\caso_full.csv");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digete Quantas linhas: ");
        
        int numero = entrada.nextInt(); 
        
        try{
            
            //cria um scanner para ler o arquivo
            Scanner leitor = new Scanner(arquivoCSV);
            
            //variavel que armazenara as linhas do arquivo
            String linhasDoArquivo = new String();       
            
            
            //ignora a primeira linha do arquivo
            //leitor.nextLine();
            int contar = 0;
            //percorre todo o arquivo
            while(leitor.hasNext() && contar <= numero  ){
                
                //recebe cada linha do arquivo
                linhasDoArquivo = leitor.nextLine();
                
             
                //separa os campos entre as virgulas de cada linha
                String[] valoresEntreVirgulas = linhasDoArquivo.split(",");
                
                //imprime a coluna que quiser

               System.out.println("");
            System.out.printf("%-30s",valoresEntreVirgulas[0]);    
            System.out.printf("%-30s",valoresEntreVirgulas[1]);
            System.out.printf("%-30s",valoresEntreVirgulas[2]);
            System.out.printf("%-30s",valoresEntreVirgulas[3]);
            System.out.printf("%-30s",valoresEntreVirgulas[4]);
            System.out.printf("%-30s",valoresEntreVirgulas[5]);
            System.out.printf("%-30s",valoresEntreVirgulas[6]);
            System.out.printf("%-30s",valoresEntreVirgulas[7]);
            System.out.printf("%-30s",valoresEntreVirgulas[8]);
            System.out.printf("%-30s",valoresEntreVirgulas[9]);
            System.out.printf("%-30s",valoresEntreVirgulas[10]);
            System.out.printf("%-30s",valoresEntreVirgulas[11]);
            System.out.printf("%-30s",valoresEntreVirgulas[12]);
            System.out.printf("%-30s",valoresEntreVirgulas[13]);
            System.out.printf("%-30s",valoresEntreVirgulas[14]);
            System.out.printf("%-30s",valoresEntreVirgulas[15]);
            System.out.printf("%-30s",valoresEntreVirgulas[16]);
            System.out.printf("%-30s",valoresEntreVirgulas[17]);
            
            String city = valoresEntreVirgulas[0];
            String city_ibge_code = valoresEntreVirgulas[1];
            String date = valoresEntreVirgulas[2];
            String epidemiological_week = valoresEntreVirgulas[3];
            String estimated_population  = valoresEntreVirgulas[4];
            String estimated_population_2019 = valoresEntreVirgulas[5];
            String is_last = valoresEntreVirgulas[6];
            String is_repeated = valoresEntreVirgulas[7];
            String last_available_confirmed = valoresEntreVirgulas[8]; 
            String last_available_confirmed_per_100k_inhabitants = valoresEntreVirgulas[9];
            String last_available_date = valoresEntreVirgulas[10];
            String last_available_death_rate = valoresEntreVirgulas[11];
            String last_available_deaths = valoresEntreVirgulas[12];
            String order_for_place = valoresEntreVirgulas[13];
            String place_type = valoresEntreVirgulas[14];
            String state = valoresEntreVirgulas[15];
            String new_confirmed = valoresEntreVirgulas[16];
            String new_deaths = valoresEntreVirgulas[17];

        
            
            ler_banco ler = new ler_banco();
        ler_banco.connect(city, city_ibge_code,	date,epidemiological_week,estimated_population,estimated_population_2019,
                is_last,is_repeated,last_available_confirmed,last_available_confirmed_per_100k_inhabitants,
                last_available_date, last_available_death_rate,last_available_deaths,
                order_for_place,place_type,state,new_confirmed,new_deaths);     
            
            
            contar++;
            }
       
        
        
        
        
        }catch(FileNotFoundException e){
            
        }
        
    }
    
}

