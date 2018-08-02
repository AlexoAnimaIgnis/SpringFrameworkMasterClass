package com.alexo.mockito.mockitodemo;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class SomeBusinessMockTest {

    @Test
    public void testFindTheGreatestFromAllData()  {
        // mocking is so simple
        DataService dataServiceMock = Mockito.mock(DataService.class);
        // ask to mock to return => new int[] {24, 6, 7}
        Mockito.when(dataServiceMock.retreiveAllData()).thenReturn(new int[] {24,6,7});
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
        int result = someBusiness.findTheGreatestFromAllData();
        Assert.assertEquals(24,result);
    }
}

