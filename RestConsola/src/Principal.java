
	import java.io.IOException;
	import java.net.HttpURLConnection;
	import java.net.URL;
	import java.util.Scanner;

	public class Principal {

		public static void main(String[] args) throws IOException {
			URL objURL = new URL("http://localhost:8080/ServiciosREST/datos/xml?nombre=Carlos");
			HttpURLConnection conexion = (HttpURLConnection) objURL.openConnection(); //Conector que me permite conectarme a un servivio we a traves de url
			conexion.setRequestMethod("GET"); //Uso el metodo Get y hago la peticion 
			
			int codigoHTTP = conexion.getResponseCode();
			System.out.println("Código: " + codigoHTTP);
			
			Scanner lector = new Scanner (conexion.getInputStream());//Recojo el origen de datos getInputStream()
			String respuesta = "";
			while (lector.hasNextLine()) {
				respuesta = respuesta.concat(lector.nextLine());
			}
			
			lector.close();
			
			System.out.println(respuesta);
		}
	}


