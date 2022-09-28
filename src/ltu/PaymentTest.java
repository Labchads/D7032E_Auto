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
    public void test101() throws IOException{
        PaymentImpl payment = new PaymentImpl(getCalendar());
        int loan = payment.getMonthlyAmount("2003032756735", 0, 100, 100);
        assertEquals(0, loan);
    }
    
    @Test
    public void test102() throws IOException{
    	PaymentImpl payment = new PaymentImpl(getCalendar());
        int loan = payment.getMonthlyAmount("1965032756735", 0, 100, 100);
        assertEquals(0, loan);
    }
    
    @Test
    public void test103() throws IOException{
    	PaymentImpl payment = new PaymentImpl(getCalendar());
        int loan = payment.getMonthlyAmount("1975032756735", 0, 100, 100);
        assertEquals(2816, loan);
    }
    
    @Test
    public void test201() throws IOException{
    	PaymentImpl payment = new PaymentImpl(getCalendar());
        int loan = payment.getMonthlyAmount("2000032756735", 0, 49, 100);
        int loan2 = payment.getMonthlyAmount("2000032756735", 0, 51, 100);
        assertTrue(loan != loan2);
    }
    
    @Test
    public void test202() throws IOException{
    	PaymentImpl payment = new PaymentImpl(getCalendar());
//        int loan = payment.getMonthlyAmount("2000032756735", 0, 100, 100);
        int loan2 = payment.getMonthlyAmount("2000032756735", 0, 99, 100);
        assertEquals(loan2, 1396+3564);
    }
    
    @Test
    public void test203() throws IOException{
    	PaymentImpl payment = new PaymentImpl(getCalendar());
        int loan = payment.getMonthlyAmount("2000032756735", 0, 100, 100);
        assertTrue(loan == 7088 + 2816);
    }
    
    //[ID: 301] A student who is studying full time or more is permitted to earn a maximum of 
    //85 813SEK per year in order to receive any subsidiary or student loans.
    @Test
    public void test301() throws IOException{
    	PaymentImpl payment = new PaymentImpl(getCalendar());
        int loan = payment.getMonthlyAmount("2000032756735", 85814, 100, 100);
        assertTrue(loan == 0);
    }
    
    //[ID: 302] A student who is studying less than full time is allowed to earn a maximum of 
    //128 722SEK per year in order to receive any subsidiary or student loans.
    @Test
    public void test302() throws IOException{
    	PaymentImpl payment = new PaymentImpl(getCalendar());
        int loan = payment.getMonthlyAmount("2000032756735", 128723, 99, 100);
        assertTrue(loan == 0);
    }
    
    //[ID: 401] A student must have completed at least 50% of previous studies in order to receive 
    //any subsidiary or student loans.
    @Test
    public void test401() throws IOException{
    	PaymentImpl payment = new PaymentImpl(getCalendar());
        int loan = payment.getMonthlyAmount("2000032756735", 0, 100, 49);
        assertTrue(loan == 0);
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
