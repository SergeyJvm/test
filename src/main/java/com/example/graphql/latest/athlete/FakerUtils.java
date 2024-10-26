package com.example.graphql.latest.athlete;

import java.util.Random;

public class FakerUtils {

    public static int anInt(int a, int b) {
        Random rand = new Random();
        return rand.nextInt(a,b);
    }

    public static boolean aBoolean() {
        return Math.random() > 0.5;
    }

}
