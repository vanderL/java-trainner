package banco;

public class ContaCorrente implements Tributavel, Conta {

	private double saldo;

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Sem saldo," + " tente um valor menor");
		} else {
			this.saldo -= this.saldo;
		}

	}

	@Override
	public void deposita(double valor) throws ValorInvalidoException {
		if (valor < 0){
			throw new ValorInvalidoException(valor);
		} else{
			this.saldo += valor - 0.10;
		}
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

}
