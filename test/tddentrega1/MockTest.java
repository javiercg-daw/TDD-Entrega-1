package tddentrega1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MockTest {

    @Test
    void testMetodoMock() {
        // Test A
        int[][] testArray = new int[][]{{0,0,0},{0,0,0},{0,0,0}};
        assertEquals(Mock.metodoMock(testArray), 0);

        // Test B
        testArray = new int[][]{{1,1,1},{1,1,1},{1,1,1}};
        assertEquals(Mock.metodoMock(testArray), 1);

        //Test C
        testArray = new int[][]{{2,1,3},{-1,1,0},{-2,4,1}};
        assertEquals(Mock.metodoMock(testArray), -3);

        //Test D
        testArray = new int[][]{{2,3,-1},{0,1/2,-1},{-2,1,4}};
        assertEquals(Mock.metodoMock(testArray), 11);
    }

}