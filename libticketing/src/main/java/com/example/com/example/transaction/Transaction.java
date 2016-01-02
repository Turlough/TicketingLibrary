package com.example.com.example.transaction;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by turlough on 01/01/16.
 */
@Data public
class Transaction {


    @Data
    @EqualsAndHashCode(callSuper=false)
    public static class CashTicketTransaction extends TicketTransaction{
        String uid;
        int cashTicketPassengerCount = 1;
        int cashValue = value;

        public CashTicketTransaction(int fromId, int toId, int value) {
            super(fromId, toId, value);
        }
    }

    @Data
    @EqualsAndHashCode(callSuper=false)
    public static class CashTicketReversal extends CashTicketTransaction{

        public CashTicketReversal(CashTicketTransaction t) {
            super(t.getFromId(), t.getToId(), -t.getValue());
            passengerCount = -t.getPassengerCount();
            cashTicketPassengerCount = -t.getCashTicketPassengerCount();
            cashValue = -t.getCashValue();
        }
    }
}
