package com.alexo.springframework.basics.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bubbles")
//@Primary // primary takes precedence over autowiring by name
public class BubbleSortAlgorithm implements SortAlgorithm{

    public int[] sort(int[] numbers) {
        return numbers;
    }
}
