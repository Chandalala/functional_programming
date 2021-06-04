package functionalinterface;



import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        //Normal java function
        greetCustomer(new Customer("Tinashe", "0774 053 640"));

        //Consumer Functional interface
        greetCustomerConsumer.accept(new Customer("Chanda", "12345"));


        //BiConsumer Functional interface
        greetCustomerConsumer2.accept(new Customer("Chanda", "12345"), false);


    }

    //A consumer represents an operation that accepts a single input argument and returns no result

    static Consumer<Customer> greetCustomerConsumer = customer->System.out.println(customer.customerName+" "+customer.customerPhoneNumber);

    //A bi-consumer represents an operation that accepts a two input arguments and returns no result
    static BiConsumer<Customer, Boolean> greetCustomerConsumer2 = (customer, hasPhoneNumber)->
            System.out.println(customer.customerName+" "+(hasPhoneNumber ? customer.customerPhoneNumber : "*****"));



    static void greetCustomer(Customer customer){
        System.out.println(customer.customerName+" "+customer.customerPhoneNumber);
    }


    static class Customer{
        public final String customerName;
        public final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber){
            this.customerName=customerName;
            this.customerPhoneNumber=customerPhoneNumber;
        }
    }
}
