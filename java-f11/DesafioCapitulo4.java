class Funcionario {
	String nome;
	String departamento;
	double salario;
	Data dataDeEntrada;
	String rg;

	void recebeAumento(double aumento){
		this.salario += aumento;
	}
	double calculaGanhoAnual(){
		return this.salario *= 12;
	}
	void mostra(){
		System.out.println("####### ÍNICIO DA LINHA ########");
		System.out.println("Nome: " + this.nome);
		System.out.println("departamento: " + this.departamento);
		System.out.println("Salario: " + this.salario);
		System.out.println("Data de admissão: " + this.dataDeEntrada.getFormatada());
		System.out.println("Rg");
		System.out.println("######## FIM DA LINHA ##########");
	}
}

class Data {
	int dia;
	int mes;
	int ano;

	void preencheData (int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String getFormatada(){
    	return this.dia + "/" + this.mes + "/" + this.ano;
    }
}

class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Vander";
		f1.salario = 100;
		f1.dataDeEntrada = new Data();
		f1.dataDeEntrada.preencheData(1, 7, 2016);
		f1.recebeAumento(150);
		f1.mostra();

		//System.out.println("salario atual: " + f1.salario);
		//System.out.println("ganho anual: " + f1.calculaGanhoAnual());
	}
}