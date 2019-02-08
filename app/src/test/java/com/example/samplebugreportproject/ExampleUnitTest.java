package com.example.samplebugreportproject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

// this removes the error about no manifest found, but does not change test results
@Config(manifest="src/main/AndroidManifest.xml")

//generates 100% coverage on the Example class if commented out
// generates 0% coverage when not commented
@RunWith(RobolectricTestRunner.class)
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void someTest(){

        Assert.assertEquals("a < b, static",3, Example.functionThatNeedsCoverage(1, 2));
        Assert.assertEquals("a = b, static",4, Example.functionThatNeedsCoverage(2, 2));
        Assert.assertEquals("a > b, static",1, Example.functionThatNeedsCoverage(3, 2));


        Example example = new Example(5);
        Assert.assertEquals("a < b",15, example.functionThatNeedsCoverageToo(1,2));
        Assert.assertEquals("a = b",20, example.functionThatNeedsCoverageToo(2,2));
        Assert.assertEquals("a > b",5, example.functionThatNeedsCoverageToo(3,2));
    }
}