package application;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> urna = new HashMap();

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

       try (BufferedReader br = new BufferedReader(new FileReader(path))){

           String line = br.readLine();
           while (line != null){
               String[] fields = line.split(",");
               String name = fields[0];
               int votos = parseInt(fields[1]);

               if(urna.containsKey(name)){
                   int votesAteAgora = urna.get(name);
                   urna.put(name, votos + votesAteAgora);
               }else{
                   urna.put(name, votos);
               }
             //  /Users/rafaelrocha/Documents/PROJETOS/testes-java/exercicio 1/application/in.csv
               line = br.readLine();
           }


           for (String value : urna.keySet()){
               System.out.println(value + ": " + urna.get(value));
           }



       } catch (IOException e) {
           throw new RuntimeException(e);
       }

       sc.close();
    }
}