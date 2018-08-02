package com.alexo.mockito.mockitodemo;

import javafx.scene.chart.PieChart;
import org.junit.Assert;
import org.junit.Test;

public class SomeBusinessTest {

    @Test
    public void testFindTheGreatestFromAllData() {
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(new DataServiceStub());
        int result = someBusiness.findTheGreatestFromAllData();
        Assert.assertEquals(24,result);
    }
}

//problem with stub is that we need to do this always
// or create a new stub based on new test scenario
// that's where mock comes in.
class DataServiceStub implements DataService {
    @Override
    public int[] retreiveAllData() {
        return new int[] {24, 6, 15};
    }
}