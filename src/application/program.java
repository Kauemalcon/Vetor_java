package application;

import java.util.Locale;
import java.util.Scanner;

import entities.estudante;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    
	    System.out.println("Quantos quartos deseja alugar");
	    int x = sc.nextInt();
	    
	    estudante[] vect = new estudante[10];
	    
	    for(int i = 1; i <= x; i++)
	    {
	    	System.out.println();
	    	System.out.println("quarto N#"+ i);
	    	System.out.print("Nome: ");
	    	String nome = sc.next();
	    	
	    	System.out.print("Email: ");
	    	String email = sc.next();
	    
	    	System.out.print("Quarto: ");
	    	int quartoalugado = sc.nextInt();
	    	vect[quartoalugado] = new estudante(nome, email);
        }
	    
	    System.out.println("Quartos alugados:");
	   for (int i = 0; i < 10; i++)
		 if(vect[i] != null)
	     {
	    	System.out.println(i + ":" + vect[i].tostring());
	     }
	    
//	    System.out.println("Entre com o valor");
//	    int x = sc.nextInt();
//	    
//	    double [] vect = new double [x];
	    
//	    for(int i = 0; i < x; i++)
//	    {
//	    	vect[i] = sc.nextDouble();
//	    }
//	    
//	    double soma = 0;
//	    
//	    for(int i = 0; i < x; i++)
//	    {
//	    	soma += vect[i];
//	    }
//	    
//	    double valor = soma / x ;
//	    
//	    System.out.printf("Media: %.2f%n",valor);
//	    String nome = "";
//	    double preco = 0;
//	    
//	    for(int i = 0; i < x; i++)
//		    {
//	    	    nome = sc.next();
//	    	    ///preco = sc.nextDouble();
//		    	vect[i] = sc.nextDouble();
//		    }
//		    
//		    double soma = 0;
//		    
//		    for(int i = 0; i < x; i++)
//		    {
//		    	soma += vect[i];
//		    }
//		    
//		    double valor = soma / x ;
//		    
//		    System.out.printf("Media: %.2f%n",valor);
	}

}
