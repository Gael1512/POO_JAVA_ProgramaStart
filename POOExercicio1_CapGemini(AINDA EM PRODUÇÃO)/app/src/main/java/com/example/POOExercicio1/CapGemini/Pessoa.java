package com.example.POOExercicio1.CapGemini;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;


public class Pessoa {
    
    
    //ATRIBUTOS
    private String nome;
    private String data;
    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    private Date dataNascimento;
    private float altura;
    
    Calendar cal = Calendar.getInstance();
    private int ano;
    private int idade;
    
    private String fim = "Fim do Programa";
    
    //METODOS
    public Pessoa(){
    
        System.out.println("Sistema de Cadastro de Pessoa: ");
        System.out.println("");
        
    }
    
     public SimpleDateFormat getFormatter() {
        return formatter;
    }

    public void setFormatter(SimpleDateFormat formatter) {
        this.formatter = formatter;
    }

    public Calendar getCal() {
        return cal;
    }

    public void setCal(Calendar cal) {
        this.cal = cal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setData(String data){
    
        this.data = data;
    
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) throws ParseException {
        this.dataNascimento = this.formatter.parse(data);
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getAno() {
        return ano;
    }

    public void setAno() {
        this.cal.setTime(dataNascimento);
        this.ano = cal.get(Calendar.YEAR);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade() {
        this.idade = 2026 - ano;
    }

   

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }
    
    
    
    public String imprimirDados(){
        
        System.out.println("");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        
        return fim;
        
        
    }
    
    
    
}
