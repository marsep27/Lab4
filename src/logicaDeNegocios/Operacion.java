/*
 *Laboratorio3
 *Grupo 40
 *San José
 *SAMANTHA PATRICIA ARBUROLA LEON
 *ADRIAN ESTEBAN ARBUROLA LEON
 *MARCO GERARDO SOTO MORERA
 */

package logicaDeNegocios;
import java.util.*;
import java.text.*;

public class Operacion {
	//Atributos de la clase operacion
	private int numero;
	private String tipo;
	private double monto;
	private Date FechaOperacion;
	
	public Operacion(int pNumero, String pTipo, double pMonto) {
		setNumero(pNumero);
		setTipo(pTipo);
		setMonto(pMonto);
		getFechaOperacion();
	}
	//Metodos get y set
	public int getNumero() {
		return numero;//Salida: numero entero 
	}

	public void setNumero(int numero) {
		this.numero = numero;//Entrada: numero entero
	}

	public String getTipo() {
		return tipo;//Salida: String de tipo
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;//Entrada: String con tipo
	}

	public double getMonto() {
		return monto;//Salida: numero double
	}

	public void setMonto(double monto) {
		this.monto = monto;//Entrada: double con el monto
	}

	public String getFechaOperacion() {
		//Se crea una mascara para que muestre la fecha en el formato dia/mes/año
		SimpleDateFormat mascara=new SimpleDateFormat("dd/MM/yy");
		return mascara.format(FechaOperacion);//Salida: String 
	}

	public void setFechaOperacion() {
		//Se utiliza la clase calendario para obtener la fecha de la operacion
		Calendar calendario;
		calendario= Calendar.getInstance();
		FechaOperacion=(Date)calendario.getTime();//Entrada: String con la operacion
	}
	public String toString(){
		String msg;
		msg="\t" + getNumero() + "\t" + getFechaOperacion() + 
				"\t" + getTipo() + "\t" + getMonto() + "\n";
		return msg;
	}
}
