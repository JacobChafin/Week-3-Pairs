package com.techelevator.hr;

import com.techelevator.crm.Customer;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class EmployeeTests {

    @Test
    public void getFullNameReturnsCorrectFormat() {
        Employee employee = new Employee("Test", "Testerson");
        String fullName = employee.getFullName();

        assertEquals("The employee full name is not in the correct format.", "Testerson, Test", fullName);
    }

    @Test
    public void raiseSalaryTest_Positive() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(5);

        assertEquals("The employee raise of 5% was not computed correctly.",employee.getSalary(), 100 * 1.05, 0.0);
    }

    @Test
    public void raiseSalaryTest_Negative() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(-10); //"raise" by negative 10%

        assertEquals("Salary should remain the same when raise percentage is negative.",100, employee.getSalary(),0.0);
    }

    @Test
    public void getBalanceDue_returns_correct_balance(){

        //arrange
        Employee employee = new Employee("Steve", "Jobs");
        Map<String, Double> services = new HashMap<>(){{put("Walking", 569.00);put("grooming", 849.02);}};
        double expected = (569.00+849.02)/2;

        //act
        double actual = employee.getBalanceDue(services);

        //assert
        Assert.assertEquals(expected, actual, .001);
    }
}
