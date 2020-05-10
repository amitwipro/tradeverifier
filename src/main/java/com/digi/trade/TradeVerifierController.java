package com.digi.trade;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TradeVerifierController  {

    private final TradeService tradeService;
    @PostMapping("trade-verify")
    public TradeVerifyResponse doTradeVolumeCheck(@RequestBody TradeVolumeCheckRequest tradeVolumeCheckRequest){

         return tradeService.checkTradeVolume(tradeVolumeCheckRequest.getTradeRefNumber());
    }
}
