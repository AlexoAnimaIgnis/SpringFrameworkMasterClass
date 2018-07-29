package test;

import org.junit.*;

public class AssertTest {

    @Before // run before each method here
    public void before(){
        System.out.println("Before");
    }

    @After
    public void after(){
        System.out.println("After");
    }

    @BeforeClass //class level method. should always be static in junit.
    public static void beforeclass(){
        System.out.println("beforeClass");
    }

    @AfterClass //class level method. should always be static in junit.
    public static void afterClass(){
        System.out.println("afterClass");
    }

    @Test
    public void test(){
        Assert.assertEquals(1,1);
        Assert.assertTrue(1 == 1);
        Assert.assertFalse(1 == 2);
        Assert.assertArrayEquals(new int[] {},new int[]{});
        System.out.println("Test1");
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,1);
        Assert.assertTrue(1 == 1);
        Assert.assertFalse(1 == 2);
        Assert.assertArrayEquals(new int[] {},new int[]{});
        System.out.println("Test2");
    }
}
