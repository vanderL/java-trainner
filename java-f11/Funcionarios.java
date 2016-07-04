package funcionarios;

abstract class Funcionario {
	protected String nome;
	protected double salario;
	protected String cpf;
	protected int senha;
	
	public boolean autentica(int senha){
		if(this.senha == senha){
			System.out.println("Bem vindo ao sistema de Gerenciamento!! filho da puta");
			return true;
		}else{
			System.out.println("Sair fora!!");
			return false;
		}
	}
	
	
	abstract public double getBonus();

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return this.salario;
	}

}