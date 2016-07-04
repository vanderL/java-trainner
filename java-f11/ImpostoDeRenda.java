package banco;

public class ImpostoDeRenda {
	private double total;

	public double getTotal() {
		return total;
	}

	void adiciona(Tributavel t){
		System.out.println("Adicionado tributavel " + t);
		this.total += t.calculaTributos();
	}
	
	

}
