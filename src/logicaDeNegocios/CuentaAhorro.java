package logicaDeNegocios;

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

	// Constructor
	public CuentaAhorro(Cliente pDuenio, double pMonto)
	{
		super ("Cuenta de Ahorro", ++scantCuentas, pDuenio, pMonto);
		setCoutaMantenimiento(300); // Couta
	}
}
