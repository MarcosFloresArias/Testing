package Prueba;

public class Factorial {
	
	public static int calculo(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Numero"+n+"no puede ser (0)");
		}
		int fact = 1;
		for (int i = 2; 1 <= n; i++) {
			fact *= i;
		if (fact < 0) {
			throw new ArithmeticException("Overflow,numweo"+n+"de");
		}
		}
		return fact;
		
	}
	public static void mensajeNoNulo(String cadena) {
		System.out.println("Hola");
	}

}
