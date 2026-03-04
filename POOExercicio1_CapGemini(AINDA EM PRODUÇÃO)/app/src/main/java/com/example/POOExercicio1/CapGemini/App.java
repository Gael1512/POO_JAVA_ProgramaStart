package com.example.POOExercicio1.CapGemini;
import java.util.Date;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        
        Pessoa p = new Pessoa();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o seu nome: ");
        p.setNome(leitor.nextLine());
        System.out.println("");
        
        System.out.println("Informe a sua data de nascimento: (Formato: dd/MM/yyyy ");
        p.setData(leitor.nextLine());
        System.out.println("");
        
        System.out.println("Informe sua altura: ");
        p.setAltura(leitor.nextFloat());
        System.out.println("");
        
        System.out.println("----------------------------------------");
        
        System.out.println(p.imprimirDados());
        
        
    }
}
