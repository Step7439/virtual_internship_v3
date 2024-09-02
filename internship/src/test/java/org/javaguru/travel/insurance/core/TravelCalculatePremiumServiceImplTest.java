package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TravelCalculatePremiumServiceImplTest {

    TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();
    @Test
    public void FirsteNameTest() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.setPersonFirstName("Vovka");
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals(response.getPersonFirstName(), request.getPersonFirstName());
    }
    @Test
    public void LastNameTest() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.setPersonLastName("Pupkin");
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals(response.getPersonLastName(), request.getPersonLastName());
    }
    @Test
    public void DateFromTest() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.setAgreementDateFrom(new Date());
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals(response.getAgreementDateFrom(), request.getAgreementDateFrom());
    }
    @Test
    public void DateToTest() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.setAgreementDateTo(new Date());
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals(response.getAgreementDateTo(), request.getAgreementDateTo());
    }
    @Test
    public void TestBigDecimal() {
        TravelCalculatePremiumResponse response = new TravelCalculatePremiumResponse();
        BigDecimal bigDecimal = new BigDecimal("1500.75");
        response.setBigDecimal(bigDecimal);
        BigDecimal actualDecimal = response.getBigDecimal();
        assertEquals(bigDecimal, actualDecimal);

        response.setBigDecimal(null);
        assertEquals(null, response.getBigDecimal());
    }
}