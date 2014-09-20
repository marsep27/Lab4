/**
 * 
 */
package logicaDeNegocios;

import java.util.Calendar;
import java.util.*;
import Cliente;
import Duenio;



/**
 * @author Samantha
 *
 */
public class CuentaCorriente extends Cuenta {
	/**
	 * Atributos
	 */
	private static int scantCuentas = 0;
	private int operacionesExcentas;
	private double coutaOperaciones;
	
	// Métodos Get & Set
	/** Get & Set ScanCuentas */
	public static int getScanCuentas() {return scantCuentas;}
	public static void setScanCuentas(int scantCuentas) {CuentaCorriente.scantCuentas = scantCuentas;}
	/** Get & Set Operaciones Excenta */
	public int getOperacionesExcentas() {return operacionesExcentas;}
	public void setOperacionesExcentas(int operacionesExcenta) {this.operacionesExcentas = operacionesExcenta;}
	/** Get & Set Couta Operaciones */
	public double getCoutaOperaciones() {return coutaOperaciones;}
	public void setCoutaOperaciones(double coutaOperaciones) {this.coutaOperaciones = coutaOperaciones;}
	
	// Constructor (1)
	public CuentaCorriente (Cliente pDuenio, double pMonto)
	{
		super( "Cuenta Corriente", ++scantCuentas, pDuenio, pMonto);
		setOperacionesExcentas(30); // Operaciones exentas por omisión
		setCoutaOperaciones(30);	// Cuota por operaciones por omisión
	}
	
	// Constructor (2)
	public CuentaCorriente(Cliente pDuenio, double pMonto,
			int pOperExentas, double pCuotaOper)
	{
		super("Cuenta Corriente", ++scantCuentas, pDuenio, pMonto);
		setOperacionesExcentas(pOperExentas);
		setCoutaOperaciones(pCuotaOper);
	}
	
	// Cobrar Comisiones
	public String cobrarComisiones()
	{
		String msg = "";
		int operacNoExentas;
		double monto;
		Calendar calendario = Calendar.getInstance();
		calendario = Calendar.getInstance();
		int dia = calendario.get(Calendar.DAY_OF_MONTH);
		if (dia == 1)
		{
			operacNoExentas = numOperaciones - getOperacionesExcentas();

			if (operacNoExentas > 0)
			{
				monto = getCoutaOperaciones() * operacNoExentas;
				retirar(coutaOperaciones);
				numOperaciones = 0; // Se reinicia para el mes siguiente
									// el número de operaciones
				msg = "Se cobró por comisión: " + monto;
			}
			
		}
		return msg;
	}

}
