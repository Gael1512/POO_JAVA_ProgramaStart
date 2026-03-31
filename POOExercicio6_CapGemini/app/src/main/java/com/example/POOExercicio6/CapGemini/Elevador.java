package com.example.POOExercicio6.CapGemini;


public class Elevador {
    
    //ATRIBUTOS
    private int andarAtual = 0;
    private int totalAndares;
    private int capacidadePessoas;
    private int pessoasNoElevador;

    
    //CONSTRUTOR
    public Elevador() {
    }
    
    //METODOS
    
    public int Inicializa
    (int totalAndares, int capacidadePessoas, int andarAtual, int pessoasNoElecador)
    {
        System.out.println("INICIALIZANDO O SISTEMA DO ELEVADOR");
        System.out.println("INICIALIZANDO...");
        System.out.println("");
        
        this.setAndarAtual(0);
        this.setCapacidadePessoas(capacidadePessoas);
        this.setTotalAndares(totalAndares);
        this.setPessoasNoElevador(0);
        
        return totalAndares;
    
    }
    
    public int Entra(int pessoas){
    
        System.out.println("Adicionando " + pessoas + " no Elevador...");
        System.out.println("");
        
        if((this.pessoasNoElevador + pessoas) > this.capacidadePessoas){
            
            System.err.println("ERRO: Ultrapassa capacidade permitida!");
            System.err.println("ERRO: tente novamente!");
            System.out.println("");
            
        } else {
        
            this.pessoasNoElevador = pessoasNoElevador + pessoas;
            System.out.println("Adicionadas com sucesso!");
            System.out.println("");
        
        }
        
        
        System.out.println("Quantidade de pessoas: " + getPessoasNoElevador());
        System.out.println("");
        return pessoas;
        
    }
    
    public int Sai(int pessoas){
    
        System.out.println("Retirando " + pessoas + " do Elevador...");
        System.out.println("");
        
        if((this.pessoasNoElevador - pessoas) < 0){
        
            System.err.println("ERRO: Não tem mais pessoas para sair!");
            System.err.println("ERRO: tente novamente!");
            System.out.println("");
        
        } else {
        
            this.pessoasNoElevador = pessoasNoElevador - pessoas;
            System.out.println("Retiradas com sucesso!");
            System.out.println("");
        
        }
        
        
        
        System.out.println("Quantidade de pessoas: " + getPessoasNoElevador());
        System.out.println("");
        return pessoas;
    
    }
    
    public int Sobe(){
    
        System.out.println("Subindo andar...");
        System.out.println("");
        
        if((this.andarAtual + 1) > this.totalAndares){
        
            System.err.println("ERRO: Ja estamos no ultimo andar!");
            System.err.println("ERRO: Tente novamente");
            System.out.println("");
        
        } else {
        
            this.andarAtual++;
            System.out.println("Sucesso! Chegamos ao proximo andar!");
            System.out.println("Andar atual: " + andarAtual);
            System.out.println("");
        
        }
        
        return andarAtual;
    
    }
    
    public int Desce(){
    
        System.out.println("Descendo andar...");
        System.out.println("");
        
        if((this.andarAtual - 1) < 0){
        
            System.err.println("ERRO: Ja estamos no terreo!");
            System.err.println("ERRO: Tente novamente");
            System.out.println("");
        
        } else {
        
            this.andarAtual--;
            System.out.println("Sucesso! Chegamos ao proximo andar!");
            
            if(andarAtual == 0){
            
                System.out.println("Andar atual: Terreo");
                System.out.println("");
                
            } else {
            
                System.out.println("Andar atual: " + andarAtual);
                System.out.println("");
            
            }
            
        
        }
        
        return andarAtual;
    
    }
    
    
    //GETTERS AND SETTERS

    public int getAndarAtual() {       
        return andarAtual;      
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }

    public void setCapacidadePessoas(int capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }

    public int getPessoasNoElevador() {
        return pessoasNoElevador;
    }

    public void setPessoasNoElevador(int pessoasNoElevador) {
        this.pessoasNoElevador = pessoasNoElevador;
    }
    
    
}
