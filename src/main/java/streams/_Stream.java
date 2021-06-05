package streams;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Tinashe", Person.Gender.MALE),
                new Person("Josy", Person.Gender.FEMALE),
                new Person("Chanda", Person.Gender.MALE),
                new Person("Lucia", Person.Gender.FEMALE),
                new Person("Joseph", Person.Gender.MALE)
                );

       people.stream()
                .map(Person::getName)
                .filter(p->p.contains("a"))
                .forEach(System.out::println);

       //Above is similar to below
        System.out.println("*********************************************************");

        Function<Person, String> personStringFunction = Person::getName;
        Predicate<String> stringPredicate = name -> name.contains("a");
        Consumer<String> stringConsumer = System.out::println;

        people.stream()
                .map(personStringFunction)
                .filter(stringPredicate)
                .forEach(stringConsumer);




    }
}
