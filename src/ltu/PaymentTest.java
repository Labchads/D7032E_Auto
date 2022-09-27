package ltu;

import org.junit4.Assert.*;
import static ltu.CalendarFactory.getCalendar;

import org.junit4.Test;

public class PaymentTest
{
    @Test
    public static void testSilly()
    {
        assertTrue(1==1);
    }
    @Test
    public static void testAge(){
        PaymentImpl payment = new PaymentImpl(getCalendar());
        int loan = payment.getMonthlyAmount("2010", 10000, 50, 50);
        assertTrue(loan==0);
    }
    public static void main(String[] args){
        testSilly();
        testAge();
    }
    
}
