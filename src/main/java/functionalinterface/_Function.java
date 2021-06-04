package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {


        //Function
        System.out.println("********FUNCTION**********");
        int increment = increment(1);
        System.out.println(increment);

        System.out.println( incrementByOneFunction.apply(1));

        int increment2= incrementByOneFunction.apply(1);

        System.out.println( multiplyBy10.apply(increment2));

        Function<Integer, Integer> add1ThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10);

        System.out.println(add1ThenMultiplyBy10.apply(6));


        System.out.println("********biFUNCTION**********");
        System.out.println(incrementThenMultiply.apply(4,100));


    }

    static Function<Integer, Integer> incrementByOneFunction = number->number+1;

    static Function<Integer, Integer> multiplyBy10 = number->number*10;

    static int increment(int number){
        return number+1;
    }


    //Unlike a function, a biFunction takes two inputs and gives one output
    static BiFunction<Integer, Integer, Integer> incrementThenMultiply = (number, multiplyBy)-> (number +1) * multiplyBy;

    static int incrementByOneAndMultiply(int number, int multiplyBy){
        return (number +1)* multiplyBy;
    }

}
