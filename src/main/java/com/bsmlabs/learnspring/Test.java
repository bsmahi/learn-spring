package com.bsmlabs.learnspring;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        String str = "HEllo WORLd";
        AtomicInteger strlen = new AtomicInteger();
        System.out.println(str);

        IntStream.range(0, str.length()).forEach(i -> IntStream.range(65, 90).forEach(j -> {
            if (j == (str.charAt(i))) {
                strlen.set(strlen.get() + 1);
            }
        }));

        System.out.println("Number of Upper Case character " + strlen);
        IntStream.rangeClosed(65, 90).forEach(i -> System.out.print((char) i));

        System.out.println();
        List<Integer> num = determineMultiples(3, 20);
        num.forEach(System.out::println);
        System.out.println();

        var integers = List.of(1, 2, 3);
        System.out.println("List<? extends Number> numbers");
        printNumbers(integers);

        var objects = new ArrayList<>();
        addNumber(objects); // This is valid
        System.out.println("List<? super Number> numbers\n" + objects);

    }

    static List<Integer> determineMultiples(int number, int limit) {
        List<Integer> multiples = new ArrayList<>();

        if (number <= 0 || limit <= 0) {
            return multiples;
        }

        int i = 1;
        while (number * i < limit) {
            multiples.add(number * i);
            i++;
        }

        return multiples;
    }

    static void printNumbers(List<? extends Number> numbers) {
        for (Number num : numbers) {
            System.out.println(num);
        }
    }

    static void addNumber(List<? super Number> numbers) {
        numbers.add(10);
        numbers.add(3.14);
    }


}
