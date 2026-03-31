package com.example.POOExercicio7.CapGemini;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        //variaveis
        Scanner leitor = new Scanner(System.in);
        String nome;
        String sobrenome;
        float salario;
        
        int contador1 = 1;
        
        //---------- PROGRAMA INICIO ----------
        
        System.out.println("SISTEMA DOS DOIS FUNCIONARIOS (PROTOTIPO)");
        System.out.println("");
        System.out.println("");
        
        System.out.println("Informe o nome do funcionario " + contador1 + ": ");
        nome = leitor.next();
        System.out.println("");
        
        System.out.println("Informe o sobrenome do funcionario " + contador1 + ": ");
        sobrenome = leitor.next();
        System.out.println("");
        
        System.out.println("Informe o salario do funcionario " + contador1 + ": ");
        salario = leitor.nextFloat();
        System.out.println("");
        
        Funcionario f1 = new Funcionario(nome, sobrenome, salario);
        contador1++;
        
        System.out.println("");
        System.out.println("----");
        System.out.println("");
        
        System.out.println("SISTEMA DOS DOIS FUNCIONARIOS (PROTOTIPO)");
        System.out.println("");
        System.out.println("");
        
        System.out.println("Informe o nome do funcionario " + contador1 + ": ");
        nome = leitor.next();
        System.out.println("");
        
        System.out.println("Informe o sobrenome do funcionario " + contador1 + ": ");
        sobrenome = leitor.next();
        System.out.println("");
        
        System.out.println("Informe o salario do funcionario " + contador1 + ": ");
        salario = leitor.nextFloat();
        System.out.println("");
        
        Funcionario f2 = new Funcionario(nome, sobrenome, salario);
        contador1++;
        
        //---------- PROGRAMA MENU ----------
        
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("");
        
        System.out.println("FUNCIONARIOS ATIVOS:");
        System.out.println("");
        
        System.out.println("--------------");
        System.out.println("Funcionario: " + f1.getNome() + " " + f1.getSobrenome());
        System.out.println("Salario Mensal: R$ " + f1.getSalarioMensal());
        System.out.println("SALARIO ANUAL: R$ " + (f1.getSalarioMensal() * 12));
        System.out.println("--------------");
        
        System.out.println("");
        
        System.out.println("--------------");
        System.out.println("Funcionario: " + f2.getNome() + " " + f2.getSobrenome());
        System.out.println("Salario Mensal: R$ " + f2.getSalarioMensal());
        System.out.println("SALARIO ANUAL: R$ " + (f2.getSalarioMensal() * 12));
        System.out.println("--------------");
        
        System.out.println("");
        System.out.println("AGORA, VAMOS AUMENTAR SEUS SALARIOS EM 10%");
        
        f1.setSalarioMensal(f1.getSalarioMensal() + (f1.getSalarioMensal() * 0.10f));
        f2.setSalarioMensal(f2.getSalarioMensal() + (f2.getSalarioMensal() * 0.10f));
        
        System.out.println("");
        System.out.println("FUNCIONARIOS ATIVOS:");
        System.out.println("");
        
        System.out.println("--------------");
        System.out.println("Funcionario: " + f1.getNome() + " " + f1.getSobrenome());
        System.out.println("Salario Mensal: R$ " + f1.getSalarioMensal());
        System.out.println("SALARIO ANUAL: R$ " + (f1.getSalarioMensal() * 12));
        System.out.println("--------------");
        
        System.out.println("");
        
        System.out.println("--------------");
        System.out.println("Funcionario: " + f2.getNome() + " " + f2.getSobrenome());
        System.out.println("Salario Mensal: R# " + f2.getSalarioMensal());
        System.out.println("SALARIO ANUAL: R$ " + (f2.getSalarioMensal() * 12));
        System.out.println("--------------");
        //---------- PROGRAMA FIM ----------
        
    }
}
