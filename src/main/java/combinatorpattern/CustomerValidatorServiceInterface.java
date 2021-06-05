package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface CustomerValidatorServiceInterface extends Function<Customer, ValidatorResult> {

    static CustomerValidatorServiceInterface isEmail(){
        return customer ->
                customer.getEmail().contains("@") ?
                        ValidatorResult.SUCCESS : ValidatorResult.INVALID_EMAIL;
    }

    static CustomerValidatorServiceInterface isPhone(){
        return customer ->
                customer.getPhoneNumber().length() > 5 ?
                        ValidatorResult.SUCCESS : ValidatorResult.INVALID_PHONE;
    }

    static CustomerValidatorServiceInterface isAdult(){
        return customer ->
                Period.between(customer.getDob(), LocalDate.now()).getYears() > 18 ?
                        ValidatorResult.SUCCESS : ValidatorResult.NOT_ADULT;
    }

    default CustomerValidatorServiceInterface and (CustomerValidatorServiceInterface other){

        return customer -> {
            ValidatorResult result = this.apply(customer);
            return result.equals(ValidatorResult.SUCCESS) ? other.apply(customer) : result;
        };
    }
}
