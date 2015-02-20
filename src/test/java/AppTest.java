
// * Created by ds on 2/7/15.


import org.junit.*;

import static org.junit.Assert.*;


public class AppTest {

    @BeforeClass

    public static void BeforeClass() throws Exception {
        //System.out.println("BeforeClass method will be executed before first test method starts");
    }

    @AfterClass

    public static void AfterClass() throws Exception {
        //System.out.println("AfterClass method will be executed after last test method completed");
    }

    @Before

    public void Before() throws Exception {
        //System.out.println("Before method will execute before every test method");
    }

    @After

    public void After() throws Exception {
        //System.out.println("After method will execute after every test method");
    }


    @Test

    public void Test_01_assertEquals_Positive() {
        assertEquals("String is not same", "Testing JUnit 4", App.s);
        //System.out.println("Test_01_assertEquals_Positive");
    }


    @Test

    public void Test_02_assertEquals_Negative() {
        assertEquals("Wrong string", "Expectation", App.s);

        //System.out.println("Test_02_assertEquals_Negative");

    }


    @Ignore

    @Test

    public void Test_03_assertEquals_Ignored() {
        assertEquals("Wrong string", "Expectation", App.s);
        //System.out.println("Test_03_assertEquals_Ignored");
    }

    @Test

    public void Test_04_AssertSame_Positive() {
        assertSame("int isn't same", 55, App.i);
        //System.out.println("Test_04_AssertSame_Positive");
    }


    @Test

    public void Test_05_AssertSame_Negative() {
        assertSame("int isn't same", 76, App.i);
        //System.out.println("Test_05_AssertSame_Negative");
    }


    @Ignore
    @Test

    public void Test_06_AssertSame_Ignored() {
        assertSame("int isn't same", 87, App.i);
        //System.out.println("Test_06_AssertSame_Ignored");
    }


    @Test

    public void Test_07_assertFalse_Positive() {
        assertFalse("boolean is not false", App.f);
        //System.out.println("Test_07_assertFalse_Positive");
    }


    @Test

    public void Test_08_assertFalse_Negative() {
        assertFalse("should be false", App.t);
        //System.out.println("Test_08_assertFalse_Negative");
    }


    @Test

    public void Test_09_assertTrue_Positive() {
        assertTrue("boolean isn't true", App.t);
        //System.out.println("Test_09_assertTrue_Positive");
    }


    @Test

    public void Test_10_assertTrue_Negative() {
    assertTrue("value is not true", App.f);
        //System.out.println("Test_10_assertTrue_Negative");

    }

}