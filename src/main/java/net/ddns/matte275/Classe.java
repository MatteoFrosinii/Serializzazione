package net.ddns.matte275;

import java.util.ArrayList;

public class Classe {
    protected int numero;
    protected String sezione;
    protected String aula;
    protected ArrayList<Alunno> alunni;
    public Classe() {
    }
    public Classe(int numero, String sezione, String aula) {
        this.numero = numero;
        this.sezione = sezione;
        this.aula = aula;
        this.alunni = new ArrayList<>();
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getSezione() {
        return sezione;
    }
    public void setSezione(String sezione) {
        this.sezione = sezione;
    }
    public String getAula() {
        return aula;
    }
    public void setAula(String aula) {
        this.aula = aula;
    }
    public void addAlunno(Alunno alunno){
        this.alunni.add(alunno);
    }
    public ArrayList<Alunno> getAlunni() {
        return alunni;
    }
    public void setAlunni(ArrayList<Alunno> alunni) {
        this.alunni = alunni;
    }
        
}