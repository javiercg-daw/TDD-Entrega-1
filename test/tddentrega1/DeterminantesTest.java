package tddentrega1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeterminantesTest {

    @Test
    void calcularDeterminantes() {
        // Test A
        int esperado = 0;
        int[][] testArray = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int resultado = Determinantes.calcularDeterminantes(testArray);
        assertEquals(resultado, esperado);

        // Test B
        esperado = 1;
        testArray = new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        resultado = Determinantes.calcularDeterminantes(testArray);
        assertEquals(resultado, esperado);

        //Test C
        esperado = -3;
        testArray = new int[][]{{2, 1, 3}, {-1, 1, 0}, {-2, 4, 1}};
        resultado = Determinantes.calcularDeterminantes(testArray);
        assertEquals(resultado, esperado);

        //Test D
        esperado = 11;
        testArray = new int[][]{{2, 3, -1}, {0, 1 / 2, -1}, {-2, 1, 4}};
        resultado = Determinantes.calcularDeterminantes(testArray);
        assertEquals(resultado, esperado);
    }
}