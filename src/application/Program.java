package application;

import java.util.Locale;
import java.util.Scanner;
import util.Sistema;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Sistema conta;
		
			
		System.out.println("Digite o número de sua conta: ");
		int nrConta = sc.nextInt();
		
		System.out.println("Digite o nome do titular da conta: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		
		System.out.println("Deseja fazer um depósito inicial?\n 1 = SIM\n 2 = NÃO");
		int confirmation = sc.nextInt();
		
		if (confirmation == 1) {
			System.out.println("Qual valor do depósito: ");
			double depositoInicial = sc.nextDouble();
			conta = new Sistema (nrConta, nomeTitular, depositoInicial);
		} else {
			conta = new Sistema (nrConta, nomeTitular);
		}
		
		System.out.println();
		System.out.println("Dados da Conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Digite um valor para depósito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		
		System.out.println();
		System.out.println("Dados da Conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Digite um valor de saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		
		System.out.println();
		System.out.println("Dados da Conta: ");
		System.out.println(conta);
		
		
		
		sc.close();
	}

}
