package com.gbs.unit.test.junit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author gdy
 * @date 2020-03-22
 */
public class CarTest {

    private Car car;

    @Before
    public void setUp() throws Exception {
        System.out.println("开始测试啦");
        car = new Car();
    }

    @Test
    public void getCarName() {
        String carName = car.getCarName("奔驰");
        assertEquals("奔驰",carName);
    }

    @Test
    public void isBenz() {
        boolean benz = car.isBenz("大众");
        assertFalse(benz);
    }


    @After
    public void tearDown() throws Exception {
        System.out.println("测试结束");
    }


}