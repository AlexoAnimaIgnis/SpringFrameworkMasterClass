package com.alexo.springframework.springframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // tells spring that its a bean
public class BinarySearchImpl {

    @Autowired // tells spring that its a dependency of this class
    private SortAlgorithm sortAlgorithm;

    /** setter injection
    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }*/

    /** example of constructor injection */
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
