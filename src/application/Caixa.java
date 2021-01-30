package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Conta;
import model.entities.ContaCorrente;
import model.exceptions.ContaExceptions;

public class Caixa {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta novaConta;

		System.out.println("Entre com os dados da conta");
		System.out.println("Número.: ");
		int numeroDaConta = sc.nextInt();

		System.out.println("Titular.: ");
		String nomeDoTitular = sc.next();

		System.out.println("Gostaria de depositar algum valor na conta ? y/n");
		char opc = sc.next().charAt(0);

		if (opc == 'y') {

			System.out.println("Informe o valor que deseja depositar.: ");
			Double valor = sc.nextDouble();
			novaConta = new ContaCorrente(numeroDaConta, nomeDoTitular, valor);
			System.out.println(novaConta);
		} else {
			novaConta = new ContaCorrente(numeroDaConta, nomeDoTitular);
			System.out.println(novaConta);
		}

		System.out.println("Deseja realizar um saque ? y/n");
		char opcDeSaque = sc.next().charAt(0);

		if (opcDeSaque == 'y') {

			System.out.println("Informe o valor de saque.:");
			Double valor = sc.nextDouble();

			try {

				novaConta.sacarValor(valor);
			} catch (ContaExceptions e) {
				System.out.println("ERRO.: " + e.getMessage());
			}
		}
		sc.close();
	}
}
