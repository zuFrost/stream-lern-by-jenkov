package com.zufrost.learn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamLearnMain {
    public static void main(String[] args) {
        List<String> items = new ArrayList<String>();

        items.add("one");
        items.add("two");
        items.add("three");

        Stream<String> stream = items.stream();
//        System.out.println(stream);
        long count = stream
                .map((value) -> {return value.toLowerCase(); })
                .count();
        System.out.println("count = " + count);
    }
}
