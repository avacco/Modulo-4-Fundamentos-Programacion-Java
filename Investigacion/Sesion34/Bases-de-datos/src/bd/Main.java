package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String args[]) {
	
		String dbURL = System.getenv("dbURL");
		String dbUsuario = System.getenv("dbUsuario");
		String dbPass = System.getenv("dbPass");
		
		System.out.printf("DB URL = %s%n"
						+ "DB USER = %s%n"
						+ "DB PASS = %s%n",
						dbURL,dbUsuario,dbPass);
		
		ejemploSelect();
	//	ejemploInsert();
	//	ejemploDelete();
	//	ejemploUpdate();
	//	ejemploCreateTable();
		
	}
	
	public static Connection getConexion() throws SQLException{
		// Declara variables de la URL de la base de datos, el usuario y el password para la conexion.
		// Para windows, definimos primero en "Variables de entorno" tres valores con los nombres "dbURL", "dbUsuario" y "dbPass" (NO SON LAS VARIABLES AQUI DECLARADAS)
		// En cada uno de esas variables de entorno ponemos los datos a los que luego accederemos a traves de las siguientes lineas de codigo
		// System.getenv("NOMBREVARIABLE") toma la variable de entorno del nombre correspondiente
				String dbURL = System.getenv("dbURL");
				String dbUsuario = System.getenv("dbUsuario");
				String dbPass = System.getenv("dbPass");
				return DriverManager.getConnection(dbURL,dbUsuario,dbPass);
		
	}

	public static void ejemploSelect() {
		
		//try with resources. Cierra los recursos automaticamente al finalizar el bloque
		try (
			// Connection hace la conexion con la base de datos con los datos dados
			Connection conn = getConexion();
			// Statement se utilizara para crear los querys
			Statement st = conn.createStatement();				
				) {
			
			// ResultSet guardara lo que se retorne del query.
			ResultSet rs = st.executeQuery("SELECT * FROM alumnos;");

			// Mientras el query siga tirando resultados, hace lo siguiente
			while(rs.next()) {
				// Toma los datos retornados y los asigna a variables
				int id 			= rs.getInt("id");
				String nombre 	= rs.getString("nombre");
				String carrera 	= rs.getString("carrera");
				
				// Muestra por consola los datos ahora guardados en variables
				System.out.printf("ID: %d%nNombre: %s%nCarrera: %s%n___________________%n",id,nombre,carrera);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void ejemploInsert() {
		try (
			Connection conn = getConexion();
				
			// Para evitar inyeccion SQL, se utilizan objetos PreparedStatement y el metodo prepareStatement, utilizando values "?"
			PreparedStatement pst = conn.prepareStatement("INSERT INTO alumnos(nombre,carrera) VALUES(?,?)");				
				) {
			// Con setString se reemplazan los valores "?", de izquierda a derecha y empezando del 1 en forma ascendiente
			pst.setString(1, "Homero Simpson");
			pst.setString(2, "Seguridad Nuclear");
			int filasInsertadas = pst.executeUpdate();
			
			System.out.printf("Se insertó correctamente %d fila(s)",filasInsertadas);
		} catch (SQLException e) {
			e.printStackTrace();
		}
}
	
	public static void ejemploDelete() {
		try (
			Connection conn = getConexion();
			PreparedStatement pst = conn.prepareStatement("DELETE FROM alumnos WHERE id = ?");				
				) {
			int alumnoIdABorrar = 5;
			pst.setInt(1,alumnoIdABorrar);
			int filasBorradas = pst.executeUpdate();
			
			System.out.printf("Se eliminó correctamente %d fila(s)", filasBorradas);
		} catch (SQLException e) {
			e.printStackTrace();
		}
}
	
	public static void ejemploUpdate() {
		try (
			Connection conn = getConexion();
			PreparedStatement pst = conn.prepareStatement("UPDATE alumnos SET carrera = 'Java' WHERE id = ?");				
				) {
			int alumnoIdAActualizar = 1;
			pst.setInt(1,alumnoIdAActualizar);
			int filasActualizadas = pst.executeUpdate();
			
			System.out.printf("Se actualizó correctamente %d fila(s)", filasActualizadas);
		} catch (SQLException e) {
			e.printStackTrace();
		}
}
	
	public static void ejemploCreateTable() {
		try (
			Connection conn = getConexion();
			Statement st = conn.createStatement();				
				) {
			String sql = "CREATE TABLE pruebas(id smallserial, nombre char(20))";
			st.execute(sql);
			
			System.out.printf("Se creo la tabla correctamente");
		} catch (SQLException e) {
			e.printStackTrace();
		}
}
	
}