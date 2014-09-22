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

import java.util.Calendar;

public class CuentaAhorro extends Cuenta
{
	// Atributos
	private static int scantCuentas = 0;
	private double coutaMantenimiento;

	// Métodos Get & Set
	/** Get & Set ScantCuentas */
	public static int getScantCuentas() {return scantCuentas;}
	public static void setScantCuentas(int scantCuentas) {CuentaAhorro.scantCuentas = scantCuentas;}
	/** Get & Set Couta Mantenimiento */
	public double getCoutaMantenimiento() {return coutaMantenimiento;}
	public void setCoutaMantenimiento(double coutaMantenimiento) {this.coutaMantenimiento = coutaMantenimiento;}

	// Constructor(1)
	public CuentaAhorro(Cliente pDuenio, double pMonto)
	{
		super ("Cuenta de Ahorro", ++scantCuentas, pDuenio, pMonto);
		setCoutaMantenimiento(300); // Couta de mantenimiento por omisión
	}
	
	// Contructor (2)
	public CuentaAhorro (Cliente pDuenio, double pMonto, double pCuota)
	{
		super ("Cuenta de Ahorro", ++scantCuentas, pDuenio, pMonto);
		setCoutaMantenimiento(pCuota);
	}
	
	// Cobro de Comisiones
	public String cobrarComisiones()
	{
		String msg = "";
		Calendar calendario;
		calendario = Calendar.getInstance();

		int dia = calendario.get(Calendar.DAY_OF_MONTH);
		if (dia == 1)
		{
			retirar(coutaMantenimiento);
			numOperaciones = 0; // Se reinicia para el mes siguiente
			msg = "Se cobró por comisión : " + coutaMantenimiento;
		}
		return msg;
	}
	
}
