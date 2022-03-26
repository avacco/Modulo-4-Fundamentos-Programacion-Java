package File;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TrabajoArchivos {

	public static void main (String[] args) {
		//userHome traera la ruta de directorio de usuario en cualquier sistema operativo
		String userHome = System.getProperty("user.home");
		System.out.printf("User home: %s %n", userHome);
		
		//este metodo traera un listado de los archivos que haya en la carpeta base (tambien llamada ".") del programa
		//esCarpetaOArchivo();
		
		//este metodo creara un archivo .csv con un contenido definido
		//crearArchivo();
		
	}
	
	private static void esCarpetaOArchivo() {
		File directorioActual = new File(".");
		String [] listadoArchivos = directorioActual.list();
		
		for (String archivo : listadoArchivos){
			File archivoActual = new File (archivo);
			
			if(archivoActual.isDirectory()) {
				System.out.printf("Dir: %s $n", archivo);
			}
			
			if(archivoActual.isFile()) {
				System.out.printf("File: %s %n", archivo);
			}
		}
	}

	private static void crearArchivo() {
	String userHome = System.getProperty("user.home");
	String nombreArchivo = "ARCHIVO.csv";
	String contenidoArchivo = "ARCHIVO CSV CREADO POR JAVA\n=============================\n";
	
	//Utiliza un try-catch para evitar que el programa se rompa.
			try {
				// Crea un objeto FileWriter, importado desde packages io de java
				// Se encargará de crear el archivo a partir de los Strings definidos antes
				FileWriter writer = new FileWriter(new File(userHome,nombreArchivo));
				writer.write(contenidoArchivo);
				writer.close();
				
				System.out.println("Archivo generado exitosamente");
				
			} catch(IOException ioe) {
				System.out.println("Fallo al escribir el archivo.");
			}
	}
}
