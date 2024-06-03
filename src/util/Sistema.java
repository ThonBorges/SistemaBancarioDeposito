package util;

public class Sistema {
	
	private int nrConta;
	private String nomeTitular;
	private double saldoConta;
	
	public Sistema(int nrConta, String nomeTitular) {
		this.nrConta = nrConta;
		this.nomeTitular = nomeTitular;
	}
	
	public Sistema(int nrConta, String nomeTitular, double depositoInicial) {
		this.nrConta = nrConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}

	public int getNrConta() {
		return nrConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}


	public double getSaldoConta() {
		return saldoConta;
	}
	
	public void deposito (double quantia) {
		saldoConta += quantia;
	}
	
	public void saque (double quantia) {
		saldoConta -= quantia + 5.0;
	}
	
	public String toString () {
		return "Conta: " + nrConta + ", Titular: " + nomeTitular + " Saldo: $ " + String.format("%.2f", saldoConta); 
	}
	
}
