package com.ocpbook.chapter15;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1);
        System.out.println(d2);


        Supplier<StringBuilder> e1 = StringBuilder::new;
        Supplier<StringBuilder> e2 = () -> new StringBuilder();

        System.out.println(e1.get());
        System.out.println(e2.get());

        Supplier<ArrayList<String>> s3 = ArrayList<String>::new;
        ArrayList<String> a1 = s3.get();
        System.out.println(a1);


        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept("Annie");
        c2.accept("Annie");


        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

        b1.accept("chicken", 7);
        b2.accept("chick", 1);

        System.out.println(map);

        var map1 = new HashMap<String, String>();
        BiConsumer<String, String> b11 = map1::put;
        BiConsumer<String, String> b22 = (k, v) -> map1.put(k, v);

        b11.accept("chicken", "Cluck");
        b22.accept("chick", "Tweep");

        System.out.println(map1);
    }
}
