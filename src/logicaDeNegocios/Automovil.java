package logicaDeNegocios;

import logicaDeNegocios.Motor;
import java.util.*;
import java.text.*;
import java.util.Calendar;

public abstract class Automovil {
	
	
	//Atributos de la clase automovil
	private static int CPlaca = 0;
	private String Marca = null;
	private int Costo = 0;
	private int Placa = 0;
	private String Color = null;
	private Date FechaCompra;
	private String Dueno;
	private String Telefono_Dueno;
	private boolean isChocado = false;
	private String tipoAuto;
	
	
//Metodos get y set	
	public String getMarca() {return Marca;}	//Salida: String
	public void setMarca(String marca) {Marca = marca;}	//Entrada: String con la marca

	public int getCosto() {return Costo;}	//Salida: numero entero
	//El precio se asigna de forma aleatorio por lo tanto se utiliza la funcion ramdon de la librearia Math
	public void setCosto() {Costo = (int)(Math.random()*3000+7000);}
	
	public int getPlaca() {return Placa;}	//Salida:numero entero de la placa
	public void setPlaca(int Placa) {this.Placa=Placa;}//Entrada:numero entero de la placa
	
	public String getColor() {return Color;}	//Salida:String con el color
	public void setColor(String color) {Color = color;}//Entrada:String con el color
	
	public void setFechaCompra(){
		//Se utiliza la clase calendario para obtener la fecha de la maquina
		Calendar calendario;
		calendario=Calendar.getInstance();
		FechaCompra=calendario.getTime();}
	
	public String getFechaCompra() {
		//Se crea una mascara para que muestre la fecha en el formato dia/mes/a�o
		SimpleDateFormat mascara=new SimpleDateFormat("dd/MM/yy");
		return mascara.format(FechaCompra);}

	public String getDueno() {return Dueno;}	//Salida:String con el nombre del dueno
	public void setDueno(String dueno) {Dueno = dueno;}	//Entrada:String con el nombre del due�o
	
	public String getTelefono_Dueno() {return Telefono_Dueno;} //Salida:String con el telefono
	public void setTelefono_Dueno(String telefono_Dueno) {Telefono_Dueno = telefono_Dueno;}	//Entrada:String con el telefono
	
	public boolean getisChocado() {return isChocado;}	//Salida: true o false(0 o 1) 
	public void setChocado(boolean isChocado) {this.isChocado = isChocado;} 	//Entrada: true o false(0 o 1)
	
	
	// M�todos
	public String calcularTraccion(int pInclinacion)
	{	
		int traccion = (Motor.getEstado() * Motor.getCilindraje() ) + (pInclinacion * 980);
		
		return "Placa de auto: " + Placa + ". " + "Tracción obtenida: " + traccion;
	}
	public static int getCPlaca() {return CPlaca;}
	public static void setCPlaca(int cPlaca) {CPlaca = cPlaca;}
	public String getTipoAuto() {return tipoAuto;}
	public void setTipoAuto(String tipoAuto) {this.tipoAuto = tipoAuto;}
}
