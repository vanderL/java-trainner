package banco;

@SuppressWarnings("serial")
public class SaldoInsuficienteException extends Exception{
	public SaldoInsuficienteException(String messagem) {
		super(messagem);
	}
}
