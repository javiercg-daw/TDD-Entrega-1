package tddentrega1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class DeterminantesTest {

    @Test
    void calcularDeterminantes() {
        double esperado = 0;
        double[][] testArray = new double[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        double resultado = Determinantes.calcularDeterminantes(testArray);
        assertEquals(resultado, esperado);

        // Test B
        esperado = 0;
        testArray = new double[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        resultado = Determinantes.calcularDeterminantes(testArray);
        assertEquals(resultado, esperado);

        //Test C
        esperado = -3;
        testArray = new double[][]{{2, 1, 3}, {-1, 1, 0}, {-2, 4, 1}};
        resultado = Determinantes.calcularDeterminantes(testArray);
        assertEquals(resultado, esperado);

        //Test D
        esperado = 11;
        testArray = new double[][]{{2, 3, -1}, {0, 1.0 / 2.0, -1}, {-2, 1, 4}};
        resultado = Determinantes.calcularDeterminantes(testArray);
        assertEquals(resultado, esperado);
    }
}