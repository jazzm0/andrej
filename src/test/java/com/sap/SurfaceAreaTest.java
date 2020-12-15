package com.sap;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SurfaceAreaTest {

//    https://www.hackerrank.com/challenges/3d-surface-area

    // Complete the surfaceArea function below.
    static int surfaceArea(int[][] A) {
        return 0;
    }

    @Test
    public void testA() {
        assertThat(surfaceArea(new int[][]{{1}}), is(6));
    }

    @Test
    public void testB() {
        assertThat(surfaceArea(new int[][]{
                {1, 3, 4},
                {2, 2, 3},
                {1, 2, 4}
        }), is(60));
    }

    @Test
    public void testC() {
        assertThat(surfaceArea(new int[][]{{1, 3}}), is(18));
    }
}
