package com.sap;

import org.junit.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BirthDayCandlesTest {

//    https://www.hackerrank.com/challenges/birthday-cake-candles/

    static int birthdayCakeCandles(int[] ar) {
        return 0;
    }


    @Test
    public void testA() {
        assertThat(birthdayCakeCandles(new int[]{3, 1, 2, 3}), is(2));
    }
}
