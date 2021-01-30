package model.entities;

import model.exceptions.ContaExceptions;

public class ContaCorrente extends Conta {

	public ContaCorrente(){
		
		super();
	}

	public ContaCorrente(Integer numeroDaConta, String nomeDoTitular, Double saldo) {

		super(numeroDaConta, nomeDoTitular);
		depositarValor(saldo);
	}

	public ContaCorrente(Integer numeroDaConta, String nomeDoTitular) {

		super(numeroDaConta, nomeDoTitular);
	}

	@Override
	public void depositarValor(Double valor) {

		saldoAtual += valor;
	}

	@Override
	public void sacarValor(Double valor) throws ContaExceptions {

		if (valor > saldoAtual) {

			throw new ContaExceptions("Saldo insuficiente !");
		}

		saldoAtual -= valor;
	}
}
