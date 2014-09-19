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

public class Automovil {
	//Atributos de la clase automovil
	private static int CPlaca=0;
	private String Marca=null;
	private int Costo=0;
	private  int Placa=0;
	private String Color=null;
	private Date FechaCompra;
	private String Dueno;
	private String Telefono_Dueno;
	private boolean isChocado=false;
//Metodos get y set	
	public String getMarca() {
		return Marca; //Salida: String 
	}
	public void setMarca(String marca) {
		Marca = marca;//Entrada: String con la marca
	}
	public int getCosto() {
		return Costo; //Salida: numero entero 
	}
	public void setCosto() {
		Costo = (int)(Math.random()*3000+7000);//El precio se asigna de forma aleatorio por lo tanto se utiliza la funcion ramdon de la librearia Math
	}
	public int getPlaca() {
		return Placa;//Salida:numero entero de la placa
	}
	public void setPlaca(int Placa) {
		this.Placa=Placa;//Entrada:numero entero de la placa
	}
	public String getColor() {
		return Color;//Salida:String con el color
	}
	public void setColor(String color) {
		Color = color;//Entrada:String con el color
	}
	
	public void setFechaCompra(){
		//Se utiliza la clase calendario para obtener la fecha de la maquina
		Calendar calendario;
		calendario=Calendar.getInstance();
		FechaCompra=calendario.getTime();
	}
	public String getFechaCompra() {
		//Se crea una mascara para que muestre la fecha en el formato dia/mes/año
		SimpleDateFormat mascara=new SimpleDateFormat("dd/MM/yy");
		return mascara.format(FechaCompra);
	}

	public String getDueno() {
		return Dueno;//Salida:String con el nombre del dueño
	}
	public void setDueno(String dueno) {
		Dueno = dueno;//Entrada:String con el nombre del dueño
	}
	public String getTelefono_Dueno() {
		return Telefono_Dueno;//Salida:String con el telefono
	}
	public void setTelefono_Dueno(String telefono_Dueno) {
		Telefono_Dueno = telefono_Dueno;//Entrada:String con el telefono
	}
	public boolean getisChocado() {
		return isChocado;//Salida: true o false(0 o 1) 
	}
	public void setChocado(boolean isChocado) {
		this.isChocado = isChocado;//Entrada: true o false(0 o 1)
	}
	
//Metodo cambiar color
//Si el color es igual el cambio no se realiza de lo contrario se realiza el cambio de color
public String cambiarColor(String C_color){
	//Entrada: String con el color
	//Salida: String con mensaje de exito o fracaso
	//Restricciones: El color debe de ser diferente al que tiene el carro
	if (C_color==getColor()){
		return ("No se puede realizar el cambio de color");
	}
	else{
		setColor(C_color);
		return("El color del auto ha sido cambiado con exito");
		}
}

public void cambiarDueno(String nombre,String telefono ){
	//Entrada: String con el telefono y String con el nombre
	//Salida:Mensaje de exito o fracaso;
	//Restricciones: El automovil no puede estar chocado
	//Si la variable boolena auto=false, el atuo no ha sido chocado y se puede transferir de dueño
	//De lo contario el auto no se puede cambiar
	boolean auto =getisChocado();
	if (!auto){
		setDueno(nombre);
		setTelefono_Dueno(telefono);
		System.out.println("El automovil placa: "+""+ Placa +", ha cambiado de dueño exitosamente");
	}
	else{
		System.out.println("El automovil placa "+ ""+Placa +" no puede cambiar de dueño,debido que, esta chocado");
	}
	
}


public String repararAutomovil(){
	//Salida: String con mensaje de exito o error
	//Si el auto esta chocado no se necesita reparar
	//De lo contrario,cambia el estado del atributo
	
	if (!getisChocado()){
		return("No es necesario reparar el automovil");
	}
	else{
		setChocado(false);
		return("El automovil fue reparado exitosamente");
	}
}
public String chocarAutomovil(){
	//Salida:Mensaje de exito
	//Cambia el estado del atributo isChocado por true
	setChocado(true);
	return("El automovil placa: "+getPlaca()+" ha chocado"+"\n");
}

public Automovil(String nombre,String telefono,String marca,String color){
	//El constructor
	setDueno(nombre);
	setTelefono_Dueno(telefono);
	setMarca(marca);
	setColor(color);
	CPlaca+=1;//Para aumentar el numero de placas y luego pasarlo como atributo a Placa
	setPlaca(CPlaca);//asi se puede asignar de forma consecutiva la placa
	setCosto();
	setFechaCompra();
	}

@Override
public String toString() {
	//Se crea un string para poder determinar si el auto ha sido chocado o no
	
	String chocado=null;
	if (getisChocado()){
		chocado="Chocado"+"\n";
	}
	else{
	chocado= "Sin chochar "+"\n";	
	}
	//Se imprime los datos del objeto
	return "Dueño: " + getDueno() +"\n" +"Telefono Dueño: " + getTelefono_Dueno()
			+ "\n"+ "FechaCompra: " + getFechaCompra() +"\n"+ "Marca: " + getMarca() +"\n" +"Color: "
			+ getColor()+"\n" +"Costo: $" + getCosto()+"\n" + "Placa N°: " + getPlaca() +"\n"+ "Estado: "
			+ chocado + "\n";
}
}
