package ru.netologi.homeworkmassif.servicec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void AllAmountSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualSum = service.allSales(sales);
        long expectedSum = 180;


        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void AverageAmountSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageAmount = 15;
        long actualAverageAmount = service.averageAmount(sales);
        Assertions.assertEquals(expectedAverageAmount, actualAverageAmount);
    }

    @Test
    public void MaxMountSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMount = 8;
        int actualMaxMount = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxMount, actualMaxMount);
    }

    @Test
    public void MinMountSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMount = 9;
        int actualMinMount = service.minSAles(sales);
        Assertions.assertEquals(expectedMinMount, actualMinMount);
    }

    @Test
    public void SalesBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedBelowAverageMounts = 5;
        long actualBelowAverageMounts = service.belowAverageSales(sales);
        Assertions.assertEquals(expectedBelowAverageMounts, actualBelowAverageMounts);

    }

    @Test
    public void SalesAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAboveAverageMounts = 5;
        long actualAboveAverageMounts = service.aboveAverage(sales);
        Assertions.assertEquals(expectedAboveAverageMounts, actualAboveAverageMounts);
    }
}
