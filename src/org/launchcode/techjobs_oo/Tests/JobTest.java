package org.launchcode.techjobs_oo.Tests;

import org.junit.jupiter.api.Test;

import org.launchcode.techjobs_oo.*;

import static org.junit.jupiter.api.Assertions.*;

public class JobTest {
        @Test
        void testSettingJobId() {
            Job JobA = new Job();
            Job JobB = new Job();
            var JobIdA = JobA.getId();
            JobIdA++;
            var JobIdB = JobB.getId();
            assertTrue(JobIdA == JobIdB);

        }
       @Test
        void testJobConstructorSetsAllFields() {
           Job JobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
           assertEquals("Product tester", JobA.getName());
           assertEquals("ACME", JobA.getEmployer().getValue());
           assertEquals("Desert", JobA.getLocation().getValue());
           assertEquals("Quality control", JobA.getPositionType().getValue());
           assertEquals("Persistence", JobA.getCoreCompetency().getValue());
       }
       @Test
        void testJobsForEquality() {
           Job JobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
           Job JobB = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
           assertFalse(JobA == JobB);
       }

       @Test
        void testingToString(){
           Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
           String testStr = job.toString();

           String comparisonStr = "ID: " + job.getId() + " \n"
                   + "Name: " + "Product tester" + " \n"
                   + "Employer: " + "ACME" + " \n"
                   + "Location: " + "Desert" + " \n"
                   + "Position Type: " + "Quality control" + " \n"
                   + "Core Competency: " + "Persistence" + " \n";

           assertEquals(testStr, comparisonStr);
       }
        @Test
        void testingToStringOneEmpty(){
            Job job = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            String testStr = job.toString();
            String unavailable = "Data not available";
            String comparisonStr = "ID: " + job.getId() + " \n"
                + "Name: " + "Product tester" + " \n"
                + "Employer: " + unavailable + " \n"
                + "Location: " + "Desert" + " \n"
                + "Position Type: " + "Quality control" + " \n"
                + "Core Competency: " + "Persistence" + " \n";

            assertEquals(testStr, comparisonStr);
        }
        @Test
        void testingToStringEmpty() {
            Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
            String testStr = job.toString();
            String comparisonStr = "OOPS! This job does not seem to exist.";

            assertEquals(testStr, comparisonStr);
        }
    }

