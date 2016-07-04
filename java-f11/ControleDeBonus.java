package funcionarios;

public class ControleDeBonus {
	private double totalDeBonificacoes = 0;

	public void registra(Funcionario f) {
		this.totalDeBonificacoes += f.getBonus();
	}

	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}
}
