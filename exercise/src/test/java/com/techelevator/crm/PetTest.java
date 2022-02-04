package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PetTest {

    @Test
    public void listVaccinations_returns_proper_string() {


        //Arrange
        String expected = "test1, test2, test3";
        Pet pet = new Pet("name", "species");
        List<String> petVaccTest = new ArrayList<>(Arrays.asList("test1", "test2", "test3"));
        pet.setVaccinations(petVaccTest);

        //Act
        String actual = pet.listVaccinations();

        //Assert

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void Pet_constructor_constructs_properly() {

        //Arrange
        String expected = "name";
        Pet pet = new Pet("name", "species");
        
        //Act
        String actual = pet.getName();

        //Assert
        Assert.assertEquals(expected, actual);

        expected = "species";
        actual = pet.getSpecies();
        Assert.assertEquals(expected, actual);
    }
}
