package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertNotEquals;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId

    {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

}
