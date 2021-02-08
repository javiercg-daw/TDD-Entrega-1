package tddentrega1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DeterminantesTest {

    @ParameterizedTest
    @MethodSource("parametrosArrays")
    void calcularDeterminantes(double[][] testArray, double esperado) {
        double resultado = Determinantes.calcularDeterminantes(testArray);
        assertEquals(resultado, esperado);
    }

    private static Stream<Arguments> parametrosArrays() {
        return Stream.of(
                Arguments.of(new double[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}, 0),
                Arguments.of(new double[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}, 0),
                Arguments.of(new double[][]{{2, 1, 3}, {-1, 1, 0}, {-2, 4, 1}}, -3),
                Arguments.of(new double[][]{{2, 3, -1}, {0, 1.0 / 2.0, -1}, {-2, 1, 4}}, 11)
        );
    }

    @ParameterizedTest
    @MethodSource("parametrosTestK")
    void testK(int[][] testArray, double[] esperado) {
        double[] resultado = Determinantes.k(testArray);
        assertArrayEquals(resultado, esperado);
    }

    private static Stream<Arguments> parametrosTestK() {
        return Stream.of(
                Arguments.of(new int[][]{{3, 2, 1, 1}, {5, 3, 4, 2}, {1, 1, -1, 1}}, new int[]{-4, 6, 1}),
                Arguments.of(new int[][]{{1, 1, 1, 34 / 15}, {1, -1, 1, -16 / 15}, {5, 3, -1, 8}}, new int[]{3 / 5, 5 / 3, 0})
        );
    }


}