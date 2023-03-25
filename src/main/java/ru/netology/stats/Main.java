package ru.netology.stats;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        System.out.println(service);
    }
}


