package ar.edu.unlam.pb2;

import static org.junit.Assert.*;
//import junit.framework.Assert;

import org.junit.Test;

public class Testing {

	@Test	
	public void VerificarNoHaySobregiro() 
	{
		CuentaCorriente miCuenta = new CuentaCorriente ();
		miCuenta.setSaldo(400d);
		miCuenta.setSobregiro(1000d);
		miCuenta.extraer(500d);
		assertEquals(-100d, miCuenta.getSaldo(), 0.01);
	}
	
	@Test
	public void CrearDeposito()
	{
		Cuenta miCuenta = new Cuenta();
		miCuenta.setSaldo(400d);
		miCuenta.depositar(400d);
		assertEquals(800d, miCuenta.getSaldo(), 0.01);
	}
	
	@Test
	public void VerificarInteres()
	{
		CajaDeAhorro miCuenta = new CajaDeAhorro();
		miCuenta.setSaldo(400d);
		miCuenta.setInteres(1d);
		miCuenta.calcularIneteres();
		assertEquals(400d,miCuenta.getSaldo(),0.01);
	}
	@Test
	public void CrearExtraccion()
	{
		CajaDeAhorro miCuenta = new CajaDeAhorro();
		miCuenta.setSaldo(400d);
		miCuenta.extraer(500d);
		assertEquals(400d, miCuenta.getSaldo(), 0.01);
	}
}
