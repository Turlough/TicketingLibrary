package com.example.com.example.transaction;

import lombok.Data;

/**
 * Created by turlough on 01/01/16.
 */
public @Data
class TransactionMetadata {
    private String deviceId;
    private int journeyId;


    public TransactionMetadata() {
        //TODO from sources
        deviceId="PPTST01";
        journeyId=0;
    }
}
