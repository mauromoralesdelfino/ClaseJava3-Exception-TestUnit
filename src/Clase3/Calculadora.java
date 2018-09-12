package Clase3;
import java.lang.*;

public class Calculadora 
{
	/* obligatorio palabra reservada throws	 */
	public Calculadora()
	{}
	public double dividirChequeado(int i, int j) throws MiExcepcionChequeada{
		
		throw new MiExcepcionChequeada("chequeada");
		
		
	}
	
	public double dividirNoChequeado(int i, int j)
	{
		throw new MiExcepcionNoChequeada("No chequeada");
	  
	}
	
	public boolean VerificacionSimbolo(String s)
    {
        boolean resp = false;
        String operaciones = "+-*/";
        for (Integer i=0;i<operaciones.length();i++)
        {

            if(s.contains(Character.toString((operaciones.charAt(i)))))
            {
                resp = true;
            }


        }

        return resp;
    }
	
	public double Sumar(Number u, Number d)
	{	
		double total=0.0;
		total = u.doubleValue() + d.doubleValue();
		/*if(u==null)
			u=0;
		if(d==null)
			d=0;*
		return u.doubleValue() + d.doubleValue();*/ /*prueba en caso de null no validado*/
		return total;
	}
	
	public double Dividir(Number u, Number d){	
		double total=0.0;/*
		//total = u.doubleValue() + d.doubleValue();
		if(u==null)
			u=0;
		if(d==null)
			d=0;
		return u.doubleValue() / d.doubleValue();*/
		try
        {

            
            boolean condicion = (u.intValue() == 0);
            while(!condicion)
            {
                total = u.doubleValue() / d.doubleValue();
                break;
            }
            if(condicion)
            {

                throw new ArithmeticException();
            }

        }
        catch(ArithmeticException e)
        {

            System.out.println("ERROR: IMPOSIBLE DIVIDIR POR 0");
            System.out.println(e.getMessage());
        }
		
		return total;
	}
	
	public Double Calcular(String s, String Uno, String Dos)
    {
       

        double total=0;
        switch(s)
        {
            case "+":

            {
                total = Double.parseDouble(Uno) + Double.parseDouble(Dos);
                break;
            }

            case "-":
            {
                total = Double.parseDouble(Uno) - Double.parseDouble(Dos);
                break;
            }

            case "*":
            {
                total = Double.parseDouble(Uno) * Double.parseDouble(Dos);
                break;

            }

            case "/":
            {
                try
                {

                    double valor1= Double.parseDouble(Uno);
                    double valor2= Double.parseDouble(Dos);
                    boolean condicion = (valor2 == 0);
                    while(!condicion)
                    {
                        total = valor1 / valor2;
                        break;
                    }
                    if(condicion)
                    {

                        throw new ArithmeticException();
                    }

                }
                catch(ArithmeticException e)
                {

                    System.out.println("ERROR: IMPOSIBLE DIVIDIR POR 0");
                    System.out.println(e.getMessage());
                }
                finally
                {
                    System.exit(0);
                }

            }


        }
        return total;

    }
	
}
