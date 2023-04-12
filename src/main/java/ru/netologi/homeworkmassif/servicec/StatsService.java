package ru.netologi.homeworkmassif.servicec;

public class StatsService {
    public long allSales(long[] sales) {
        long totalsum = 0;
        for (long sale : sales) {
            totalsum += sale;
        }
        return totalsum;
    }

    public long averageAmount(long[] sales) {
        return allSales(sales) / sales.length;
    }


    public int maxSales(int[] sales) {
        int maxMount = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMount]) {
                maxMount = i;
            }
        }
        return maxMount + 1;
    }

    public int minSAles(int[] sales) {
        int minMount = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMount]) {
                minMount = i;
            }
        }
        return minMount + 1;
    }

    public int belowAverageSales(long[] sales) {
        int belowAverageMounts = 0;
        for (long sale : sales) {
            if (sale < averageAmount(sales)) {
                belowAverageMounts++;
            }

        }
        return belowAverageMounts;

    }

    public int aboveAverage(long[] sales) {
        int mountsAboveAverage = 0;
        for (long sale : sales) {
            if (sale > averageAmount(sales)) {
                mountsAboveAverage++;
            }

        }
        return mountsAboveAverage;
    }

}


