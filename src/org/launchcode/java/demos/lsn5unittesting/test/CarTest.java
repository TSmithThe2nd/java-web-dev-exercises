package org.launchcode.java.demos.lsn5unittesting.test;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
//    @Test
//    public void emptyTest() {
//        assertEquals(10,10,.001);
//    }
    //TODO: constructor sets gasTankLevel properly
    Car test_car;
    Car gas_guzzler;
    @Before
    public void createCarObject(){
         test_car = new Car("Toyota", "Prius", 10, 50);
         gas_guzzler= new Car("hummer", "H2", 10, 1);
    }
    @Test
    public void testInitialGasTan(){
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDrive(){
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(),.01);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void gasTankAfterExceedingTank(){
        gas_guzzler.drive(50);
        assertEquals(0,gas_guzzler.getGasTankLevel(), .01);
    }
    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverFill(double gas){

    }

}
