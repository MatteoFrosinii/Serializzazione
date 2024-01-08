package net.ddns.matte275;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Main1 {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        XmlMapper xmlMapper = new XmlMapper();
        String classeString;
        LocalDateTime ldt = LocalDateTime.now();
        Random random = new Random();

        Classe classe = new Classe(5,"BIA","04-TC");
        for (int i = 0; i < 10; i++) {
            StringBuilder nomeRandom = new StringBuilder();
            StringBuilder cognomeRandom = new StringBuilder();
            int numeroCasuale = random.nextInt(26) + 65;
            nomeRandom.append(Character.toString(numeroCasuale));
            for (int j = 0; j < 4; j++) {
                numeroCasuale = random.nextInt(26) + 97;
                nomeRandom.append(Character.toString(numeroCasuale));
            }
            numeroCasuale = random.nextInt(26) + 65;
            cognomeRandom.append(Character.toString(numeroCasuale));
            for (int j = 0; j < 4; j++) {
                numeroCasuale = random.nextInt(26) + 97;
                cognomeRandom.append(Character.toString(numeroCasuale));
            }
            Date date = new Date(random.nextInt(40)+80 ,random.nextInt(12),random.nextInt(31));
            date.setHours(random.nextInt(24));
            date.setMinutes(random.nextInt(60));
            date.setSeconds(random.nextInt(60));
        
            classe.addAlunno(new Alunno(nomeRandom.toString() , cognomeRandom.toString(), date));
        }
        try {
            classeString = objectMapper.writeValueAsString(classe);
            //System.out.println(classeString);
            objectMapper.writeValue(new File("classe.json"), classe);
            //xmlMapper.writeValue(new File("classe.xml"), classe);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Started at : " + ldt.toString());
        System.out.println("Took : " + LocalDateTime.now().toString());
    }
}
