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
        int loan = payment.getMonthlyAmount("2003032756735", 0, 100, 100);
        assertEquals(0, loan);
    }
    
    @Test
    public void testAge2() throws IOException{
    	PaymentImpl payment = new PaymentImpl(getCalendar());
        int loan = payment.getMonthlyAmount("1965032756735", 0, 100, 100);
        assertEquals(0, loan);
    }
    
    @Test
    public void testAge3() throws IOException{
    	PaymentImpl payment = new PaymentImpl(getCalendar());
        int loan = payment.getMonthlyAmount("1975032756735", 0, 100, 100);
        assertEquals(2816, loan);
    }
    
    @Test
    public void testHalfTime() throws IOException{
    	PaymentImpl payment = new PaymentImpl(getCalendar());
        int loan = payment.getMonthlyAmount("2000032756735", 0, 49, 100);
        int loan2 = payment.getMonthlyAmount("2000032756735", 0, 51, 100);
        assertTrue(loan != loan2);
    }
    
    @Test
    public void testNotFullTime() throws IOException{
    	PaymentImpl payment = new PaymentImpl(getCalendar());
//        int loan = payment.getMonthlyAmount("2000032756735", 0, 100, 100);
        int loan2 = payment.getMonthlyAmount("2000032756735", 0, 99, 100);
        assertEquals(loan2, 1396+3564);
    }
    
    @Test
    public void testFullTime() throws IOException{
    	PaymentImpl payment = new PaymentImpl(getCalendar());
        int loan = payment.getMonthlyAmount("2000032756735", 0, 100, 100);
        assertTrue(loan == 7088 + 2816);
    }
    
    @Test
    public void test501() throws IOException{
    	PaymentImpl payment = new PaymentImpl(getCalendar());
        int loan = payment.getMonthlyAmount("2000032756735", 0, 100, 100);
        assertTrue(loan == 7088 + 2816);
    }
    
    @Test
    public void test502() throws IOException{
    	PaymentImpl payment = new PaymentImpl(getCalendar());
        int loan = payment.getMonthlyAmount("2000032756735", 0, 100, 100);
        assertTrue(loan == 7088 + 2816);
    }
    
    @Test
    public void test503() throws IOException{
    	PaymentImpl payment = new PaymentImpl(getCalendar());
        int loan = payment.getMonthlyAmount("2000032756735", 0, 50, 100);
        assertTrue(loan == 3564 + 1396);
    }
    
    @Test
    public void test504() throws IOException{
    	PaymentImpl payment = new PaymentImpl(getCalendar());
        int loan = payment.getMonthlyAmount("2000032756735", 0, 50, 100);
        assertTrue(loan == 3564 + 1396);
    }
    
    @Test
    public void test505() throws IOException{
    	PaymentImpl payment = new PaymentImpl(getCalendar());
        int loan = payment.getMonthlyAmount("2000032756735", 0, 100, 100);
        assertTrue(loan == 7088 + 2816);
    }
    
    @Test
    public void test506() throws IOException{
    	PaymentImpl payment = new PaymentImpl(getCalendar());
        String cash = payment.getNextPaymentDay();
        assertTrue(cash == "20220930");
    }
    /*public static void main(String[] args){
        testSilly();
        testAge();
    } */
    
}
