package com.cuentadebanco.bankaccount;
import java.util.Random;

public class BankAccount {
	private String numeroDeCuenta;
	private double saldoCuentaCorriente;
	private double saldoCuentaDeAhorro;
	private static int cuentasCreadas;
	private static double totalDineroAlmacenado;
	
	public BankAccount(){
		this.numeroDeCuenta = retornarNumeroCuenta();
		cuentasCreadas++;
	}
	
	public static void getCuentaCreadas() {
		System.out.println("El numero de cuentas creadas es de: " + cuentasCreadas);
	}
	
	public static String getTotaDineroAlmacenado() {
		return "El total del dinero almacenando en este banco es de: " + totalDineroAlmacenado + "$";
	}
	
	private String retornarNumeroCuenta() {
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sb.append(random.nextInt(10));
		}
		return sb.toString();
	}
	
	public String getsaldoCuentaCorriente() {
		return "Su saldo en su cuenta corriente es de: " + this.saldoCuentaCorriente;
	}
	
	public String getsaldoCuentaAhorros() {
		return "Su saldo en su cuenta de ahorros es de: " + this.saldoCuentaDeAhorro;
	}
	
	public String depositarDineroCC(double cantidad) {
		this.saldoCuentaCorriente += cantidad;
		totalDineroAlmacenado += cantidad;
		System.out.println("Su Dinero actual es de: " + saldoCuentaCorriente);
		return "La cantidad de " + cantidad + " fue agregada con exito.";
	}
	
	public String depositarDineroCA(double cantidad) {
		this.saldoCuentaDeAhorro += cantidad;
		totalDineroAlmacenado += cantidad;
		System.out.println("Su Dinero actual es de: " + saldoCuentaDeAhorro);
		return "La cantidad de " + cantidad + " fue agregada con exito.";
	}
	
	public String retirarDineroCC(double cantidad) {
		if (this.saldoCuentaCorriente > 0) {
			if(this.saldoCuentaCorriente - cantidad >= 0) {
				this.saldoCuentaCorriente -= cantidad;
				totalDineroAlmacenado += cantidad;
				mostrarTotalCuenta();
				return "Su retiro ha sido exitoso";
			}
			else {
				return "No tienes saldo sufiente en tu cuenta para realizar este retirno";
			}
		}
		else {
			return "No tienes saldo en tu cuenta para poder realizar algún retiro";
		}
	}
	
	public String retirarDineroCA(double cantidad) {
		if (this.saldoCuentaDeAhorro > 0) {
			if(this.saldoCuentaDeAhorro - cantidad >= 0) {
				this.saldoCuentaDeAhorro -= cantidad;
				totalDineroAlmacenado += cantidad;
				mostrarTotalCuenta();
				return "Su retiro ha sido exitoso";
			}
			else {
				return "No tienes saldo sufiente en tu cuenta para realizar este retirno";
			}
		}
		else {
			return "No tienes saldo en tu cuenta para poder realizar algún retiro";
		}
	}
	
	public void mostrarTotalCuenta() {
		System.out.println("Su numero de cuenta es: " + numeroDeCuenta);
		System.out.println("La suma de su cuenta corriente es de: " + this.saldoCuentaCorriente);
		System.out.println("La suma de su cuenta de ahorros es de: " + this.saldoCuentaDeAhorro);
		double totalCuenta = this.saldoCuentaCorriente + this.saldoCuentaDeAhorro;
		System.out.println("El total es de: " + totalCuenta);
	}
}
