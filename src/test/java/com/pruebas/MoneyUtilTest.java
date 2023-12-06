package com.pruebas;

import org.junit.Assert;
import org.junit.Test;

public class MoneyUtilTest {
    
    @Test
    public void MoneyTest(){

        MoneyUtil mu = new MoneyUtil();

        String nf = mu.format(3000,"S");

        Assert.assertEquals("S3000,00", nf);

    }

    @Test
        public void MoneyNegativeTest(){

        MoneyUtil mu = new MoneyUtil();
        
        String nf = mu.format(-3000,"S");

        Assert.assertEquals( "S3000,00", nf);

    }

        @Test
        public void MoneyDecimalTest(){

        MoneyUtil mu = new MoneyUtil();
        
        String nf = mu.format(3000,"S");

        Assert.assertEquals( "S3000,00", nf);

    }

    @Test
        public void MoneyTestPounds(){

        MoneyUtil mu = new MoneyUtil();
        
        String nf = mu.format(3000,"\u0043");

        Assert.assertEquals( "\u00433000,00", nf);

    }
}