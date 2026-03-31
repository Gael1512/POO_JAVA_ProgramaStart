package com.example.POOExercicio2.CapGemini;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        ContaCorrente c = new ContaCorrente("Rafael", 12);
        int escolhaMenu = 0;
        
        do{
        
        System.out.println("--------------------------------");
        
        System.out.println("");
        
        System.out.println("Ola, " + c.getNomeCorrentista() + "!");
        System.out.println("");
        System.out.println("O que deseja fazer?");
        System.out.println("1 - Alterar NOME");
        System.out.println("2 - Fazer DEPOSITO");
        System.out.println("3 - Realizar SAQUE");
        System.out.println("4 - Verificar SALDO");
        System.out.println("0 - Encerrar");
        escolhaMenu = leitor.nextInt();
        
        switch(escolhaMenu){
        
            case 1:
                System.out.println("Digite o NOME: ");
                c.alterarNome(leitor.next());
                System.out.println("");
                System.out.println("Nome alterado!");
                break;
                
            case 2:
                System.out.println("Qual o valor que deseja DEPOSITAR?");
                c.deposito(leitor.nextFloat());
                System.out.println("");
                System.out.println("Deposito feito!");
                break;
                
            case 3:
                System.out.println("Qual o valor que deseja SACAR?");
                c.saque(leitor.nextFloat());
                System.out.println("");
                System.out.println("Saque realizado!");
                break;
                
            case 4:
                System.out.println("Seu saldo atual é: R$ " + c.getSaldo());
                break;
            
            case 0:
                System.out.println("Muito obrigado! Volte Sempre!");
                System.out.println("FIM DE PROGRAMA!");
                return;
                
            default:
                System.err.println
                ("ERRO: Essa nao eh uma opcao valida! Tente novamente!");
                
                System.out.println("");
                System.out.println("Gostaria de tentar novamente?");
                System.out.println("Se 'SIM', digite a letra 's'.");
                System.out.println("Se 'NAO', digite outra tecla");
                char novaTentativa = leitor.next().charAt(0);
                if((novaTentativa == 's') || (novaTentativa == 'S')){
                    
                    escolhaMenu = 0; 
                    break;
                    
                } else {
                
                    System.out.println("Muito obrigado! Volte Sempre!");
                    System.out.println("FIM DE PROGRAMA!");
                    return;
                    
                }
        
        }
        
        }while((escolhaMenu >= 0) && (escolhaMenu <= 4));
        
    }
}
