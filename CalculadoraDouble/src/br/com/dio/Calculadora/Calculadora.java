package br.com.dio.Calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		double b,a;
		System.out.println("digite o valor do primeiro numero ");
		a=scanner.nextDouble();
		System.out.println("digite o valor do segundo numero ");
		b=scanner.nextDouble();
		
		double soma = soma(a, b);
		double subtra��o = subtra��o(a, b);
		double divis�o = divis�o(a, b);
		double multiplica��o = multiplica��o(a, b);
		 System.out.println("soma = "+soma);		
		 System.out.println("subtra��o = "+subtra��o);
		 System.out.println("divis�o = "+divis�o);
		 System.out.println("multiplica��o = "+multiplica��o);
		 System.out.println("obrigado pela prefer�ncia!!");

	}
	public static double soma(double a, double b) {
		return a + b;		
	}
	public static double subtra��o(double a, double b) {
		return a - b;
	}
	public static double divis�o(double a, double b) {
		return a / b;
}
	public static double multiplica��o(double a, double b) {
		return a * b;
		}
}

