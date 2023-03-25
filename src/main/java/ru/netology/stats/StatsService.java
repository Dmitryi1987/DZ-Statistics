package ru.netology.stats;

import org.jetbrains.annotations.NotNull;

public class StatsService {


    public int findSumSales(long @NotNull [] sales) {
        int sum = 0; // начальное значение суммы

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];

        }
        return sum;
    }


    public int findAverageSales(long @NotNull [] sales) {
        int sum = findSumSales(sales);
        int average = 0;
        if (sales.length > 0) {
            for (int i = 0; i < sales.length; i++) {
                average = sum / sales.length;
            }
        }
        return average;
    }


    public int findMaxSales(long @NotNull [] sales) {


        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {

            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int findMinSales(long @NotNull [] sales) {

        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {

            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int findSalesBelowAverage(long @NotNull [] sales) {

        int average = findAverageSales(sales);
        int below = 0;
        for (int i = 0; i < sales.length; i++) {
            if (average > sales[i])
                below++;
        }
        return below;
    }


    public int findSalesHigherAverage(long @NotNull [] sales) {

        int average = findAverageSales(sales);
        int higher = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average)
                higher++;
        }
        return higher;
    }
}

