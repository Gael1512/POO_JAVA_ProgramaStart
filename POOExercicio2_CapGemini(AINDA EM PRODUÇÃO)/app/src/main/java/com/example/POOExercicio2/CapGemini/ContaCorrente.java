package com.example.POOExercicio2.CapGemini;
import java.util.Scanner;


public class ContaCorrente {
    
    //ATRIBUTOS
    private Integer numeroConta = null;
    private String nomeCorrentista = null;
    private float saldo;
    
    private int opcao3 = 0;
    
    Scanner leitor = new Scanner(System.in);
    
    
    //METODO CONSTRUTOR

    public ContaCorrente(String possivelNome, int possivelNumero, int escolhaAqui){
        
        if(escolhaAqui == 1){
        
            setNomeCorrentista(possivelNome);
            setNumeroConta(possivelNumero);
        
        }
       
        if((this.nomeCorrentista == null) && (this.numeroConta == null)){
        
            this.nomeCorrentista = possivelNome;
            this.numeroConta = possivelNumero;
            
            System.out.println("");
        
            System.out.println("Deseja informar o saldo?");
            System.out.println("Se 'SIM' digite '1', se 'NAO' digite qualquer outra tecla.");
            char opcao = leitor.next().charAt(0);
        
            switch(opcao){

                case '1': 

                    System.out.println("Informe o saldo: ");
                    this.saldo = leitor.nextFloat();
                    break;

                default:

                    this.saldo = 0.0f;
                    break;

            }

            
            
            do{
                
                System.out.println("------------------------------------------------");

                System.out.println
                ("BEM VINDO, " + nomeCorrentista + "!");
                System.out.println("");

                System.out.println("Qual OPERACAO deseja fazer hoje?");
                System.out.println("");
                System.out.println("1 - Alterar o seu NOME");
                System.out.println("2 - Fazer um DEPOSITO");
                System.out.println("3 - Realizar um SAQUE");
                System.out.println("4 - Saber seu EXTRATO");
                System.out.println("0 - SAIR");
                opcao3 = leitor.nextInt();

                switch(opcao3){

                    case 1:
                        System.out.println("Digite o nome: ");
                        nomeCorrentista = leitor.next();
                        break;

                    case 2:
                        System.out.println("Digite o valor a ser depositado: ");
                        deposito(leitor.nextFloat());
                        break;

                    case 3:
                        System.out.println("Digite o valor a ser sacado: ");
                        saque(leitor.nextFloat());
                        break;
                    case 4:
                        System.out.println("O seu saldo é: R$ " + saldo);
                        break;

                    case 0:
                        System.out.println("BANCO JAVA AGRADECE! VOLTE SEMPRE!");
                        return;

                    default: 
                        System.out.println
                        ("Esta NAO eh uma opcao valida. Tente novamente!");

                }

            }while(opcao3 != 0);
            
            
            
        } else {
        
            if((nomeCorrentista != possivelNome) || (numeroConta != possivelNumero)){
            
                System.err.println("Seu login esta incorreto! Por favor, tente novamente.");
                
            } else {
            
                
                
                do{
                    
                    System.out.println("------------------------------------------------");
                    
                    System.out.println
                    ("BEM VINDO, " + nomeCorrentista + "!");
                    System.out.println("");


                    System.out.println("Qual OPERACAO deseja fazer hoje?");
                    System.out.println("");
                    System.out.println("1 - Alterar o seu NOME");
                    System.out.println("2 - Fazer um DEPOSITO");
                    System.out.println("3 - Realizar um SAQUE");
                    System.out.println("4 - Saber seu EXTRATO");
                    System.out.println("0 - SAIR");
                    opcao3 = leitor.nextInt();

                    switch(opcao3){

                        case 1:
                            System.out.println("Digite o nome: ");
                            nomeCorrentista = leitor.nextLine();
                            break;

                        case 2:
                            System.out.println("Digite o valor a ser depositado: ");
                            deposito(leitor.nextFloat());
                            break;

                        case 3:
                            System.out.println("Digite o valor a ser sacado: ");
                            saque(leitor.nextFloat());
                            break;
                        case 4:
                            System.out.println("O seu saldo é: R$ " + saldo);
                            break;

                        case 0:
                            System.out.println("BANCO JAVA AGRADECE! VOLTE SEMPRE!");
                            return;

                        default: 
                            System.out.println
                            ("Esta NAO eh uma opcao valida. Tente novamente!");

                    }

                }while(opcao3 != 0);

                }
        
        }
        
        
    }
    
    /*--------------------METODOS--------------------*/
    
    public void alterarNome(String nomeCorrentista){
    
        this.nomeCorrentista = nomeCorrentista;
          
    }
    
    public float deposito(float valor){
    
        saldo = this.saldo + valor;
        System.out.println("Agora o saldo atual é: R$ " + saldo);
        return saldo;
    
    }
    
    public float saque(float valor){
    
        saldo = this.saldo - valor;
        System.out.println("Agora o saldo atual é: R$: " + saldo);
        return saldo;
    
    }
    
    
    
    
    /*--------------------METODOS--------------------*/
    
    /*--------------------GETTERS AND SETTERS--------------------*/

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    /*--------------------GETTERS AND SETTERS--------------------*/
    
    
}
