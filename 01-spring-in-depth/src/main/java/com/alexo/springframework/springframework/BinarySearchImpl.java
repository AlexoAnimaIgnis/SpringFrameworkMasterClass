package com.alexo.springframework.springframework;

public class BinarySearchImpl {

    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm){
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        int[] sortedNumbers = this.sortAlgorithm.sort(numbers);
        System.out.println(this.sortAlgorithm);
        return 3;
    }
}
