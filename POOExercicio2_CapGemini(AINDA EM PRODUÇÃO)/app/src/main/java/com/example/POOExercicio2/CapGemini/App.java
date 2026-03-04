
package com.example.POOExercicio2.CapGemini;

import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        
        /* ----------- VARIAVEIS ---------- */
    
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();
        ContaCorrente c;
        
        
        String nome = null;
        Integer numero = null;
        int conta = 0;
        int escolha = 0;
        int escolha2 = 0;
        
        int validacao = 0;
        
        
        
        /* ----------- VARIAVEIS ---------- */
        
        while(escolha != 1){
        
        
        System.out.println("BEM VINDO AO BANCO JAVA!");
        System.out.println("");
        
        do{
        
        System.out.println("Voce ja possui conta?");
        System.out.println("1 - SIM");
        System.out.println("2 - NAO");
        escolha = leitor.nextInt();
        
        switch(escolha){
        
            case 1:
                System.out.println("Informe seu nome: ");
                nome = leitor.next();
                System.out.println("");
                
                System.out.println("Informe o numero da conta: ");
                numero = leitor.nextInt();
                
                conta = 1;
                
                c = new ContaCorrente(nome, numero, conta);
                
                validacao = c.getValidacao();
                
                break;
                
            case 2:
                
                System.out.println("Informe seu nome: ");
                nome = leitor.next();
                System.out.println("");
                
                System.out.println("Agora iremos gerar a sua conta. ");
                System.out.println("gerando numero da conta..........");
                numero = gerador.nextInt(10001) + 1;
                System.out.println("Anota ai! O numero da sua conta é: " + numero);
                
                conta = 2;
                
                c = new ContaCorrente(nome, numero, conta);
                
                validacao = c.getValidacao();
                
                break;
                
            default:
                System.err.println("Esta Opcao NAO EH VALIDA! Tente Novamente");
            
        }
        
        }while((escolha < 1) || (escolha > 2));
        
        if(validacao == 1){
        
            System.out.println("");
            
        }
    
      }  
    
    }
}
