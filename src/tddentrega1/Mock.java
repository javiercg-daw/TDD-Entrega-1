package tddentrega1;

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

}
