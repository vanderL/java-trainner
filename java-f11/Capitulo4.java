class Conta{
	int numero;
	String nome;
	double saldo;
	double limite;

	boolean saca(double quantidade){
		if (this.saldo < quantidade){
			return false;
		} else {
			this.saldo -= quantidade;
			return true;
		}
	}
	void deposita(double quantidade){
		double novoSaldo = this.saldo + quantidade;
		this.saldo = novoSaldo;
	}

	boolean transferePara(Conta destino, double valor){
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}
}

class Programa{
	public static void main(String[] args){
		Conta minhaConta, meuSonho; 
		minhaConta = new Conta();
		meuSonho = new Conta();
		meuSonho.saldo = 5000;

		minhaConta.nome = "Vander";
		minhaConta.saldo = 800;
		minhaConta.numero = 5025;

		if(minhaConta.transferePara(meuSonho, 800)){
			System.out.println("Trânsferecia foi sucesso!");
		}else{
			System.out.println("Operação falhou");
		}

		if(minhaConta.saca(300.0)) {
			System.out.println("Saque com sucesso.");
		} else {
			System.out.println("Saldo invalido para o saque");
		}
		minhaConta.deposita(400.0);
		System.out.println("Saldo atual da conta 1: " + minhaConta.saldo);
		System.out.println("Saldo autal da conta 2: " + meuSonho.saldo);
	}
}

class TestaReferencias {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.nome = "Vander";
		c1.saldo = 227;

		Conta c2 = new Conta();
		c2.nome = "Vander";
		c2.saldo = 227;

		if (c1 == c2) {
			System.out.println("COntas iguais");
		} else {
			System.out.println("COntas diferentes");
		}
	}
}


