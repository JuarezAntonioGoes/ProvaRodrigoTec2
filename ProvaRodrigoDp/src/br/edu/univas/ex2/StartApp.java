package br.edu.univas.ex2;

import java.util.Scanner;

public class StartApp {
	  public static void main(String[] args) {
		  
		Scanner scan = new Scanner (System.in);
		
	    String palavra1;
	    int tam;
	    System.out.println("Informe a frase: ");
	    palavra1 = scan.nextLine();
	    
	    tam = palavra1.length();
	    char[] arrayTemporaria = new char[tam];
	    char[] arrayCaractere = new char[tam];
	 
	    for (int i = 0; i < tam; i++) {
	      arrayTemporaria[i] = palavra1.charAt(i);
	    }
	 
	    for (int j = 0; j < tam; j++) {
	      arrayCaractere[j] = arrayTemporaria[tam - 1 - j];
	    }
	 
	    String palindromoReverso = new String(arrayCaractere);
	    System.out.println(palindromoReverso);
	  
	    scan.close();
	  }
}