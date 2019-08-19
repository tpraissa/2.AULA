package contaBancaria;

public class Conta {
	
private double saldo;
private int agencia;
private int numero;
private Cliente titular;
//public Cliente titular = new Cliente();
private static int numeroContas;

public Conta() {
	//Conta.setNumeroContas(Conta.getNumeroContas() + 1);
	
}

//gets&sets
public double getSaldo() {
	return this.saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

public int getAgencia() {
	return this.agencia;
}

public void setAgencia(int agencia) {
	this.agencia = agencia;
}

public int getNumero() {
	return this.numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public Cliente getTitular() {
	return this.titular;
}

public void setTitular(Cliente titular) {
	this.titular = titular;
}

//metodos

public void depositar(double valor) {
	this.saldo += valor;
}

public boolean sacar (double valor) {
	if (this.saldo >= valor) {
		this.saldo -= valor;
		return true;
	}else {
		return false;
	}
}

public boolean transferir(double valor, Conta destino) {
	if (this.saldo >= valor) {
		this.saldo -= valor;
		destino.depositar(valor);
		return true;
	}else {
		return false;
	}
}

public static int getNumeroContas() {
	return numeroContas;
}

public static void setNumeroContas(int numeroContas) {
	Conta.numeroContas = numeroContas;
}


}