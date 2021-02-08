package tddentrega1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Mock {

    public static int metodoMock(int[][] array) {
        if (Arrays.deepEquals(array, new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}})) {
            return 0;
        } else if (Arrays.deepEquals(array, new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}})) {
            return 1;
        } else if (Arrays.deepEquals(array, new int[][]{{2, 1, 3}, {-1, 1, 0}, {-2, 4, 1}})) {
            return -3;
        } else if (Arrays.deepEquals(array, new int[][]{{2, 3, -1}, {0, 1 / 2, -1}, {-2, 1, 4}})) {
            return 11;
        } else {
            return -1;
        }
    }

    public static int[] k(int[][] entrada) {
        if (Arrays.deepEquals(
                entrada, new int[][]{{3, 2, 1, 1}, {5, 3, 4, 2}, {1, 1, -1, 1}}
        )) {
            return new int[]{-4, 6, 1};
        } else if (Arrays.deepEquals(
                entrada, new int[][]{{1, 1, 1, 34 / 15}, {1, -1, 1, -16 / 15}, {5, 3, -1, 8}}
        )) {
            return new int[]{3 / 5, 5 / 3, 0};
        } else {
            return new int[]{-1};
        }
    }
}
