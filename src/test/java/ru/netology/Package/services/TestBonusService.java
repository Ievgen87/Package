package ru.netology.Package.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class TestBonusService {

    @ParameterizedTest
//    @CsvSource({
//            "10000,3000,20000",
//            "100000,60000,150000"
//    })
    @CsvFileSource(files = "src/test/resources/csv.bonus")
    public void oneTest(int expected, int income, int expenses, int threshold) {
        BonusService service = new BonusService();

       // int expected  = 3;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);


    }

//    @Test
//    public void twoTest() {
//        BonusService service = new BonusService();
//
//        int expected = 2;
//        int actual = service.calculate(100_000, 60_000, 150_000);
//
//        Assertions.assertEquals(expected, actual);
//
//
//    }


}
