package com.example.test;

import com.example.com.example.transaction.Transaction;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by turlough on 01/01/16.
 */
public class TransactionTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testCreateCashTicketTransaction(){
        Transaction.CashTicketTransaction t = new Transaction.CashTicketTransaction(1,2,3);
        assertEquals("getType failed", "CashTicketTransaction", t.getType());
        assertEquals("getPassengerCount failed", 1, t.getPassengerCount());
    }

    @Test
    public void testUpdatePassengerCount(){
        Transaction.CashTicketTransaction t = new Transaction.CashTicketTransaction(1,2,3);
        t.setPassengerCount(2);
        assertEquals(2, t.getPassengerCount());
    }

    @Test
    public void testDefaultDeviceId() {
        Transaction.CashTicketTransaction t = new Transaction.CashTicketTransaction(1,2,3);
        assertEquals("PPTST01", t.getMetadata().getDeviceId());
    }


}