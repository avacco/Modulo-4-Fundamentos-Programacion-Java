public class HolaMundo { // el nombre de clase siempre debe empezar con mayuscula

// void quiere decir que este metodo no retorna nada
	public static void main(String[] args){
		
		if( args.length == 0 ){
			System.out.println("Hola a todos");
		} else if( args.length == 1){
			System.out.println("Hola "+args[0]);
		} else if ( args.length == 2 ){
			System.out.println(" Buenas tardes señor(a) "+args[0]+" "+args[1]);
		}
	}

}
// esto es un comentario de una linea

/* 	
	esto
	es
	un
	comentario
	de
	varias
	lineas	
*/