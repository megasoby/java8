package me.megasoby.java8;

import java.util.function.Function;

public class plus10 implements Function<Integer, Integer>
{
    @Override
    public Integer apply(Integer integer) {
        return integer + 10;
    }
}
