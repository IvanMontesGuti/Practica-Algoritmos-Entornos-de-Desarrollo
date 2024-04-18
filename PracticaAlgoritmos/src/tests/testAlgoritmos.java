package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import util.Algoritmos;

public class testAlgoritmos {

	@Test
	public void factorial() {
		int factorialEsperado=24;
		int factorialObtenido = Algoritmos.factorial(4);
		assertEquals(factorialEsperado,factorialObtenido);

}
	@Test
	public void fibonacci() {
		int fibonacciEsperado=13;
		int fibonacciObtenido = Algoritmos.fibonacci(7);
		assertEquals(fibonacciEsperado,fibonacciObtenido);

}
	@Test
	public void esPrimo() {
		boolean esPrimoEsperado=true;
		boolean esPrimoObtenido = Algoritmos.esPrimo(7);
		assertEquals(esPrimoEsperado,esPrimoObtenido);

}
}
