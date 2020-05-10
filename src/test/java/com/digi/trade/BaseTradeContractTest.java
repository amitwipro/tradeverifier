package com.digi.trade;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BaseTradeContractTest {

    @BeforeAll
    public static void setUp(){

        final TradeService tradeService = mock(TradeService.class);
        when(tradeService.checkTradeVolume(2345)).thenReturn(new TradeVerifyResponse(TradeVerifyResponse.TradeVolumeType.HIGH));
        RestAssuredMockMvc.standaloneSetup(new TradeVerifierController(tradeService));
    }
}
