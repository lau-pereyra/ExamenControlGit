public class JuegoDados {
	
	 static final int RANGO = 6;
	 static final String GANA1 ="Gana Jugador 1";
	 static final String GANA2 ="Gana Jugador 2";
	 static final String EMPATE ="Empate";
	 
	 
	 //Soy Lautaro

	public static void main(String[] args) {
		
		//Declaraciones
		
		 int valor, valor2, valor3, valor4, numSeises1, numSeises2, suma1, suma2;
		 
		 
		 //In
		 
		 valor=(int)(Math.random()*RANGO+1);
		 valor2=(int)(Math.random()*RANGO+1);
		 valor3=(int)(Math.random()*RANGO+1);
		 valor4=(int)(Math.random()*RANGO+1);
		 
		 //proceso
		 
		 System.out.println("dados del jugador 1 = "+ valor +" , "+ valor2);
		 System.out.println("dados del jugador 2 = "+ valor3 +" , "+ valor4);
		 
		 if(valor == RANGO && valor2 == RANGO ) {
			 numSeises1 = 2;
		 }else if(valor == RANGO || valor2 == RANGO ) {
			 numSeises1 = 1;
		 }else {
			 numSeises1 = 0;
		 }
		 
		 if(valor3 == RANGO && valor4 == RANGO ) {
			 numSeises2 = 2;
		 }else if(valor3 == RANGO || valor4 == RANGO ) {
			 numSeises2 = 1;
		 }else {
			 numSeises2 = 0;
		 }
		 
		 //Ganan por seises?
			
			if(numSeises1 > numSeises2) {
				System.out.println(GANA1);
			}else if(numSeises1 < numSeises2) {
				System.out.println(GANA2);
			}else {
			
		//gana por suma 
			
			suma1 = (valor +valor2);
			suma2 = (valor3 +valor4);
			
			if(suma1 > suma2) {
				System.out.println(GANA1);
			}else if (suma1 < suma2){
				System.out.println(GANA2);
			}else {
				System.out.println("resultado = "+EMPATE);
			}
		
		}

	}

}