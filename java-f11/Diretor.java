package funcionarios;

class Diretor extends Funcionario {
	private int senha;
	// private int qtdDeFuncionarios;

	@Override
	public double getBonus() {
		return this.getSalario() * 1;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso permitido!");
			return true;
		} else {
			System.out.println("Acesso negado!");
			return false;
		}
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}
