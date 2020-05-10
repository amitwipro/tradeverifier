package contracts.tradeSettlementService

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'POST'
        url '/trade-verify'
        body """
        {
            "tradeRefNumber" : 2345
        }
        """
        headers {
            contentType applicationJson()
        }
    }
    response {
        status 200
        body """
        {
            "tradeVolumeType" : "HIGH" 
        }
        """
        headers {
            contentType applicationJson()
        }
    }
}