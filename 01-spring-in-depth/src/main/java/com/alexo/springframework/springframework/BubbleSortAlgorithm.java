package com.alexo.springframework.springframework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // primary takes precedence over autowiring by name
public class BubbleSortAlgorithm implements SortAlgorithm{

    public int[] sort(int[] numbers) {
        return numbers;
    }
}
