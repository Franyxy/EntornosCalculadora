import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	private Calculadora calc;
	double DELTA = 1e-300;
	double ans;
	
	/*
	El Before y AfterEach es un método que se ejecuta antes y despues de un test.
	Se puede escribir en cualquier parte del junit. Se puede usar por ejemplo para inicializar variables
	Por ejemplo:  ans=0;
	*/
	
	@BeforeEach
	void Before () {
	System.out.println("before()");
	calc = new Calculadora();
	}

	@AfterEach
	void After () {
	System.out.println("After()");
	calc.clear();
	}
	
	@Test
	void testSuma() {
		double resultado=Calculadora.suma(2,3);
		double esperado=5;
		assertEquals(esperado,resultado,DELTA);
	}
	@Test
	void testResta() {
		double resultado=Calculadora.resta(3,2);
		double esperado=1;
		assertEquals(esperado,resultado,DELTA);
	}
	@Test
	void testProd() {
		double resultado=Calculadora.prod(3,2);
		double esperado=6;
		assertEquals(esperado,resultado,DELTA);
	}
	@Test
	void testDivEntera() {
		double resultado=Calculadora.divEntera(6,2);
		double esperado=3;
		assertEquals(esperado,resultado,DELTA);
	}
	
	/*
	 * No se puede dividir entre 0
	 * 
	@Test(expected = ArithmeticException.class)
	void testDivEnteraExc() {
		double resultado=Calculadora.divEntera(6,0);
		double esperado=3;
		assertEquals(esperado,resultado,DELTA);
	}
	*/
	
	/*
	 * el t en ms;
	 * un bucle "infinito" para que tarde, y si tarda mas de t da error
	@Test(timeout=100)
	public void testAlgoritmoOptimo() {
		calc"NombreClase"();
	}
	*/
	
	//Pruebas Parametrizadas
	
	/*
	 @RunWith(Parameterized.class)
	public static Iterable<Object[]> getData(){
		List <Object[]>  obj=new ArrayList<>();
		obj.add(new Object[] {3,1,4});
		obj.add(new Object[] {1,1,2});
		obj.add(new Object[] {6,4,10});
		return object;
	} 
	  
	 
	
	@RunWith(value=Suite.class){
		@Suite.SuiteClasses({
			CalculadoraParametroTest();
			CalculadoraTest.class;
		})
		public class MiSuiteSuite{}
	}
	
	
	*/

}


