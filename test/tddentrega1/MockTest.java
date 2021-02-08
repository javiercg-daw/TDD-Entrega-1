package tddentrega1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MockTest {

    @Test
    void testMetodoMock() {
        // Test A
        int esperado = 0;
        int[][] testArray = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int resultado = Mock.metodoMock(testArray);
        assertEquals(resultado, esperado);

        // Test B
        esperado = 1;
        testArray = new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        resultado = Mock.metodoMock(testArray);
        assertEquals(resultado, esperado);

        //Test C
        esperado = -3;
        testArray = new int[][]{{2, 1, 3}, {-1, 1, 0}, {-2, 4, 1}};
        resultado = Mock.metodoMock(testArray);
        assertEquals(resultado, esperado);

        //Test D
        esperado = 11;
        testArray = new int[][]{{2, 3, -1}, {0, 1 / 2, -1}, {-2, 1, 4}};
        resultado = Mock.metodoMock(testArray);
        assertEquals(resultado, esperado);
    }

    @Test
    void testK() {
        // Test A
        int[] esperado = {-4, 6, 1};
        int[][] testArray = new int[][]{{3, 2, 1, 1}, {5, 3, 4, 2}, {1, 1, -1, 1}};
        int[] resultado = Mock.k(testArray);
        assertArrayEquals(resultado, esperado);

        // Test B
        esperado = new int[]{3 / 5, 5 / 3, 0};
        testArray = new int[][]{{1, 1, 1, 34 / 15}, {1, -1, 1, -16 / 15}, {5, 3, -1, 8}};
        resultado = Mock.k(testArray);
        assertArrayEquals(resultado, esperado);
    }

}