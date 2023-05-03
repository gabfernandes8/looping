package br.senai.jandira;

import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		int loop;
		
		System.out.println("Qual seu nome?");
		nome = teclado.next();
		
		System.out.println("Número de repetições?");
		loop = teclado.nextInt();
		
		while (loop > 0) {
			System.out.println(nome);
			loop --;
		}

	}

}
