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
		double subtração = subtração(a, b);
		double divisão = divisão(a, b);
		double multiplicação = multiplicação(a, b);
		 System.out.println("soma = "+soma);		
		 System.out.println("subtração = "+subtração);
		 System.out.println("divisão = "+divisão);
		 System.out.println("multiplicação = "+multiplicação);
		 System.out.println("obrigado pela preferência!!");

	}
	public static double soma(double a, double b) {
		return a + b;		
	}
	public static double subtração(double a, double b) {
		return a - b;
	}
	public static double divisão(double a, double b) {
		return a / b;
}
	public static double multiplicação(double a, double b) {
		return a * b;
		}
}

