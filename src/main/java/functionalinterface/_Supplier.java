package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        System.out.println(getMyName.get());
        System.out.println(getMyName2.get());
    }

    //A supplier returns results
    static String getName(){
        return "Tinashe";
    }

    static Supplier<String> getMyName=_Supplier::getName;
    static Supplier<String> getMyName2=()->"Chanda";

}
