package me.megasoby.java8;

import java.util.Arrays;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {

        Function<String, Greeting> ssong
                = Greeting::new;

        Greeting song = ssong.apply("SSong");
        System.out.println("song.getName() = " + song.getName());

        System.out.println("song = " + song.hello("powerbhs"));

        String[] names = {"powerbhs", "measoby", "ssong"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
