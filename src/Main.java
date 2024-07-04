public class Main {

	public static void main(String[] args) {
		Cliente vitor = new Cliente();
		vitor.setNome("Vitor");
		
		Conta cc = new ContaCorrente(vitor);
		Conta poupanca = new ContaPoupanca(vitor);

		cc.depositar(100);
		cc.transferir(50, poupanca);
		cc.sacar(25);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}