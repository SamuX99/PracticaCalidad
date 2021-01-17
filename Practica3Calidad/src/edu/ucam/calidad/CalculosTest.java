package edu.ucam.calidad;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculosTest {
	
	//Assert Equals
		@Test
		public void multiCalPos() {
			System.out.println("Assert Equals Multiplicacion: ");
			Calculos c3 = new Calculos(10.765, 5.647, 2.425);
			System.out.println("Resultado esperado = 147.415640875");
			System.out.println("Resultado real = " + c3.multi() + "\n");
			assertEquals(c3.multi(), 147.415640875 );
		}
		
		@Test
		public void divCalNeg() {
			System.out.println("Assert Equals Division: ");
			Calculos c4 = new Calculos(10.765, 5.647, 1);
			System.out.println("Resultado esperado = 2.9063219408535506");
			System.out.println("Resultado real = " + c4.dividir() + "\n");
			assertEquals(c4.dividir(), 2.9063219408535506);
		}	
		
		//Assert True
		@Test
		public void sumaCalPos() {
			System.out.println("Assert True Suma: ");
			Calculos c1 = new Calculos(8.765, 12.647, 20.425);
			System.out.println("Resultado esperado = 41.837");
			System.out.println("Resultado real = " + c1.suma() + "\n");
			assertTrue(c1.suma() == 41.837);
		}
		
		@Test
		public void restaCalPos() {
			System.out.println("Assert True Resta: ");
			Calculos c2 = new Calculos(50.765, 10.647, -9.425);
			System.out.println("Resultado esperado > 39.543");
			System.out.println("Resultado real = " + c2.resta() + "\n");
			assertTrue(c2.resta() > 39.543);
		}
		
		//Assert False
		@Test
		public void sumaCalNeg() {
			System.out.println("Assert False Suma: ");
			Calculos c1 = new Calculos(8.765, 12.647, -30.425);
			System.out.println("Resultado esperado != -9.013000000000002");
			System.out.println("Resultado real = " + c1.suma() + "\n");
			assertFalse(c1.suma() == -9.013000000000002);
		}
		
		@Test
		public void restaCalNeg() {
			System.out.println("Assert False Resta: ");
			Calculos c2 = new Calculos(-50.765, -10.647, 9.425);
			System.out.println("Resultado esperado < -59.543");
			System.out.println("Resultado real = " + c2.resta() + "\n");
			assertFalse(c2.resta() > -59.543);
		}
		
		//Assert Not Null
		@Test
		public void divCalPos() {
			System.out.println("Assert NotNull Division: ");
			Calculos c4 = new Calculos(10.765, 5.647, 2.425);
			System.out.println("Resultado esperado = NotNull");
			System.out.println("Resultado real = " + c4.dividir() + "\n");
			assertNotNull(c4.dividir());
		}
		
		//Assert Null
		@Test
		public void multiCalNeg() {
			System.out.println("Assert Null Multiplicacion: ");
			Calculos c3 = new Calculos(10.765,0,2.425);
			System.out.println("Resultado esperado = Null");
			System.out.println("Resultado real = " + c3.multi() + "\n");
			assertNull(c3.multi());
		}
		
		//Assert Same
		@Test
		public void StringCal() {
			System.out.println("Assert Same String: ");
			Calculos c5 = new Calculos("Jose");
			System.out.println("Resultado esperado = Manuel");
			System.out.println("Resultado real = " + c5.nombre() + "\n");
			assertSame(c5.nombre(), "Manuel");
		}	
		
		//Assert Not Same
		@Test
		public void StringCalNot() {
			System.out.println("Assert NotSame String: ");
			Calculos c5 = new Calculos("Jose");
			System.out.println("Resultado esperado != Manuel");
			System.out.println("Resultado real = " + c5.nombre() + "\n");
			assertNotSame(c5.nombre(), "Manuel");
		}	
		
		//Assert Array Equals
		@Ignore
		@Test
		public void ArrayCal() {
			int arr1[] = {1,2,3};
			int arr2[] = {1,2,3};
			System.out.println("Assert ArrayEquals Array: ");
			Calculos c6 = new Calculos(arr1);
			System.out.println("Resultado esperado = 1,2,3");
			System.out.println("Resultado real = " + c6.array()[0] + "," +c6.array()[1]+ ","+ c6.array()[2] + "\n");
			assertArrayEquals(c6.array(),arr2);
		}
		
		//Annotations
		@BeforeClass
	    public static void beforeClass() {
	        System.out.println("-Inicio de la Ejecucion\n");
	    }
		
		@AfterClass
	    public static void afterClass() {
	        System.out.println("-Fin de la Ejecucion");
	    }
		
		@Before
	    public void before() {
	        Calculos.n1=0;
	        Calculos.n2=0;
	        Calculos.n3=0;
	        System.out.println("-Actualizamos variables antes\n");
	    }
		
		@After
	    public void after() {
			Calculos.n1=1;
	        Calculos.n2=2;
	        Calculos.n3=3;
	        System.out.println("-Actualizamos variables despues\n\n");
	    }

}
