package functionalinterface;

import java.util.function.BiPredicate;

public class Predicate {

    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid("0744"));


        //Using Predicate
        System.out.println(isPhoneNumValid.test("0744"));

        System.out.println(isPhoneNumValid.and(containsNumber3).test("0744"));

        System.out.println("BiPredicate");
        System.out.println(testBiPredicate.test("Tinashe", 31));




    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 4;
    }

    //Predicate takes one argument and return true or false
    static java.util.function.Predicate<String> isPhoneNumValid = number->
            number.startsWith("07") && number.length() == 4;

    static java.util.function.Predicate<String> containsNumber3 = number ->number.contains("3");

    //BiPredicate takes two arguments and return true or false
    static BiPredicate<String, Integer> testBiPredicate=(name, age)->
            name.equals("Tinashe") && age > 30;

}
