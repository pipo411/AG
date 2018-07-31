package org.gradle;

import org.apache.commons.collections.list.GrowthList;

/**
 * Class Person.
 */
public class Person {
    private String name;
    private String lastName;
    private String gender;
    private int id;
    private int age;

    /**
     * @param name     The person name.
     * @param lastName The person lastName.
     * @param gender   The person gender.
     * @param id       The person id.
     * @param age      The person age.
     */
    public Person(String name, String lastName, String gender, int id, int age) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.id = id;
        this.age = age;
        new GrowthList();
    }

    /**
     * @return The person name.
     */
    public String getName() {
        return name;
    }

    /**
     * @return The person lastname.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return The person gender.
     */
    public String getGender() {
        return gender;
    }

    /**
     * @return The person id.
     */
    public int getId() {
        return id;
    }

    /**
     * @return The person age.
     */
    public int getAge() {
        return age;
    }

    /**
     * @param name set a new name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param lastName set a new lastName.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @param gender set a new gender.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @param id set a new id.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param age set a new age.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the person gender.
     * true male.
     * false female.
     */
    public String genderPerson() {
        return this.getGender().equals("male") ? "He is a man" : "She is a woman";
    }

    /**
     * @return age person.
     * true if the person is Adult.
     * false if the person is not Adult.
     */
    public String adultAge() {
        return this.getAge() > 17 ? "Adult" : "Not Adult";
    }

    /**
     * @param salary a person salary
     * @return the taxes
     */
    public double taxes(double salary) {
        return salary * 0.20;
    }
}
