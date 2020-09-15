package br.edu.univas.ex1;

import java.util.Scanner;

public class StatApp1 {
	
	public static void main(String[] args) {
		int [] num = lerNum();
		
		addint(num);
		NumAlunos(num);
	}



	private static int[] lerNum() {
		Scanner ler = new Scanner(System.in);
		int[] num =  new int[20];
		for(int i=0; i <num.length; i= i+2 ) {
			System.out.println("Digite a nota: ");
			num[i] = ler.nextInt();
		}
		
		ler.close();
		return num;
	}
	private static void addint(int[] num) {
		for(int i = 0; i<num.length; i=i+2) {
			if(num[i] >= 60) {
				num[ i+1 ] = 1; 
			}else {
				num[ i+1 ] = 0;
			}
		}
		
	}

	private static void NumAlunos(int num[]) {
		int cont = 0;
		for(int i = 1 ; i<num.length  ; i=i+2) {
			
			if(num[i]==1) {
				cont++;
			}
			
			
		}
		System.out.println("Ao total foram aprovados:" + cont + "Alunos.");	
	}
}
