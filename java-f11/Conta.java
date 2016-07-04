package banco;

public interface Conta {
	void saca (double valor) throws SaldoInsuficienteException;
	void deposita(double valor) throws ValorInvalidoException;

	public double getSaldo();

	abstract public void atualiza(double taxa);
}
