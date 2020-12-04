
package javaapplication4;
import java.sql.*;

public class ConexionBD {
 Connection conexion;

	public Connection conexion(){
	try{

		Class.forName("com.mysql.jdbc.Driver");
		conexion = DriverManager.getConnection("jdbc:mysql://localhost/calculadora","root","");
		System.out.println("Conectado :D");
		}catch(ClassNotFoundException | SQLException e){
			System.out.println(e.getMessage());	
			}return conexion;
	}
			Statement createStatment(){
			throw new UnsupportedOperationException("No soportado");


                        }
}