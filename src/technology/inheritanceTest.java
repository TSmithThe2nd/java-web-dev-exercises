package technology;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class inheritanceTest {
    Laptop myLaptop;
    SmartPhone myPhone;
    @Before
    public void createsObject(){
         myLaptop= new Laptop("HP","Windows",14,500,"Intel 20x", true);
         myPhone= new SmartPhone("Apple","IOS",6,"Not bad","ATT", false);
    }
    @Test
    public void emptyTest(){

    }
    @Test
    public void isObjectLaptopCreated(){
        assertTrue(myLaptop instanceof Laptop);
    }

    @Test
    public void isObjectSmartPhoneCreated(){
        assertTrue(myPhone instanceof SmartPhone);
    }

    @Test
    public void dofieldsSetcorrect(){
        assertEquals(myPhone.getBatteryLife(), "6hrs");
    }



}
