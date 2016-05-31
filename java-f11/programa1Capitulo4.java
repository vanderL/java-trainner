
class Pessoa{
	String nome;
	int idade;

	void fazAniversario(){
		this.idade += 1;
	}
}
/*
class programar1 {
	public static void main(String[] args) {
		Pessoa vander = new Pessoa();
		vander.nome = "vander";
		vander.idade = 20;
		System.out.println("Idade antes do aniversario: " + vander.idade);
		vander.fazAniversario();
		System.out.println("Idade após o aniversario: "vander.idade);
	}
}
*/


class Porta {
	boolean aberta = false;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;

	void abre(){
		if(this.aberta){
			System.out.println("A porta já está aberta!");
		}else {
			this.aberta = true;
			System.out.println("Abrindo a porta...");
		}
	}

	void fecha(){
		if(!this.aberta){
			System.out.println("A porta já está fechada!");
		}else {
			this.aberta = false;
			System.out.println("Fechando a porta...");
		}
	}

	void pinta(String cor){
		if(this.cor == cor){
			System.out.println("Renovando a cor...");
		}else {
			
			String oldCor = this.cor;
			this.cor = cor;
			System.out.println("Cor alterada para: " + this.cor);
			System.out.println("Cor antiga era " + oldCor);
		}
	}
	
	boolean estaAberta(){
		if(this.aberta){
			System.out.println("Porta aberta!");
			return true;
		}else {
			System.out.println("Porta fechada");
			return false;
		}
	}
	
}
/*
class programa2 {
	public static void main(String[] args) {
		Porta doorFront = new Porta();
		doorFront.cor = "madeira";
		doorFront.aberta = false;

		if(!doorFront.estaAberta()){
			doorFront.abre();
		}
	
		doorFront.pinta("amarelo");
	}
}

*/

class Casa{
	String cor;
	Porta porta1 = new Porta();
	Porta porta2 = new Porta();
	Porta porta3;
	
	int quantasPortasAbertas(){
		int totalDePortasAbertas = 2;
		Porta[] portas={porta1, porta2, porta3};
		for (int i = 0; i > portas.length; i++ ) {
			if(portas[i].estaAberta()){
				totalDePortasAbertas++;
				continue;
			}	
		}		

	}return totalDePortasAbertas;
}

class programar3{
	public static void main(String[] args) {
		Casa minhaCasa = new Casa();
		minhaCasa.cor = "azul";
		minhaCasa.porta2.aberta = true;

		System.out.println(minhaCasa.quantasPortasAbertas());
	}
}