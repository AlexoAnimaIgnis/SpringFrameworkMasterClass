package com.alexo.mockito.mockitodemo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class) // needed in order to look for annotation, initialize them before running the tests
public class SomeBusinessMockitoAnnotationsTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks // ensure that the mock will be injected to it directly
    SomeBusinessImpl someBusiness;

    @Test
    public void testFindTheGreatestFromAllData()  {
        Mockito.when(dataServiceMock.retreiveAllData()).thenReturn(new int[] {24,6,7});
        Assert.assertEquals(24,someBusiness.findTheGreatestFromAllData());
    }

    @Test
    public void testFindTheGreatestFromAllData_ForOneValue()  {
        Mockito.when(dataServiceMock.retreiveAllData()).thenReturn(new int[] {15});
        Assert.assertEquals(15,someBusiness.findTheGreatestFromAllData());
    }

    @Test
    public void testFindTheGreatestFromAllData_ForNoValue()  {
        Mockito.when(dataServiceMock.retreiveAllData()).thenReturn(new int[] {});
        Assert.assertEquals(Integer.MIN_VALUE,someBusiness.findTheGreatestFromAllData());
    }
}

