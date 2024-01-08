package net.ddns.matte275;
import java.io.File;
import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main2 {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        LocalDateTime ldt = LocalDateTime.now();
        try {
        Classe classe = objectMapper.readValue(new File("classe.json"), Classe.class);
        System.out.println("Numero: " + classe.getNumero());
        System.out.println("Sezione: " + classe.getSezione());
        System.out.println("Aula: " + classe.getAula());
        System.out.println("Questa classe ha " + classe.getAlunni().size() + " alunni:");
        for(Alunno i : classe.getAlunni()){
            System.out.println("Alunno numero: " + (classe.getAlunni().indexOf(i)+1));
            System.out.println("Nome alunno: " + i.getNome());
            System.out.println("Nome alunno: " + i.getCognome());
            System.out.println("Nome alunno: " + i.getDataDiNascita().toString() + "\n");
        }
        System.out.println("Started at : " + ldt.toString());
        System.out.println("Took : " + LocalDateTime.now().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}