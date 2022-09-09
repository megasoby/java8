package me.megasoby.java8;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Foo {

    public static void main(String[] args) {

        // 일반 방식
        RunSomething runSomething = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("hello!");
            }
        };
        runSomething.doIt();

        //lambda 방식1
        RunSomething runSomething1 = () -> {
            System.out.println("'hello2");
        };
        runSomething1.doIt();

        //lambda 방식2
        RunSomething runSomething2 = () -> System.out.println("'hello2");
        runSomething2.doIt();

        Function<Integer, Integer> ps10 = (i) -> i + 10;
        Function<Integer, Integer> ps20 = (i) -> i * 2;

        System.out.println(" = " + ps10.apply(1));
        System.out.println(" = " + ps20.apply(1));

        ps10.compose(ps20);

        UnaryOperator<String> a = (b) -> b + "ssong";
    }


}
