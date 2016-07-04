package banco;

public class ContaPoupanca implements Conta {
	private double saldo;

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void deposita(double valor) throws ValorInvalidoException {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
		}
	}

	@Override
	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new IllegalArgumentException();
		} else {
			this.saldo -= valor;
		}
	}
}
