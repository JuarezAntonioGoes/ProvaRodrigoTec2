package br.edu.univas.ex3;

import java.util.Scanner;

public class StartApp3 {
	

	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        String palin = "";
	        
	        System.out.println("Insira a palavra: ");
	        String nome = sc.nextLine();
	        for (int i = (nome.length() - 1);i >= 0; i--) {
	        	palin = palin + nome.charAt(i);
	        }
	        if (palin.toLowerCase().equals(nome.toLowerCase())) {
	            System.out.println("Pal�ndromo!");
	        } else {
	            System.out.println("N�o � Pal�ndromo!");
	        }
	        sc.close();
	    }
	    
	
}
