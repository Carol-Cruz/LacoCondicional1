package lacoCondicional;

import java.util.Scanner;

public class LacoCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner captura = new Scanner(System.in);
		int a,b,c;
		System.out.println("Digite o número A");
		 a = captura.nextInt();
		System.out.println("Digite o número B");
		b = captura.nextInt();
		System.out.println("Digite o número C");
	    c= captura.nextInt();
	    int soma = a + b; 
	    
	    if(soma > c ) {
	    	System.out.println("A soma de A + B é maior que C");
	    }else if(soma <= c) {
	    		System.out.println("A soma de A + B é menor ou igual a C");
	    }
	}
}