package ru.netology.javaqa.javaqamvn.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFindMaxWithNegativeNumbers() {
        StatisticsService statisticsService = new StatisticsService();
        long[] incomes = {-10, -5, -8, -12, -7};
        long maxIncome = statisticsService.findMax(incomes);
        assertEquals(-5, maxIncome);
    }

    @Test
    public void testFindMaxWithMixedNumbers() {
        StatisticsService statisticsService = new StatisticsService();
        long[] incomes = {-10, 5, 8, -12, 7};
        long maxIncome = statisticsService.findMax(incomes);
        assertEquals(8, maxIncome);
    }

    @Test
    public void testFindMaxWithSingleElementArray() {
        StatisticsService statisticsService = new StatisticsService();
        long[] incomes = {15};
        long maxIncome = statisticsService.findMax(incomes);
        assertEquals(15, maxIncome);
    }

    @Test
    public void testFindMaxWithEmptyArray() {
        StatisticsService statisticsService = new StatisticsService();
        long[] incomes = {};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> statisticsService.findMax(incomes));
    }


}
