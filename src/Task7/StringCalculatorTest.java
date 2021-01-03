package Task7;

public class StringCalculatorTest {
    static void kata1() {
        String result;
        result = StringCalculator.add(null);
        if (result.equals(String.valueOf(0))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("");
        if (result.equals(String.valueOf(0))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("1");
        if (result.equals(String.valueOf(1))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("1,2");
        if (result.equals(String.valueOf(3))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("4,");
        if (result.equals(String.valueOf(4))) System.out.println("Ok");
        else System.out.println("Ne ok");
    }

    static void kata2(){
        String result;
        result = StringCalculator.add("1,2,3");
        if (result.equals(String.valueOf(6))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("1,1,1,1");
        if (result.equals(String.valueOf(4))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add(" 1,2 ");
        if (result.equals(String.valueOf(3))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("11,22,33");
        if (result.equals(String.valueOf(66))) System.out.println("Ok");
        else System.out.println("Ne ok");
    }

    static void kata3(){
        String result;
        result = StringCalculator.add("1 \n2,3");
        if (result.equals(String.valueOf(6))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("4\n5\n6");
        if (result.equals(String.valueOf(15))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("77\n");
        if (result.equals(String.valueOf(77))) System.out.println("Ok");
        else System.out.println("Ne ok");
    }

    static void kata4(){
        String result;
        result = StringCalculator.add("1, 1001");
        if (result.equals(String.valueOf(1))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("1002 \n 2");
        if (result.equals(String.valueOf(2))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("1, 1000");
        if (result.equals(String.valueOf(1001))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("1000, 1000");
        if (result.equals(String.valueOf(2000))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("1001, 1001");
        if (result.equals(String.valueOf(0))) System.out.println("Ok");
        else System.out.println("Ne ok");
    }

    static void kata5(){
        String result;
        result = StringCalculator.add("//;\n1; 2");
        if (result.equals(String.valueOf(3))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("//* \n2,3");
        if (result.equals(String.valueOf(5))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("//#\n3# 4");
        if (result.equals(String.valueOf(7))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("//1\n1 1 1");
        if (result.equals("throw SpliterFormatException")) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("//;\n1#2");
        if (result.equals("throw SpliterFormatException")) System.out.println("Ok");
        else System.out.println("Ne ok");
    }

    static void kata6(){
        String result;
        result = StringCalculator.add("//[***]\n1 *** 2 *** 3");
        if (result.equals(String.valueOf(6))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("//[xy]\n3xy4xy5xy8");
        if (result.equals(String.valueOf(20))) System.out.println("Ok");
        else System.out.println("Ne ok");
    }

    static void kata7(){
        String result;
        result = StringCalculator.add("// [*] [%] \n1*2%3");
        if (result.equals(String.valueOf(6))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("// [&&] [|||] \n3|||2&&3");
        if (result.equals(String.valueOf(8))) System.out.println("Ok");
        else System.out.println("Ne ok");
    }

    static void kata8(){
        String result;
        result = StringCalculator.add("//[#$]\n1#$2 #$ 3", "// [&&] [|||] \n3 |||2 &&3");
        if (result.equals(String.valueOf(14))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("1", "1,2", "1\n2,3");
        if (result.equals(String.valueOf(10))) System.out.println("Ok");
        else System.out.println("Ne ok");
    }

    static void kata9(){
        String result;
        result = StringCalculator.add("1, – 1");
        if (result.equals(String.valueOf("throw NumberNegativException"))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add(" – 1, 1");
        if (result.equals(String.valueOf("throw NumberNegativException"))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add(" – 1, – 1");
        if (result.equals("throw NumberNegativException")) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add(" – 1,1\n – 1");
        if (result.equals("throw NumberNegativException")) System.out.println("Ok");
        else System.out.println("Ne ok");
    }

    static void kata10(){
        String result;
        result = StringCalculator.add("// [*] [%] \n1 * 2% 3");
        if (result.equals(String.valueOf(6))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("// [&&] [|||]\n3 |||2 &&3");
        if (result.equals(String.valueOf(8))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("// [//] \n 1//2//4");
        if (result.equals(String.valueOf(7))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("999,999");
        if (result.equals(String.valueOf(1998))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("3,1001");
        if (result.equals(String.valueOf(3))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("// [*] [%][] \n1 * 2% 3");
        if (result.equals(String.valueOf(6))) System.out.println("Ok");
        else System.out.println("Ne ok");
    }

    static void kata11() {
        String result;
        result = StringCalculator.add("2^, 2");
        if (result.equals(String.valueOf(6))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("3^\n1");
        if (result.equals(String.valueOf(10))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("2^2, 2^2");
        if (result.equals(String.valueOf(8))) System.out.println("Ok");
        else System.out.println("Ne ok");
    }

    static void kata12() {
        String result;
        result = StringCalculator.add("2^3, 2");
        if (result.equals(String.valueOf(10))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("3^3\n2^2");
        if (result.equals(String.valueOf(31))) System.out.println("Ok");
        else System.out.println("Ne ok");

        result = StringCalculator.add("//;\n1; 2^8");
        if (result.equals(String.valueOf(257))) System.out.println("Ok");
        else System.out.println("Ne ok");
    }
}
