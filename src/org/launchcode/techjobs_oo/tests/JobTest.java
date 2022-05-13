package org.launchcode.techjobs_oo.tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;

public class JobTest {

    // Declared Job objects
    Job test_job1;
    Job test_job2;
    Job test_job3;
    Job test_job4;
    Employer employer;
    Location location;
    PositionType positionType;
    CoreCompetency coreCompetency;
    Integer difference;
    String output;
    String toStringFirstTestOne;
    String toStringFirstTestTwo;

    @Before
    public void createJobObj() {

        // Initialized job objects
        test_job1 = new Job(
                "Product tester",
                employer = new Employer("ACME"),
                location = new Location("Desert"),
                positionType = new PositionType("Quality control"),
                coreCompetency = new CoreCompetency("Persistence")
        );
        test_job2 = new Job(
                "Job Test2",
                employer = new Employer("ACME"),
                location = new Location("Desert"),
                positionType = new PositionType("Quality control"),
                coreCompetency = new CoreCompetency("Persistence")
        );
        test_job3 = new Job(
                "Product tester",
                employer = new Employer("ACME"),
                location = new Location("Desert"),
                positionType = new PositionType("Quality control"),
                coreCompetency = new CoreCompetency("Persistence")
        );
        test_job4 = new Job(
                "",
                new Employer(""),
                new Location(""),
                new PositionType(""),
                new CoreCompetency("")
        );
    }

    @Test
    public void emptyTest() {
        assertEquals(1, 1, .001);
    }

    // Test the Empty Constructor
    @Test
    public void testSettingJobId() {
        test_job1.getId();
        assertTrue(test_job1.getId() != test_job2.getId());

        test_job2.getId();
        difference = test_job1.getId() - test_job2.getId();
        assertTrue(difference == -1);
    }

    // Test the Full Constructor
    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(test_job3 instanceof Job);
        assertEquals(test_job3.getName(), "Product tester");
        assertEquals(test_job3.getEmployer(), employer);
        assertEquals(test_job3.getLocation(), location);
        assertEquals(test_job3.getPositionType(), positionType);
        assertEquals(test_job3.getCoreCompetency(), coreCompetency);
    }

    // Test the equals Method
    @Test
    public void testJobsForEquality() {
        assertFalse(test_job1.equals(test_job3));
    }

    @Test
    public void testJobToStringNewlines() {
        output = test_job3.toString();
        assertTrue(output.startsWith("\n"));
        assertTrue(output.endsWith("\n"));
    }

    // Created First Test for toString
    @Test
    public void testFirstToStringOne() {
        toStringFirstTestOne = "" + "\n" +
                "ID: " + test_job3.getId() + "\n" +
                "Name: " + test_job3.getName() + "\n" +
                "Employer: " + test_job3.getEmployer() + "\n" +
                "Location: " + test_job3.getLocation() + "\n" +
                "Position Type: " + test_job3.getPositionType() + "\n" +
                "Core Competency: " + test_job3.getCoreCompetency() + "\n" +
                "";

        assertEquals(toStringFirstTestOne, test_job3.toString());
        ;
    }

    @Test
    public void testFirstToStringTwo() {
        toStringFirstTestTwo = "" + "\n" +
                "ID: " + test_job4.getId() + "\n" +
                "Name: " + "Data not available" + "\n" +
                "Employer: " + "Data not available" + "\n" +
                "Location: " + "Data not available" + "\n" +
                "Position Type: " + "Data not available" + "\n" +
                "Core Competency: " + "Data not available" + "\n" +
                "";
        assertEquals(toStringFirstTestTwo, test_job4.toString());
    }
}