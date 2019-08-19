package contaBancaria;
import java.util.Scanner;


public class CriarConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		//Primeiros testes somente com a Classe Conta
		//Conta primeiraConta = new Conta();
		//primeiraConta.saldo = 200;
		//primeiraConta.agencia = 12345;
		//primeiraConta.numero = 0000001;
		//primeiraConta.titular = "José da Silva";
		
		//Conta segundaConta = new Conta();
		//segundaConta.saldo = 100;
		
		//primeiraConta.depositar(100);
		//System.out.println(primeiraConta.saldo);
		
		//Teste com a classe Conta e Cliente
		Conta contaMarcela = new Conta();
		contaMarcela.setTitular(new Cliente());
		System.out.println("Saldo da conta da Marcela?");
		double saldoMarcela = ler.nextDouble();
		//contaMarcela.saldo = saldoMarcela;
		System.out.println(contaMarcela.getSaldo());
		System.out.println(saldoMarcela);
		
		ler.close();
	}

}
