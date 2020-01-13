package com.itea.java.basic.l19;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sandbox {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        String s = Stream.of(arr).map(Objects::toString).collect(Collectors.joining());
        System.out.println(s);
    }
}
