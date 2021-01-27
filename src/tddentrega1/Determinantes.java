package tddentrega1;

import java.util.Arrays;

public class Determinantes {
    public static double calcularDeterminantes(double[][] array) {
        if (array.length != 3 || Arrays.stream(array).anyMatch(a -> a.length != 3)) {
            throw new IllegalArgumentException("El array introducido no tiene las dimensiones correctas");
        }
        final double A = array[0][0];
        final double B = array[0][1];
        final double C = array[0][2];
        final double D = array[1][0];
        final double E = array[1][1];
        final double F = array[1][2];
        final double G = array[2][0];
        final double H = array[2][1];
        final double I = array[2][2];

        return (A * E * I + B * F * G + C * D * H) - (G * E * C + H * F * A + I * D * B);
    }
}
