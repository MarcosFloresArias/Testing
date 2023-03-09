package Prueba;

public class Calculadora {
	
	private int num1;
	private int num2;

	public Calculadora(int a, int b) {
		
		num1=a;
		num2=b;
		
	}
	public int suma() {
		int result;
		result = num1 + num2;
		return result;
		
	}
	
	public int resta() {
		int result;
		result = num1 - num2;
		return result;
	}
	
	public int multi() {
		int result;
		result = num1 * num2;
		return result;
	}
	
	public int divi() {
		int result;
		result = num1 / num2;
		return result;
	}
	
	public int divi0() {
		if (num2 == 0) {
			throw new java.lang.ArithmeticException("divi0");
		}else {
			int result = num1 / num2;
			return result;
		}
	}

}
