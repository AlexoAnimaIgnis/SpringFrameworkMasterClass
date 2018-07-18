package com.alexo.springframework.springframework.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quicksort")
public class QuickSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers) {
        return numbers;
    }
}
