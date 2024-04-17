package app;

import util.Algoritmos;

public class Principal extends Algoritmos{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numeros = new int [5];
		int []resultadoFibonacci = new int [5];
		int []resultadoFactorial = new int [5];
		boolean []resultadoPrimos = new boolean [5];
		
		int numFibonacci =0;
		int n;
		int v;
		boolean x;
		
		int numFactorial =0;
		java.util.Random rm=new java.util.Random();
		
		//Array de los 5 numeros random
		for (int i =0; i<numeros.length; i++) {
			
	        int num = rm.nextInt(1,10);
	        numeros[i]=num;
		}
		
		//Array de los 5 numeros fibonacci
		for (int i =0; i<numeros.length; i++) {
			
			numFibonacci=numeros[i];
			n= fibonacci(numFibonacci);
			resultadoFibonacci[i]=n;
		
		}
		
		//Array de los 5 numeros factoriales
		for (int i=0; i<numeros.length;i++) {
			
			numFactorial= numeros[i];
			v= factorial(numFactorial);
			resultadoFactorial[i]=v;
		}
		
		//Array de los 5 numeros primos
		for (int i=0; i<numeros.length;i++) {
			
			x= esPrimo(numeros[i]);
			resultadoPrimos[i]=x;
			
		}
		
		
		
		
		
	}

}
