package Test;

import org.junit.Assert;
import org.junit.Test;
import Clase3.Calculadora;


public class CalculadoraTest {
	
	/*sin retorno, sin parametros @Test*/
	@Test
	public void sumaTest()
	{
		Calculadora c= new Calculadora();
		try{
		Double result = c.Sumar(2.0, 2.0);
		Assert.assertEquals(4.0, result,0);
		}
		
		catch(Exception e)
		{
			Assert.fail("No tiro error");
		}
	}
	
	@Test
	public void sumaExceptionTest()
	{
		Calculadora c= new Calculadora();
		try
		{
			Double result = c.Sumar(null, 2.0);
			Assert.fail("no tiro error");
		}
		catch(NullPointerException e)
		{
			Assert.assertTrue(true);
		}
		catch(Exception e)
		{
			Assert.fail(" ");
		}
		
	}
	
	@Test
	public void DivideTest()
	{
		Calculadora c= new Calculadora();
		try
		{
			Double result = c.Dividir(2.0, 2.0);
			Assert.assertEquals(1.0, result,0);
		}
		
		catch(Exception e)
		{
			Assert.fail(" ");
		}
		
	}
	
	@Test
	public void DivideExceptionTest()
	{
		Calculadora c= new Calculadora();
		try
		{
			Double result = c.Dividir(null, 2.0);
			Assert.fail("no tiro error");
		}
		catch(NullPointerException e)
		{
			Assert.assertTrue(true);
		}
		catch(Exception e)
		{
			Assert.fail(" ");
		}
		
	}

}
