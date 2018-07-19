package com.alexo.springframework.basics.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // tells spring that its a bean
//@Scope("prototype") // default is singleton
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

    @Autowired // tells spring that its a dependency of this class
    @Qualifier("bubbles")
    private SortAlgorithm sortAlgorithm; // autowire by name meaning specifying the class name

    /** setter injection
    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }*/

    /** example of constructor injection
    public BinarySearchImpl(SortAlgorithm sortAlgorithm){
        super();
        this.sortAlgorithm = sortAlgorithm;
    }*/

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        int[] sortedNumbers = this.sortAlgorithm.sort(numbers);
        System.out.println(this.sortAlgorithm);
        return 3;
    }
}
