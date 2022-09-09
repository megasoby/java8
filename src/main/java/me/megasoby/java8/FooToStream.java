package me.megasoby.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FooToStream {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("SSong");
        names.add("Powerbhs");
        names.add("Olivia");
        names.add("Losemarry");

        // Stream<String> stringStream = names.stream().map(String::toUpperCase);
        // Stream() API는 원본 Data 자체를 변경하지 않는다
        List<String> collect = names.stream().map((s) -> {
             System.out.println(s);
            return s.toUpperCase();
        }).collect(Collectors.toList());
        System.out.println("======================");
        names.forEach(System.out::println);

        System.out.println("<======================>");

        /* 병렬처리가 다 좋은건 아님, 오히려 느려질 수도 있음 - 비용 - 대부분의 경우 Stream()을 사용하게 될꺼임 */
        names.parallelStream().map((s) -> {
            System.out.println(s + " " + Thread.currentThread().getName());
            return s.toUpperCase();
        }).collect(Collectors.toList());
        System.out.println("======================");
        names.forEach(System.out::println);
    }
}
