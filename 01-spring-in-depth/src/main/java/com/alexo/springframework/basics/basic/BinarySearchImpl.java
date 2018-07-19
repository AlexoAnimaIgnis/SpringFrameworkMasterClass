package com.alexo.springframework.basics.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component // tells spring that its a bean
//@Scope("prototype") // default is singleton
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
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

    @PostConstruct // as soon as the bean is created, this post construct will be called
    public void postConstruct(){
        logger.info("post construct");
    }

    @PreDestroy // this is called just as before the bean is removed
    public void preDestroy() {
        logger.info("predestroy");
    }
}
