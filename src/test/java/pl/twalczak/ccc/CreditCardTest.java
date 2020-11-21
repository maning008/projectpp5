package pl.twalczak.ccc;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class CreditCardTest {
    @Test
    public void itCreateCardWithNumber() {
        //Arrange
        //Act
        CreditCard card = new CreditCard("1234-5678");
        //Assert
        Assert.assertEquals(card.getNumber(), "1234-5678");
    }

    @Test
    public void itAllowAssignLimit() {
        CreditCard card = new CreditCard("1234-5678");

        card.assignLimit(new BigDecimal(1000));

        Assert.assertTrue(new BigDecimal(1000).equals(card.currentBalance()));

    }
    @Test
    public void itDenyAssignLimitBelow100() {
        CreditCard card = new CreditCard("1234-5678");

        try {
            card.assignLimit(new BigDecimal(50));
            Assert.fail("should throw exception");
        } catch (CreditBalanceInitException e) {
            Assert.assertTrue(true);
        }




    }
}
