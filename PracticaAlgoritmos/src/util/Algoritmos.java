package util;

public abstract class Algoritmos {
	
	public static boolean esPrimo (int num) {
		boolean result =true;
		
		for (int i =2; i<num;i++) {
			
			
			if ((i%num) ==0) {
				result= false;
			}else {
				result = true;
			}
		}
				
		return result;
	}
	
	public static int factorial (int n) {
		int numFactorial =1;
		for (int i = 1; i <= n; i++) {
            numFactorial = numFactorial * i;
        }
		return numFactorial;
	}
	
	public static int fibonacci (int n) {

        int num1=0;
        int num2=1; 
        int numFibonacci=0;
        
		for (int i=2; i<=n;i++) {
                    
			numFibonacci=num1+num2;
                        
                        num1=num2;
                        num2=numFibonacci;
			System.out.println(numFibonacci);
                        
                        
		}
		return numFibonacci;
	}

}
