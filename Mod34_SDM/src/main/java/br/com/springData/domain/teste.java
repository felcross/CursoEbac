package br.com.springData.domain;

import java.util.Arrays;

public class teste {

	public static void main(String[] args) {
		
		  int[] numeros = new int[12];

	        for (int i = 0; i < numeros.length; i++) {
	        	numeros[i] = i;
	            System.out.println("for raiz: "+ numeros[i]);
	        }
	        
	        
	        
	        

	        // Exibe os números de 1 a 9
	        for (int numero : numeros) {
	           
	        	 System.out.println("for nutela: "+numero);
	        }
	    }
		

	}


