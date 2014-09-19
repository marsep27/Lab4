/*
 *Laboratorio4
 *Grupo 40
 *San José
 *SAMANTHA PATRICIA ARBUROLA LEON
 *ADRIAN ESTEBAN ARBUROLA LEON
 *MARCO GERARDO SOTO MORERA
 *FEDERICO ANDRES MONTEALEGRE CAMPABADAL
 */
package logicaDeNegocios;
import java.util.*;
import java.text.*;

public abstract class Cuenta {
	private static int sCantCuentas=0;
	protected int numCuenta=0;
	protected Cliente duenio=null;
	protected double saldo=0;
	protected Date fechaCreacion;
	protected ArrayList<Operacion> operaciones;
	protected int numOperaciones=0;
	protected String tipoCuenta;


public int getNumCuenta(){
	return numCuenta; //Salida entero
 }

public void setNumCuenta(int pNumCuenta){
	numCuenta=pNumCuenta; //Salida entero
}

public Cliente getDuenio() {
	return duenio;//Salida string
}

public void setDuenio(Cliente pCliente) {
	duenio=pCliente;//Entrada:Cliente. Restriccion:Debe ser de tipo Cliente
}

public double getSaldo() {
	return saldo;//Salida: entero
}

public void setSaldo(double saldo) {
	this.saldo = saldo;//Entrada: Valor entero o double. //Restriccion debe de ser un numero
}
public void setFechaCreacion(){
	Calendar calendario;
	calendario=Calendar.getInstance();
	fechaCreacion=calendario.getTime();
}
public String getFechaCreacion(){
	SimpleDateFormat mascara=new SimpleDateFormat("dd/MM/yy");
	return mascara.format(fechaCreacion);
	
}

public String depositar(double pMonto){
	//Entrada: numero double;
	//Salida: String
	saldo +=pMonto;
	Operacion nuevaOperacion = new Operacion(++numOperaciones,"deposito",pMonto);
	operaciones.add(nuevaOperacion);
	return "Saldo actual: "+saldo;
}

private boolean validarRetiro(double pMonto){
	//Entrada: numero de tipo doble
	//Salida: un booleano

	return pMonto <= saldo;
}
public String retirar(double pMonto){
	//Entrada:numero de tipo doble o entero
	//Salida;String mostrando mensaje de exito o fracaso en la operacion
	//Restricciones: el monto a retirar no puede ser mayor al saldo
	if(validarRetiro(pMonto)){
		saldo-=pMonto;
		Operacion nuevaOperacion=new Operacion(++numOperaciones,"retiro", pMonto);
		operaciones.add(nuevaOperacion);
		return "Saldo actual : "+saldo;
	}
	else{
		return "No tiene suficiente dinero";
		
	}
}

@Override
public String toString() {
	//Salida: String con los valores en la clase
	String msg;
	msg="Cuenta Número: " + getNumCuenta() + "\n";
	msg+="Fecha creadan: " + getFechaCreacion() + "\n";
	msg+=duenio.toString();
	msg+="Saldo: " + getSaldo() + "\n";
	msg+="Registro de Operaciones" + "\n";
	msg+="Número" + "Fecha" + "Operación" + "Monto" + "\n";
	for (int i = 0; 1<operaciones.size();i++)
	{
		Operacion unaOp=(Operacion)operaciones.get(i);
		msg+= unaOp.toString();
	}
	return msg;
}
//Constructor
public Cuenta(Cliente pDuenio,double pMonto){
	//Entradas: String con el nombre y numero doble con un monto
	sCantCuentas ++;
	setNumCuenta(sCantCuentas);
	depositar(pMonto);
	setDuenio(pDuenio);
	setFechaCreacion(); 
	operaciones=new ArrayList<Operacion>();
}
}