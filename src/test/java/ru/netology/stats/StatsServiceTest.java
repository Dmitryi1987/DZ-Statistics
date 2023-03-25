package ru.netology.stats;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {


    @Test
    public void findSumSales() {
        StatsService service = new StatsService();
        long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedfindSumSales = 180;
        int actualfindSumSales = service.findSumSales(sales);

        Assertions.assertEquals(expectedfindSumSales, actualfindSumSales);
    }


    @Test
    public void findAverageSales() {
        StatsService service = new StatsService();
        long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedfindAverageSales = 15;
        int actualfindAverageSales = service.findAverageSales(sales);

        Assertions.assertEquals(expectedfindAverageSales, actualfindAverageSales);
    }


    @Test
    public void findMaxSales() {
        StatsService service = new StatsService();
        long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedfindMaxSales = 8;
        int actualfindMaxSales = service.findMaxSales(sales);

        Assertions.assertEquals(expectedfindMaxSales, actualfindMaxSales);
    }

    @Test
    public void findMinSales() {
        StatsService service = new StatsService();
        long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedfindMinSales = 9;
        int actualfindMinSales = service.findMinSales(sales);

        Assertions.assertEquals(expectedfindMinSales, actualfindMinSales);
    }


    @Test
    public void findSalesBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedfindSalesBelowAverage = 5;
        int actualfindSalesBelowAverage = service.findSalesBelowAverage(sales);

        Assertions.assertEquals(expectedfindSalesBelowAverage, actualfindSalesBelowAverage);
    }


    @Test
    public void findSalesHigherAverage() {
        StatsService service = new StatsService();
        long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedfindSalesHigherAverage = 5;
        int actualfindSalesHigherAverage = service.findSalesHigherAverage(sales);

        Assertions.assertEquals(expectedfindSalesHigherAverage, actualfindSalesHigherAverage);
    }

}
