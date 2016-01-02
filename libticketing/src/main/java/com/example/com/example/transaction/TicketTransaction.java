package com.example.com.example.transaction;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by turlough on 01/01/16.
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class TicketTransaction extends AbstractTransaction {

    protected int fromId;
    protected int toId;
    protected int passengerCount  = 1;
    protected int value = 0;
    protected boolean issued = true;

    public TicketTransaction() {
        super();
    }

    public TicketTransaction(int fromId, int toId, int value){
        super();
        this.fromId = fromId;
        this.toId = toId;
        this.value = value;
    }

}
