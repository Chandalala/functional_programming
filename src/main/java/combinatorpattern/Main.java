package combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(
                "Tinashe",
                "tinashe@gmail.com",
                "0774053640",
                LocalDate.of(1992,4,18)

        );


        //new CustomerValidatorService().isValid(customer);

        //Using combinator pattern
        var result = CustomerValidatorServiceInterface
                .isAdult()
                .and(CustomerValidatorServiceInterface.isEmail())
                .and(CustomerValidatorServiceInterface.isPhone())
                .apply(customer);



        if (result != ValidatorResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
        else {
            System.out.println(result);

        }



    }
}
