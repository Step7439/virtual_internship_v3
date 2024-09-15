package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTimeServiceTest {
    DateTimeService dateTimeService = new DateTimeService();

    @Test
    public void calcultTimeTestZero() {
        Date date1 = createDate("15.09.2024");
        Date date2 = createDate("15.09.2024");

        var days = dateTimeService.calcultTime(date1, date2);
        assertEquals(days, 0L);
    }
    @Test
    public void calcultTimeTestPlus() {
        Date date1 = createDate("01.09.2024");
        Date date2 = createDate("15.09.2024");

        var days = dateTimeService.calcultTime(date1, date2);
        assertEquals(days, 14L);
    }
    @Test
    public void calcultTimeTestMinus() {
        Date date1 = createDate("15.09.2024");
        Date date2 = createDate("01.09.2024");

        var days = dateTimeService.calcultTime(date1, date2);
        assertEquals(days, -14L);
    }
    private Date createDate(String dateStr) {
        try {
            return new SimpleDateFormat("dd.MM.yyyy").parse(dateStr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
