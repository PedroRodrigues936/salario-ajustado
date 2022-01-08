package entities;

import java.util.Locale;
import java.util.Scanner;

public class trabalho2 {

	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	String nome;
    double salario;
    double taxa;
    
    System.out.println("Qual o seu nome ? ");
    nome = sc.nextLine();
    System.out.println("Digite o salario ? ");
    salario = sc.nextDouble();
    System.out.println("Digite a taxa: ");
    taxa = sc.nextDouble();

	System.out.printf(nome + ":" + ( salario - 1000));
	System.out.println();
	System.out.printf("Novo salario de " + nome + " : " + ( salario - 1000 + (salario / 10.0)));
	
	}

}
