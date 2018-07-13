package com.alexo.springframework.springframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // tells spring that its a bean
public class BinarySearchImpl {

    @Autowired // tells spring that its a dependency of this class
    private SortAlgorithm quickSortAlgorithm; // autowire by name meaning specifying the class name

    /** setter injection
    public void setSortAlgorithm(SortAlgorithm quickSortAlgorithm) {
        this.quickSortAlgorithm = quickSortAlgorithm;
    }*/

    /** example of constructor injection */
    public BinarySearchImpl(SortAlgorithm quickSortAlgorithm){
        super();
        this.quickSortAlgorithm = quickSortAlgorithm;
    }



    public int binarySearch(int[] numbers, int numberToSearchFor) {
        int[] sortedNumbers = this.quickSortAlgorithm.sort(numbers);
        System.out.println(this.quickSortAlgorithm);
        return 3;
    }
}
