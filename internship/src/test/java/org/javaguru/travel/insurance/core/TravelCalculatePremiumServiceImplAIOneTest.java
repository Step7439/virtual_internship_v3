package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TravelCalculatePremiumServiceImplAIOneTest {
    private TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();
    private TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();

    final String PERSON_FIRST_NAME = "John";
    final String PERSON_LAST_NAME = "Doe";
    private final Date AGREEMENT_DATE_FROM = new Date(2023 - 1900, 0, 1);  // Java's Date class is 0-based for months
    private final Date AGREEMENT_DATE_TO = new Date(2023 - 1900, 11, 31);


    @Test
    public void TestOne() {

        request.setPersonFirstName(PERSON_FIRST_NAME);
        request.setPersonLastName(PERSON_LAST_NAME);
        request.setAgreementDateFrom(AGREEMENT_DATE_FROM);
        request.setAgreementDateTo(AGREEMENT_DATE_TO);


        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        assertEquals(PERSON_FIRST_NAME, response.getPersonFirstName());
        assertEquals(PERSON_LAST_NAME, response.getPersonLastName());
        assertEquals(AGREEMENT_DATE_FROM, response.getAgreementDateFrom());
        assertEquals(AGREEMENT_DATE_TO, response.getAgreementDateTo());
    }
}
