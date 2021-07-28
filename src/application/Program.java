//URI 1099 - 28/07/2021.
//- Estruturas: Sequencial - Condicional - Repetitiva
//- Construtores - Sobrecarga - Encapsulamento - toString - palavra 'This'

package application;

import java.util.Locale;
import java.util.Scanner;

import util.SumOfOdds;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		SumOfOdds sumO = new SumOfOdds(); 
		System.out.print("Enter the number of repetitions: "); 
		sumO.setN(sc.nextInt());
		System.out.println();
		
		for (int i = 0; i < sumO.getN(); i++) { 
			System.out.println("Test number " + (i + 1) + ":");
			System.out.print("First: ");
			sumO.setX(sc.nextInt());
			System.out.print("Second: ");
			sumO.setY(sc.nextInt());
			
			if (sumO.getX() > sumO.getY()) { //funcao que vai fazer a mudanca do X e Y caso X for maior 
				System.out.println(); 
				System.out.println("Changing: ");
				System.out.println("Aux: " + sumO.getAux());
				System.out.println("X: " + sumO.getX());
				System.out.println("Y: " + sumO.getY());
				System.out.println();
				sumO.setAux(sumO.getX());
				System.out.println("Aux: " + sumO.getAux());
			    sumO.setX(sumO.getY());;
			    System.out.println("X: " + sumO.getX());
				sumO.setY(sumO.getAux());		
				System.out.println("Y: " + sumO.getY());
				System.out.println();
			}
			
			System.out.println(sumO);
			sumO.setSum(); //faz o reset do atributo somas
			System.out.println();
		}
		sc.close();
	}

}
