package com.example.POOExercicio6.CapGemini;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Elevador e = new Elevador();
        char inicializa;
        String eTerreo;
        int escolha = 0;
        
        System.out.println("Sistema do Elevador");
        System.out.println("Gostaria de Inicializar?");
        inicializa = leitor.next().charAt(0);
        
        if((inicializa == 's') || (inicializa == 'S')){

            System.out.println("Qual é o total de andares do predio? ");
            int andares = leitor.nextInt();
            System.out.println("");
            
            System.out.println("Qual é a capacidade maxima de pessoas no Elevador?");
            int capacidade = leitor.nextInt();
            System.out.println("");
            
            e.Inicializa(andares, capacidade, 0, 0);
            
            System.out.println("-----------------------------");
            System.out.println("ELEVADOR ON!");
            System.out.println("");
            
            do{
                
                int terreo = e.getAndarAtual();
               
                System.out.println("----------------------------------");
                System.out.println("MENU DO ELEVADOR");
                System.out.println("");
                
                if(terreo == 0){
                    System.out.println("-----------------------------------------");
                    System.out.print("Andar Atual: Terreo ; ");
                    System.out.println("Total de Andares: " + e.getTotalAndares() + " ;");
                    System.out.print("Pessoas no Elevador: " + e.getPessoasNoElevador() + " ; ");
                    System.out.println("Capacidade Maxima de Pessoas: " + e.getCapacidadePessoas() + " ;");
                    System.out.println("-------------------------------------------");
                } else {
                    System.out.println("-----------------------------------------");
                    System.out.print("Andar Atual: " + e.getAndarAtual() + " ; ");
                    System.out.println("Total de Andares: " + e.getTotalAndares() + " ;");
                    System.out.print("Pessoas no Elevador: " + e.getPessoasNoElevador() + " ; ");
                    System.out.println("Capacidade Maxima de Pessoas: " + e.getCapacidadePessoas() + " ;");
                    System.out.println("-------------------------------------------");
                }
                
                System.out.println("");
                System.out.println("1 - Entrar");
                System.out.println("2 - Sair");
                System.out.println("3 - Subir");
                System.out.println("4 - Descer");
                System.out.println("0 - FINALIZAR PROGRAMA");
                System.out.println("");
                escolha = leitor.nextInt();
                
                switch(escolha){
                
                    case 1:
                        System.out.println("Quantas pessoas vão entrar?");
                        e.Entra(leitor.nextInt());
                        break;
                    case 2:
                        System.out.println("Quantas pessoas estão saindo?");
                        e.Sai(leitor.nextInt());
                        break;
                    case 3:
                        e.Sobe();
                        break;
                    case 4:
                        e.Desce();
                        break;
                    case 0:
                        System.out.println("Muito obrigado! Volte Sempre!");
                        System.out.println("");
                        System.err.println("FIM DO PROGRAMA!");
                        return;
                    default:
                        System.err.println("ERRO: Nao eh uma opcao!");
                        System.err.println("ERRO: Tente Novamente");
                        break;
                
                }
                
                
            }while(escolha != 0);
            
    
        } else {
        
            System.out.println("Tudo bem! Volte Sempre!");
            System.out.println("");
            System.err.println("FIM DO PROGRAMA!");
            
        }
        
    }
}
