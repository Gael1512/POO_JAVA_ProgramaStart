package com.example.POOExercicio5.CapGemini;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Disciplina d = new Disciplina();
        int escolha = 0;
        
        System.out.println("Sistema de Notas dos Alunos");
        System.out.println("");
        
        System.out.println("Seja Bem Vindo, Professor!");
        System.out.println("");
        
        System.out.println("Insira o nome do aluno: ");
        d.setNome(leitor.next());
        System.out.println("");
        
        System.out.println("Insira o numero da matricula do aluno: ");
        d.setMatricula(leitor.nextInt());
        System.out.println("");
        
        do{
            
            System.out.println("");
            System.out.println("-------------------------------------");
            System.out.println("");
            System.out.println("Professor, o que deseja fazer agora?");
            System.out.println("");
            System.out.println("1 - Checar o nome e matricula do aluno");
            System.out.println("2 - adicionar nota da PROVA 1");
            System.out.println("3 - adicionar nota da PROVA 2");
            System.out.println("4 - adicionar nota do TRABALHO");
            System.out.println("5 - Verificar a MEDIA do aluno");
            System.out.println("6 - Verificar se o aluno esta na FINAL");
            System.out.println("0 - Sair");
            
            
            escolha = leitor.nextInt();
            System.out.println("");
            
            switch(escolha){
            
                case 1:
                    System.out.println("Nome do aluno: " + d.getNome());
                    System.out.println("Matricula: " + d.getMatricula());
                    break;
                    
                case 2:
                    System.out.println("Qual foi a nota da PROVA 1? ");
                    d.setProva1(leitor.nextFloat());
                    break;
                    
                case 3:
                    System.out.println("Qual foi a nota da PROVA 2? ");
                    d.setProva2(leitor.nextFloat());
                    break;
                    
                case 4:
                    System.out.println("Qual foi a nota do TRABALHO? ");
                    d.setTrabalho(leitor.nextFloat());
                    break;
                
                case 5:
                    d.media();
                    break;
                    
                case 6:
                    d.finall();
                    break;
                    
                case 0:
                    System.out.println("OK! Muito obrigado e Volte sempre!");
                    System.out.println("FIM DO PROGRAMA!");
                    return;
                    
                default:
                    System.err.println("ERRO: Esta nao eh uma opçao!");
                    System.out.println("ERRO: Tente novamente!");
                    
            
            }
            
        } while (escolha != 0);
        
        
    }
}
