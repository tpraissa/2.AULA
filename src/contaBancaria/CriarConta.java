package contaBancaria;

public class CriarConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		primeiraConta.agencia = 12345;
		primeiraConta.numero = 0000001;
		primeiraConta.titular = "José da Silva";
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 100;
		
		primeiraConta.depositar(100);
		System.out.println(primeiraConta.saldo);
		
	}

}
