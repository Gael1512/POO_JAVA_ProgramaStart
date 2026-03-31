package com.example.POOExercicio2.CapGemini;

import java.util.Scanner;


public class ContaCorrente {
    
    //ATRIBUTOS
    private String nomeCorrentista;
    private int numeroConta;
    private float saldo;
    
    private int escolha;
    Scanner leitor = new Scanner(System.in);
    
    //CONSTRUTOR
    public ContaCorrente(String nomeCorrentista, int numeroConta) {
        this.alterarNome(nomeCorrentista);
        this.setNumeroConta(numeroConta);
        
        System.out.println("Deseja adicionar saldo?");
        System.out.println("Se 'SIM', digite 1.");
        System.out.println("Se 'NAO', digite qualquer outra tecla.");
        escolha = leitor.nextInt();
        
        if(escolha == 1){
        
            System.out.println("Insira o valor do saldo: ");
            this.setSaldo(leitor.nextFloat());
            System.out.println("");
            System.out.println("OK! Vamos Prosseguir");
            
        } else {
        
            System.out.println("");
            System.out.println("OK! Vamos Prosseguir");
        
        }
        
        int escolhaMenu = 0;
        
        
    }
    
    
    //METODOS
    
    

    public void alterarNome(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }
    
    public float deposito(float deposito){
    
        this.saldo = saldo + deposito;
        return saldo;
    
    }
    
    public float saque(float saque){
    
        this.saldo = saldo - saque;
        return saldo;
    
    }
    
    
    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    
    
    
    
    
}
