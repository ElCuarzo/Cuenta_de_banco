package com.cuentadebanco.bankaccounttest;
import com.cuentadebanco.bankaccount.BankAccount;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount diego = new BankAccount();
		BankAccount vicente = new BankAccount();
		BankAccount ernesto = new BankAccount();
		BankAccount admin = new BankAccount();
		BankAccount.getCuentaCreadas();
		System.out.println(diego.getsaldoCuentaAhorros());
		System.out.println(diego.getsaldoCuentaCorriente());
		System.out.println(diego.depositarDineroCC(50000.0));
		System.out.println(diego.depositarDineroCA(80000.0));
		System.out.println(admin.depositarDineroCA(1.0));
		System.out.println(vicente.depositarDineroCA(10000.0));
		System.out.println(vicente.depositarDineroCC(5000.0));
		System.out.println(ernesto.depositarDineroCA(90000.0));
		System.out.println(ernesto.depositarDineroCC(50000.0));
		System.out.println(diego.depositarDineroCA(50000.0));
		System.out.println(BankAccount.getTotaDineroAlmacenado());
		diego.mostrarTotalCuenta();
		System.out.println(diego.retirarDineroCC(30000.0));
		
	}
}
