package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId()

    {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields()
    {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob.getName() instanceof String);
        assertEquals(testJob.getName(),"Product tester");
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertEquals(testJob.getEmployer().toString(),"ACME");
        assertTrue(testJob.getLocation() instanceof Location);
        assertEquals(testJob.getLocation().toString(),"Desert");
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertEquals(testJob.getPositionType().toString(),"Quality control");
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(testJob.getCoreCompetency().toString(),"Persistence");
    }
    @Test
    public void testJobsForEquality()
    {
        Job job01 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job02 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(job01,job02);
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job Job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(Job1.toString().startsWith("\n"));
        assertTrue(Job1.toString().endsWith("\n"));
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job Job001 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(Job001.toString().equals(System.lineSeparator() +
                "ID: " + Job001.getId() +
                System.lineSeparator() + "Name: " + Job001.getName() +
                System.lineSeparator() + "Employer: " + Job001.getEmployer() +
                System.lineSeparator() + "Location: " + Job001.getLocation() +
                System.lineSeparator() + "Position Type: " +  Job001.getPositionType() +
                System.lineSeparator() + "Core Competency: " + Job001.getCoreCompetency() +
                System.lineSeparator()));
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job JobOne = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
       String expected = System.lineSeparator() +
               "ID: " + JobOne.getId() + System.lineSeparator() +
               "Name: Data not available" + System.lineSeparator() +
               "Employer: Data not available" + System.lineSeparator() +
               "Location: Data not available" + System.lineSeparator() +
               "Position Type: Data not available" + System.lineSeparator() +
               "Core Competency: Data not available" + System.lineSeparator();
       assertEquals(expected,JobOne.toString());
    }



}
