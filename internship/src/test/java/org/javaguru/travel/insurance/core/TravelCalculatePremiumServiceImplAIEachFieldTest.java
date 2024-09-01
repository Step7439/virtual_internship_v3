package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TravelCalculatePremiumServiceImplAIEachFieldTest {
    TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
    TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();

    final String PERSON_FIRST_NAME = "John";
    final String PERSON_LAST_NAME = "Doe";
    private final Date AGREEMENT_DATE_FROM = new Date(2023 - 1900, 0, 1);  // Java's Date class is 0-based for months
    private final Date AGREEMENT_DATE_TO = new Date(2023 - 1900, 11, 31);


    @Test
    public void FirsteNameTest() {
        request.setPersonFirstName(PERSON_FIRST_NAME);

        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        assertEquals(PERSON_FIRST_NAME,response.getPersonFirstName());
    }
    @Test
    public void LastNameTest() {

        request.setPersonLastName(PERSON_LAST_NAME);

        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        assertEquals(PERSON_LAST_NAME, response.getPersonLastName());
    }
    @Test
    public void DateFromTest() {

        request.setAgreementDateFrom(AGREEMENT_DATE_FROM);

        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        assertEquals(AGREEMENT_DATE_FROM, response.getAgreementDateFrom());
    }
    @Test
    public void DateToTest() {

        request.setAgreementDateTo(AGREEMENT_DATE_TO);

        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        assertEquals(AGREEMENT_DATE_TO, response.getAgreementDateTo());
    }
}
