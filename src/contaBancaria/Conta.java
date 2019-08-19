package contaBancaria;

public class Conta {
	
public double saldo;
public int agencia;
public int numero;
public Cliente titular;

public Conta() {}

//gets&sets

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

}