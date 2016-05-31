class ExercicioX {
	public static void main(String[] args){
		long fat = 0;
		int valor = 1000; //ou qualquer outro valor que queira calcular;
		for( int i = 1; i <= valor; i++ ){ 
		     fat += i;
		}
		System.out.println( "A soma de 1 até" + valor + " é igual a " + fat );
		
	}
}