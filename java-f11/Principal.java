package banco;

public class Principal {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		try {
			cc.deposita(-100);
			System.out.println("Sucesso!");
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Processo de deposita finalizado!");
		}
		try {
			cp.deposita(100);
			System.out.println("Sucesso!");
		} catch (ValorInvalidoException e) {

			System.out.println(e.getMessage());
		} finally {
			System.out.println("Processo de deposita finalizado!");
		}
		/*
		 * try{ cc.saca(101); } catch(SaldoInsuficienteException e){
		 * System.out.println(e.getMessage()); } Tributavel t = cc;
		 * 
		 * System.out.printf("O saldo é: %.2f", cc.getSaldo());
		 * 
		 * AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		 * 
		 * adc.roda(cc); adc.roda(cp);
		 * 
		 * System.out.println("Saldo Total: " + adc.getSaldo());
		 * System.out.println(cc.calculaTributos());
		 * System.out.println(t.calculaTributos());
		 */
	}
}
