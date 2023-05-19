package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class vocationsServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/variant1.csv")
    void variant1_freelancer_hobo(int income, int expenses, int threshold, int expected) {
        //тестируется вариант 1 "Фрислансер с з/п 10к"
        vocationService service = new vocationService();
        //int income = 10_000; int expenses = 3000; int threshold = 20_000; int expected = 3;
        int countVocationMonths = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, countVocationMonths);
        System.out.println("Месцев в году на отдых: " +countVocationMonths+ ". При з/п " +income+ " и тратах " +expenses+ " в месяц." ); //вывод на экран
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/variant2.csv")
    void variant2_freelancer_no_hobo(int income, int expenses, int threshold, int expected) {
        //тестируется вариант 2 "Фрилансер с з/п 100к"
        vocationService service = new vocationService();
        int countVocationMonths = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, countVocationMonths);
        System.out.println("Месцев в году на отдых: " +countVocationMonths+ ". При з/п " +income+ " и тратах " +expenses+ " в месяц." ); //вывод на экран
    }

}
