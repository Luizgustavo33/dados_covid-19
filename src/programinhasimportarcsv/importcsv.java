/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programinhasimportarcsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author JONATHAN
 */
public class importcsv {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
       //abre um arquivo e cria um file
       File arquivoCSV = new File("C:\\Users\\JONATHAN\\Documents\\NetBeansProjects\\dados_covid-19\\brio_totals - Sheet1.csv");
        
        try{
            
            //cria um scanner para ler o arquivo
            Scanner leitor = new Scanner(arquivoCSV);
            
            //variavel que armazenara as linhas do arquivo
            String linhasDoArquivo = new String();       
            
            
            //ignora a primeira linha do arquivo
            //leitor.nextLine();
            
            //percorre todo o arquivo
            while(leitor.hasNext()){
                
                //recebe cada linha do arquivo
                linhasDoArquivo = leitor.nextLine();
                
             
                //separa os campos entre as virgulas de cada linha
                String[] valoresEntreVirgulas = linhasDoArquivo.split(",");
                
                //imprime a coluna que quiser
                System.out.println("");
            System.out.print(valoresEntreVirgulas[1]);
            System.out.print(valoresEntreVirgulas[2]);
            System.out.print(valoresEntreVirgulas[3]);
            System.out.print(valoresEntreVirgulas[4]);
            System.out.print(valoresEntreVirgulas[5]);
            System.out.print(valoresEntreVirgulas[6]);
            System.out.print(valoresEntreVirgulas[7]);
            System.out.print(valoresEntreVirgulas[8]);
            System.out.print(valoresEntreVirgulas[9]);
            System.out.print(valoresEntreVirgulas[10]);
            System.out.print(valoresEntreVirgulas[11]);
            System.out.print(valoresEntreVirgulas[12]);
            System.out.print(valoresEntreVirgulas[13]);
              
   
            
            }
        
        }catch(FileNotFoundException e){
            
        }
        
    }
    
}

