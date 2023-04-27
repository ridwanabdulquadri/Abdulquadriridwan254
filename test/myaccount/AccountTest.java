package myaccount;

import Ridwan.myAccounts.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account myPersonalAccount;
    @BeforeEach
    public void setUp(){
        myPersonalAccount = new Account();
    }
    @Test
    void checkTheMyRecordOfMySterlingBankAccount(){
        myPersonalAccount.setName("Ridwan");
        myPersonalAccount.setAddress("310,borno way,alagomeji,yaba,lagos");
        myPersonalAccount.setDay(12);
        myPersonalAccount.setMonth(8);
        myPersonalAccount.setYear(1996);
        myPersonalAccount.setDeposit(2_000_000);
        myPersonalAccount.setWithdraw(1_000_000);
        assertEquals("Ridwan", myPersonalAccount.getName());
        assertEquals("310,borno way,alagomeji,yaba,lagos", myPersonalAccount.getAddress());
        assertEquals(12,myPersonalAccount.getDay());
        assertEquals(8, myPersonalAccount.getMonth());
        assertEquals(1996, myPersonalAccount.getYear());
        assertEquals(2_000_000, myPersonalAccount.getDeposit());
        assertEquals(1_000_000, myPersonalAccount.getWithdraw());

    }
    @Test
    public void alsoCheckMyGtbBankAccount(){
        myPersonalAccount.setDeposit(0);
        myPersonalAccount.setWithdraw(0);
        assertEquals(0,myPersonalAccount.getDeposit());
        myPersonalAccount.setDeposit(2_000_000);
        myPersonalAccount.setWithdraw(1_000_000);
        assertEquals(1_000_000, myPersonalAccount.getWithdraw());


    }


}