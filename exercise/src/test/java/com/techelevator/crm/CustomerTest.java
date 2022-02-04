package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerTest {

    @Test
    public void getBalanceDue_returns_correct_balance(){

        //arrange
        Customer customer = new Customer("Steve", "Jobs");
        Map<String, Double> services = new HashMap<>(){{put("Walking", 569.00);put("grooming", 849.02);}};
        double expected = (569.00+849.02);

        //act
        double actual = customer.getBalanceDue(services);

        //assert
        Assert.assertEquals(expected, actual, .001);
    }

}
