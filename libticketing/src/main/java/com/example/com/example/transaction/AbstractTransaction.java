package com.example.com.example.transaction;

import lombok.*;

public abstract @Data
class AbstractTransaction {
    protected TransactionMetadata metadata;
    protected String type;
    protected int version = 1;
    protected int transactionId=0;

    public AbstractTransaction() {
        type = this.getClass().getSimpleName();
        metadata = new TransactionMetadata();
    }
}
