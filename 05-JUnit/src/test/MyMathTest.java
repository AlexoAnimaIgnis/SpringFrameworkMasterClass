package test;

import com.alexo.junit.MyMath;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyMathTest {

    MyMath myMath = new MyMath();

    @Test
    public void sumWithThreeNumbers(){
        // check result is correct
        assertEquals(6,myMath.sum(new int[] {1,2,3}));
    }

    @Test
    public void sumWithOneNumbers(){
        // check result is correct
        assertEquals(3,myMath.sum(new int[] {3}));
    }
}