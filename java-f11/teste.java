package funcionarios;

public class teste {
	public static void main(String[] args) {

		Gerente vander = new Gerente();
		vander.setNome("Vander Lima de Andrade");
		vander.setSenha(1919);
		vander.setSalario(1000);
		ControleDeBonus controle = new ControleDeBonus();
		controle.registra(vander);
		// System.out.println(vander.getNome());
		// System.out.println(vander.getBonus());

		Gerente f1 = new Gerente();
		f1.setSalario(5000.0);
		controle.registra(f1);

		Funcionario f2 = new Gerente();
		f2.setSalario(1000.0);
		controle.registra(f2);

		System.out.println(controle.getTotalDeBonificacoes());
	}
}
