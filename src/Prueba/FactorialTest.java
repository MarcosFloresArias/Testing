package Prueba;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class FactorialTest {


	@Test
    void testCalculoDelVectorial() {
        int factorial = Factorial.calculo(5) , resultadoEsperado=120;
        assertEquals(resultadoEsperado, factorial , 0); 
    }
    
    @ParameterizedTest
    @CsvSource({"5","120","7","5040"})
    void calculoParametrizado (int numero1 , int result) {
        assertEquals(result, Factorial.calculo(numero1),0);
    }
	
    @ParameterizedTest
    @ValueSource (strings = {"Hola"})
    void prueba (String cadena) {
    	assertDoesNotThrow(()->cadena.Factorial.mesajeNoNulo(cadena));
    }
    

}

