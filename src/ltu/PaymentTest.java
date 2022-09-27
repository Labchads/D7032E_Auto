package ltu;

import static org.junit.Assert.*;

import java.io.IOException;

import static ltu.CalendarFactory.getCalendar;
import ltu.PaymentImpl;

import org.junit.Test;

public class PaymentTest
{
    @Test
    public void testSilly()
    {
        assertEquals(1, 1);
    }

    @Test
    public void testAge() throws IOException{
        PaymentImpl payment = new PaymentImpl(getCalendar());
        int loan = payment.getMonthlyAmount("20100327", 10000, 50, 50);
        assertTrue(loan==0);
    }
    /*public static void main(String[] args){
        testSilly();
        testAge();
    } */
    
}
