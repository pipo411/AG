package org.gradle;

import org.junit.Test;
import org.junit.Before;


import static org.junit.Assert.*;

/**
 * Person class Test.
 */
public class PersonTest {
    Person person;

    /**
     * Init the Person object.
     */
    @Before
    public void init() {
        person = new Person("Larry", "White", "male", 7852, 15);
    }

    /**
     * Compare the object arguments.
     */
    @Test
    public void canConstructAPerson() {
        assertEquals("Larry", person.getName());
        assertEquals("White", person.getLastName());
        assertEquals("male", person.getGender());
        assertEquals(7852, person.getId());
        assertEquals(15, person.getAge());
    }

    /**
     * Test to compare the new name changed.
     */
    @Test
    public void canSetNamePerson() {
        person.setName("Max");
        assertEquals("Max", person.getName());
    }

    /**
     * Test to compare the new lastName changed.
     */
    @Test
    public void canSetLastNamePerson() {
        person.setLastName("Burton");
        assertEquals("Burton", person.getLastName());
    }

    /**
     * Test to compare the new gender changed.
     */
    @Test
    public void canSetGender() {
        person.setGender("female");
        assertEquals("female", person.getGender());
    }

    /**
     * Test to compare the new age changed.
     */
    @Test
    public void canSetAge() {
        person.setAge(25);
        assertEquals(25, person.getAge());
    }

    /**
     * Test to compare the new id changed.
     */
    @Test
    public void canSetId() {
        person.setId(84596);
        assertEquals(84596, person.getId());
    }

    /**
     * Test to compare the person gender for female.
     */
    @Test
    public void genderPersonWoman() {
        person.setGender("female");
        assertEquals("She is a woman", person.genderPerson());
    }

    /**
     * Test to compare the person gender for male.
     */
    @Test
    public void genderPersonMan() {
        person.setGender("male");
        assertEquals("He is a man", person.genderPerson());
    }

    /**
     * Test to compare is the person is "Adult".
     */
    @Test
    public void adult() {
        person.setAge(25);
        assertEquals("Adult", person.adultAge());
        person.setAge(65);
        assertEquals("Adult", person.adultAge());
    }

    /**
     * Test to compare is the person is "Not Adult".
     */
    @Test
    public void notAdult() {
        person.setAge(8);
        assertEquals("Not Adult", person.adultAge());
        person.setAge(17);
        assertEquals("Not Adult", person.adultAge());
    }


    /**
     * Test to verify the taxes.
     */
    @Test
    public void salaryTaxes() {
        assertEquals(500.0, person.taxes(2500.0), 0);
        assertEquals(1120.0, person.taxes(5600.0), 0);
        assertEquals(1960.0, person.taxes(9800.0), 0);
    }
}
