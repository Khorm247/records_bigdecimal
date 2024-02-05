package challenges1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        RealEstate rE = new RealEstate("non", 24, 2, 50000);
        System.out.println(rE);
        System.out.println(rE.withPrice(75000));
        System.out.println(rE);

        double value1 = 0.3;
        double value2 = 0.1;

        double result = value1 - value2;
        result = value1 * value2;

        BigDecimal num = new BigDecimal("7.3462");
        BigDecimal rounded = num.setScale(2, RoundingMode.CEILING);
        BigDecimal rounded2 = num.setScale(2, RoundingMode.UP);
        System.out.println(rounded);
        System.out.println(rounded2);


        System.out.println("Result using double: " + result);

        //Result using double: 0.19999999999999998
        //Result using BigDecimal: 0.2
    }

}


