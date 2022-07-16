package com.practice.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String[] args) {
        /*Car carObj = new Car();
        carObj.toyType = ToyType.CAR;

        Predicate<Car> carPredicate = (car) -> car.toyType.equals(ToyType.CAR);
        System.out.println(carPredicate.test(carObj));

        List<String> words = List.of(new String[]{"hello", "hola", "hallo", "ciao"});
        Stream<String> stringStream = Stream.of("hello", "hola", "hallo", "ciao");
        words.stream().forEach(System.out::println);*/
        Integer i = 457363;
        System.out.println(i.hashCode());

    }

    static class Car{
        ToyType toyType;
    }
}
enum ToyType{
    CAR,
}
