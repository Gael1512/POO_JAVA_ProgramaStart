package com.example.POOExercicio5.CapGemini;


public class Disciplina {
    
    //ATRIBUTOS
    private int matricula;
    private String nome;
    private float prova1;
    private float prova2;
    private float trabalho;

    private float media;
    //CONSTRUTOR
    public Disciplina() {
    }
    
    
    //METODOS
    
    public float media(){
    
        float notaTotal = this.prova1 + this.prova2 + this.trabalho;
        this.media = notaTotal / 3;
        
        System.out.println("A media deste aluno é: " + media);
        
        return media;
    
    }
    
    
    public float finall(){
       
        float finall = 2.0f - media;
        
        if(finall <= 0){
        
            System.out.println("Aluno aprovado! NAO precisa fazer PROVA FINAL!");
            
        } else if(finall > 1.5f){
        
            System.out.println("Aluno REPROVADO! Nem adianta fazer PROVA FINAL");
        
        } else {
        
            System.out.println("Aluno precisa fazer a PROVA FINAL");
            
        }
        
        return finall;
    
    }
    
    
    //GETTERS AND SETTERS

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getProva1() {
        return prova1;
    }

    public void setProva1(float prova1) {
        this.prova1 = prova1;
        
        if((prova1 < 0) || (prova1 > 2.5f)){
            System.err.println("ERRO: As notas das provas só valem de 0 a 2,5!");
            System.err.println("ERRO: Por favor, tente novamente!");
            this.prova1 = 0.0f;
        }
    }

    public float getProva2() {
        return prova2;
    }

    public void setProva2(float prova2) {
        this.prova2 = prova2;
        
        if((prova2 < 0) || (prova2 > 2.5f)){
            System.err.println("ERRO: As notas das provas só valem de 0 a 2,5!");
            System.err.println("ERRO: Por favor, tente novamente!");
            this.prova2 = 0.0f;
        }
    }

    public float getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(float trabalho) {
        this.trabalho = trabalho;
        
        if((trabalho < 0) || (trabalho > 2.0f)){
            System.err.println("ERRO: A nota do trabalho só vale de 0 a 2!");
            System.err.println("ERRO: Por favor, tente novamente!");
            this.trabalho = 0.0f;
        }
    }
    
    
    
    
    
}
