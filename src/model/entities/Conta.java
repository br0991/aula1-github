package model.entities;

import model.exceptions.ContaExceptions;

public abstract class Conta {

	protected Integer numeroDaConta;
	protected Double saldoAtual;
	protected String nomeDoTitular;
	protected final Double saldoLimite = 500.00;

	public Conta(){
		
	}
	public Conta(Integer numeroDaConta, String nomeDoTitular, Double valor) {

		this.numeroDaConta = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
	}

	public Conta(Integer numeroDaConta, String nomeDoTitular) {

		this.numeroDaConta = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
		this.saldoAtual = 0.00;
	}

	public Integer getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(Integer numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public Double getSaldoAtual() {
		return saldoAtual;
	}

	public Double getSaldoLimite() {
		return saldoLimite;
	}

	public String getNomeDoTitular() {

		return nomeDoTitular;
	}

	public void setNomeDoTitular(String nomeDoTitular) {

		this.nomeDoTitular = nomeDoTitular;
	}

	public abstract void depositarValor(Double valor);

	public abstract void sacarValor(Double valor) throws ContaExceptions;
	
	@Override
	public String toString(){
		StringBuilder build = new StringBuilder();
		build.append("Nº da conta.: " + numeroDaConta + "\n");
		build.append(" Nome do titular.: " + nomeDoTitular + "\n");
		build.append(" Saldo da conta = " + saldoAtual + "\n");
		build.append(" Saldo limite = " + saldoLimite + "\n");
		return build.toString();
	}
}
