package ru.netology.stats;

import java.util.Arrays;

public class StatsService {

    public int amountSales(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return (int) sum;
    }

    public int averageSales(long[] sales) {
        long sum = amountSales(sales);
        long average = sum / sales.length;

        return (int) average;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int qtyMonthBelowAverage(long[] sales) {

        long monthBelowAverage = 0;
        long average = averageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                monthBelowAverage++;
            }
        }
        return (int) monthBelowAverage;
    }

    public int qtyMonthAboveAverage(long[] sales) {

        long monthAboveAverage = 0;
        long average = averageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                monthAboveAverage++;
            }
        }
        return (int) monthAboveAverage;
    }
}
