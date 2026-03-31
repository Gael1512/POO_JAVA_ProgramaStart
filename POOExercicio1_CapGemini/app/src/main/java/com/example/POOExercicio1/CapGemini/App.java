package com.example.POOExercicio1.CapGemini;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Pessoa p = new Pessoa();
        String dataString;
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("Bem-vindo ao meu sistema! ");
        System.out.println("");
        System.out.println("Informe o seu nome: ");
        p.setNome(leitor.next());
        System.out.println("");
        
        System.out.println("Informe sua data de Nascimento: ");
        System.out.println("Digite nesse formato: 'dd/MM/yyyy'");
        dataString = leitor.next();
        p.setDataNascimento(LocalDate.parse(dataString, formatador));
        System.out.println("");
        
        System.out.println("Informe a sua altura: ");
        p.setAltura(leitor.nextFloat());
        System.out.println("");
        
        System.out.println("Aqui estao seus dados: ");
        System.out.println("");
        p.imprimirDados();
        p.calculaIdade();
        System.out.println("--------------------------");
        
    }
}
