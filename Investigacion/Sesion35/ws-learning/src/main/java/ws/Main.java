package ws;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) {
		//getPosts();
		
		String url = "https://mindicador.cl/api";
		
		try {
			String indicadoresComoTexto = getContenido(url);
			ObjectMapper mapeador = new ObjectMapper();
			JsonNode nodos = mapeador.readTree(indicadoresComoTexto);
			
			// toma del objeto "uf" el atributo "valor" y lo convierte a double
			Double uf = nodos.get("uf").get("valor").asDouble();
			
			// hace lo mismo con el dolar
			Double dolar = nodos.get("dolar").get("valor").asDouble();
			
			System.out.printf("valor UF: %.2f Dolar: %.2f",uf,dolar);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void getPosts() {
		// Conseguir desde la red el contenido de https://jsonplaceholder.typicode.com/posts
		try {
			String postsComoTexto = getContenido("https://jsonplaceholder.typicode.com/posts");
			
			// Interpretar el JSON como objetos Java
			ObjectMapper mapeador = new ObjectMapper();
			
			List<Articulo> articulos = mapeador.readValue(postsComoTexto, new TypeReference<List<Articulo>>() {});
			articulos.forEach( articulo -> System.out.printf("ID: %d Titulo: %s Cuerpo: %s %n%n", 
															articulo.getId(),
															articulo.getTitle(),
															articulo.getBody()
															));
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	/**
	 * Va a la URL en internet y recupera el contenido
	 * 
	 * @param url del contenido a conseguir como string
	 * @return el string con el contenido de la url
	 * @throws IOEXception
	 * @throws MalformedURLException
	 */
	
	public static String getContenido(String url) throws MalformedURLException, IOException {
		try(
				// utiliza la api de java para traer los datos de la url
			InputStream stream = (new URL(url)).openStream();
				
				){
			// retorna todos los bytes traidos en formato estandar utf-8
			return new String(stream.readAllBytes(), StandardCharsets.UTF_8);
		}
		
	}
	

}
