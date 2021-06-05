package optionals;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {

        Object value = Optional.ofNullable(null).orElse("Default value");

        System.out.println(value);

    }
}
