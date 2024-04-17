package util;

public abstract class Algoritmos {
	
	/**
	 * Devuelve si el numero introducido es primo o no
	 * @param num el numero del cual queremos comprobar si es o no primo
	 * @return falso en caso de que no sea primo y true en caso de que lo sea
	 */
	public static boolean esPrimo (int num) {
		boolean result =true;
		
		for (int i =2; i<num;i++) {
			
			
			if ((num%i) ==0) {
				result= false;
				break;
			}
		}
				
		return result;
	}
	
	/**
	 * Devuelve el factorial de el numero n
	 * @param n el numero del cual queremos calcular el factorial
	 * @return el factorial de el numero n
	 */
	public static int factorial (int n) {
		int numFactorial =1;
		for (int i = 1; i <= n; i++) {
            numFactorial = numFactorial * i;
        }
		return numFactorial;
	}
	
	/**
	 * Devuelve la sucesion fibonacci hasta la posicion n
	 * @param n la posicion de la cual queremos saber el valor de la sucesion fibonacci
	 * @return el valor de la posicion n en la sucesion fibonacci
	 */
	public static int fibonacci (int n) {

        int num1=0;
        int num2=1; 
        int numFibonacci=0;
        
		for (int i=2; i<=n;i++) {
                    
			numFibonacci=num1+num2;
                        
                        num1=num2;
                        num2=numFibonacci;
                        
                        
		}
		return numFibonacci;
	}

}
