package tddentrega1;

import java.util.Arrays;

public class Determinantes {
    public static int calcularDeterminantes(int[][] array) {
        if (array.length != 3 || Arrays.stream(array).anyMatch(a -> a.length != 3)) {
            throw new IllegalArgumentException("El array introducido no tiene las dimensiones correctas");
        }
        final int A = array[0][0];
        final int B = array[0][1];
        final int C = array[0][2];
        final int D = array[1][0];
        final int E = array[1][1];
        final int F = array[1][2];
        final int G = array[2][0];
        final int H = array[2][1];
        final int I = array[2][2];

        return (A * E * I + B * F * G + C * D * H) - (G * E * C + H * F * A + I * D * B);
    }
}
