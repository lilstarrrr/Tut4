package org.bcx.tut4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCalc {
    Calc cal;

    @BeforeEach
    void setUp(){
        cal = new Calc();
    }

    @AfterEach
    void tearDown(){
        cal = null;
    }

    @Test
    void add() {
        assertEquals(30, Calc.add(10, 20));
    }

    @Test
    void subtract() { assertEquals(10, Calc.subtract(20, 10)); }


}
