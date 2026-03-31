package com.example.POOExercicio4.CapGemini;

public class App {

    public static void main(String[] args) {
        
        Invoice inv = new Invoice(1, "Mousepad", 0, 10.0f);
        
        System.out.println("Valor total = " + inv.getInvoiceAmount());
        
    }
}
