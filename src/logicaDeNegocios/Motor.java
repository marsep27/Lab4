/*
 *Laboratorio3
 *Grupo 40
 *San José
 *SAMANTHA PATRICIA ARBUROLA LEON
 *ADRIAN ESTEBAN ARBUROLA LEON
 *MARCO GERARDO SOTO MORERA
 */

package logicaDeNegocios;

//Importar
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Motor {
	//Atributos	de la clase motor
		String marca;
		String numSerie;
		String cilindraje;
		private PrintStream out;
		private Object in;

	public Motor() {
		System.out.println("Digite la Marca del motor: ");
	 	marca = in.readLine();
	 	System.out.println("Digite el número de Serie del motor: ");
	 	numSerie = in.readLine();
	 	System.out.println("Digite el cilindraje del motor: ");
	 	cilindraje = in.readLine();
	}
	//Metodos get y set
	public String getMarca() {
		return marca;//Salida: String 
	}

	public void setMarca(String marca) {
		this.marca = marca;//Entrada: String con la marca
	}

	public String getNumSerie() {
		return numSerie;//Salida: String 
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;//Entrada: String con el numero de serie
	}

	public String getCilindraje() {
		return cilindraje;//Salida: String 
	}

	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;//Entrada: String con el cilindraje
	}

	public PrintStream getOut() {
		return out;
	}

	public void setOut(PrintStream out) {
		this.out = out;
	}

	public Object getIn() {
		return in;
	}

	public void setIn(Object in) {
		this.in = in;
	}

}
