package com.example.POOExercicio7.CapGemini;


public class Funcionario {
    
    
    //ATRIBUTOS
    private String nome;
    private String sobrenome;
    private float salarioMensal;

    //CONSTRUTOR
    public Funcionario(String nome, String sobrenome, float salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }
    
    //GETTERS AND SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        if(salarioMensal < 0.0f){
            this.salarioMensal = 0.0f;
        } else {
            this.salarioMensal = salarioMensal;
        }
    }
    
    
    //METODOS PUBLICOS
    
    
    
}
