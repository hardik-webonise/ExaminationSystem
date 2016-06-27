package com.webonise.examinationsystem;

import junit.framework.Assert;

import org.junit.Test;

public class StudentTest {

    @Test
    public void testCreateObject() throws Exception {
        Student std = Student.newInstance(1, "Hardik", 10, 20, 20);

        Student std1 = Student.newInstance(1, "Hardik", 10, 20, 20);

        Assert.assertEquals(std, std1);
    }

    @Test
    public void testDifferentObject() throws Exception {
        Student std1 = Student.newInstance(1, "Hardik", 10, 20, 20);

        Student std2 = Student.newInstance(2, "Pallavi", 100, 100, 100);
        Assert.assertNotSame(std1, std2);
    }


    @Test
    public void testRollNumber() throws Exception {
        Student std1 = Student.newInstance(-1, "Hardik", 10, 20, 20);
        Student std2 = Student.newInstance(2, "Pallavi", 100, 100, 100);
        Assert.assertNull(std1);
        Assert.assertNotNull(std2);
    }


}
