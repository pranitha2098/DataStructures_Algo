package JavaAdvanced.Generics;

public class DealingWidNumbers {


    <E extends Number,F extends Number> Double add(E num1, F num2){


        return num1.doubleValue()+num2.doubleValue() ;
    }


}
