package Clase3;
import java.util.Scanner;
public class ClasePrincipal {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	Calculadora c = new Calculadora();
	Double Resultado =0.0;
	System.out.println("Ingrese numero 1");
	Scanner sc = new Scanner(System.in);
	String n1= sc.nextLine();
	
	System.out.println("Ingrese numero 2");
	String n2= sc.nextLine();
	
	System.out.println("Ingrese Operacion:/n+'Para Sumar /n '/' Para dividir");
	String op= sc.nextLine();
	System.out.println(op);
	
	if(c.VerificacionSimbolo(op))
	{
		
		Resultado=c.Calcular(op, n1, n2);
		System.out.println(Resultado.toString());
	}
	/*  
	 * en chequeada
	 * Es obligatorio poner try y catch
	 * 
	 * es obligatorio controlarla/ chequearla. El compilador no compila.
	 * 
	 * todo del lado del compilador: si la chequeas la excepcion, te deja compilar.
	 * 
	 * Ejercicio 5: Resolver
	 * */
	try
	{
		c.dividirChequeado(0, 0);
		c.dividirNoChequeado(0, 0);
	}
	catch(Exception e)
	{
	  e.printStackTrace();
	}
	
	
	
		
		
		
	}
	
	
	 
	

}
