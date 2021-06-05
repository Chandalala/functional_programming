package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    private boolean isEmailValid(String email){
        return email.contains("@");
    }

    private boolean isNameValid(String name){
        return name.length() > 4;
    }

    private boolean isPhoneValid(String number){
        return number.length() == 5;
    }

    private boolean isAdult(LocalDate dob){
        return Period.between(dob,LocalDate.now()).getYears() > 18;
    }

    public boolean isValid(Customer customer){
        return isAdult(customer.getDob()) && isEmailValid(customer.getEmail())
                && isNameValid(customer.getName()) && isPhoneValid(customer.getPhoneNumber());
    }
}
