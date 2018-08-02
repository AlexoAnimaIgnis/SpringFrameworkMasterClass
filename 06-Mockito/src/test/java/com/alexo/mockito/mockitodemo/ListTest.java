package com.alexo.mockito.mockitodemo;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class ListTest {

    @Test
    public void test(){
        List listMock = Mockito.mock(List.class);
        Mockito.when(listMock.size()).thenReturn(10);
        Assert.assertEquals(10, listMock.size());
    }

    @Test
    public void test_multipleReturns(){
        List listMock = Mockito.mock(List.class);
        Mockito.when(listMock.size()).thenReturn(10).thenReturn(20); // multiple returns yield different values
        //per return
        Assert.assertEquals(10, listMock.size());
        Assert.assertEquals(20, listMock.size());
    }

    @Test
    public void testGet(){
        List listMock = Mockito.mock(List.class);
        // multiple returns yield different values per return
        Mockito.when(listMock.get(0)).thenReturn("SomeString");
        Assert.assertEquals("SomeString", listMock.get(0));
        Assert.assertEquals(null, listMock.get(1));
    }

    @Test
    public void testGetAny(){
        List listMock = Mockito.mock(List.class);
        // multiple returns yield different values per return
        Mockito.when(listMock.get(Mockito.anyInt())).thenReturn("SomeString");
        Assert.assertEquals("SomeString", listMock.get(0));
        Assert.assertEquals("SomeString", listMock.get(1));
    }
}
