package org.itstep;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {
    @Test
    public void kata1() {
        Assert.assertEquals(String.valueOf(0), StringCalculator.add(null));
        Assert.assertEquals(String.valueOf(0), StringCalculator.add(""));
        Assert.assertEquals(String.valueOf(1), StringCalculator.add("1"));
        Assert.assertEquals(String.valueOf(3), StringCalculator.add("1,2"));
        Assert.assertEquals(String.valueOf(4), StringCalculator.add("4,"));
    }

    @Test
    public void kata2(){
        Assert.assertEquals(String.valueOf(6), StringCalculator.add("1,2,3"));
        Assert.assertEquals(String.valueOf(4), StringCalculator.add("1,1,1,1"));
        Assert.assertEquals(String.valueOf(3), StringCalculator.add(" 1,2 "));
        Assert.assertEquals(String.valueOf(66), StringCalculator.add("11,22,33"));
    }

    @Test
    public void kata3(){
        Assert.assertEquals(String.valueOf(6), StringCalculator.add("1 \n2,3"));
        Assert.assertEquals(String.valueOf(15), StringCalculator.add("4\n5\n6"));
        Assert.assertEquals(String.valueOf(77), StringCalculator.add("77\n"));
    }

    @Test
    public void kata4() {
        Assert.assertEquals(String.valueOf(1), StringCalculator.add("1, 1001"));
        Assert.assertEquals(String.valueOf(2), StringCalculator.add("1002 \n 2"));
        Assert.assertEquals(String.valueOf(1001), StringCalculator.add("1, 1000"));
        Assert.assertEquals(String.valueOf(2000), StringCalculator.add("1000, 1000"));
        Assert.assertEquals(String.valueOf(0), StringCalculator.add("1001, 1001"));
    }

    @Test
    public void kata5(){
        Assert.assertEquals(String.valueOf(3), StringCalculator.add("//;\n1; 2"));
        Assert.assertEquals(String.valueOf(5), StringCalculator.add("//* \n2,3"));
        Assert.assertEquals(String.valueOf(7), StringCalculator.add("//#\n3# 4"));
        Assert.assertEquals(String.valueOf("throw SpliterFormatException"), StringCalculator.add("//1\n1 1 1"));
        Assert.assertEquals(String.valueOf("throw SpliterFormatException"), StringCalculator.add("//;\n1#2"));
    }

    @Test
    public void kata6(){
        Assert.assertEquals(String.valueOf(6), StringCalculator.add("//[***]\n1 *** 2 *** 3"));
        Assert.assertEquals(String.valueOf(20), StringCalculator.add("//[xy]\n3xy4xy5xy8"));
    }

    @Test
    public void kata7(){
        Assert.assertEquals(String.valueOf(6), StringCalculator.add("// [*] [%] \n1*2%3"));
        Assert.assertEquals(String.valueOf(8), StringCalculator.add("// [&&] [|||] \n3|||2&&3"));
    }

    @Test
    public void kata8(){
        Assert.assertEquals(String.valueOf(14), StringCalculator.add("//[#$]\n1#$2 #$ 3", "// [&&] [|||] \n3 |||2 &&3"));
        Assert.assertEquals(String.valueOf(10), StringCalculator.add("1", "1,2", "1\n2,3"));
    }

    @Test
    public void kata9(){
        Assert.assertEquals(String.valueOf("throw NumberNegativException"), StringCalculator.add("1, – 1"));
        Assert.assertEquals(String.valueOf("throw NumberNegativException"), StringCalculator.add(" – 1, 1"));
        Assert.assertEquals(String.valueOf("throw NumberNegativException"), StringCalculator.add(" – 1, – 1"));
        Assert.assertEquals(String.valueOf("throw NumberNegativException"), StringCalculator.add(" – 1,1\n – 1"));
    }

    @Test
    public void kata10() {
        Assert.assertEquals(String.valueOf(6), StringCalculator.add("// [*] [%] \n1 * 2% 3"));
        Assert.assertEquals(String.valueOf(8), StringCalculator.add("// [&&] [|||]\n3 |||2 &&3"));
        Assert.assertEquals(String.valueOf(7), StringCalculator.add("// [//] \n 1//2//4"));
        Assert.assertEquals(String.valueOf(1998), StringCalculator.add("999,999"));
        Assert.assertEquals(String.valueOf(3), StringCalculator.add("3,1001"));
        Assert.assertEquals(String.valueOf(6), StringCalculator.add("// [*] [%][] \n1 * 2% 3"));
    }

    @Test
    public void kata11(){
        Assert.assertEquals(String.valueOf(6), StringCalculator.add("2^, 2"));
        Assert.assertEquals(String.valueOf(10), StringCalculator.add("3^\n1"));
        Assert.assertEquals(String.valueOf(8), StringCalculator.add("2^2, 2^2"));
    }

    @Test
    public void kata12(){
        Assert.assertEquals(String.valueOf(10), StringCalculator.add("2^3, 2"));
        Assert.assertEquals(String.valueOf(31), StringCalculator.add("3^3\n2^2"));
        Assert.assertEquals(String.valueOf(257), StringCalculator.add("//;\n1; 2^8"));
    }
}
