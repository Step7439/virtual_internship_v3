package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateTimeService {

    public long calcultTime(Date dataOne, Date dateTwo) {

        long diff = dateTwo.getTime() - dataOne.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
}
