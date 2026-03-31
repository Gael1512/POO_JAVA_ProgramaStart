package com.example.POOExercicio1.CapGemini;

import java.time.LocalDate;


public class Pessoa {
    
    //ATRIBUTOS
    private String nome;
    private LocalDate dataNascimento;
    private float altura;
    //CONSTRUTOR

    public Pessoa() {
    }
    
    
    //METODOS
    public String imprimirDados(){
        
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Altura: " + altura);
    
        return nome;
    
    }
    
    public int calculaIdade(){
    
        LocalDate hoje = LocalDate.now();
        int anoAtual = hoje.getYear();
        
        int anoNascimento = this.dataNascimento.getYear();
        
        int idade = anoAtual - anoNascimento;
        
        System.out.println("Sua idade eh: " + idade);
        
        return idade;
    
    }
    
    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    
}
