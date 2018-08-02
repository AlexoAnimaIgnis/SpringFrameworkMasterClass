package com.alexo.mockito.mockitodemo;

public class SomeBusinessImpl {
    private DataService dataService; // dependency of SomeBusinessImpl

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    int findTheGreatestFromAllData() {
        int[] data = dataService.retreiveAllData();
        int greatest = Integer.MIN_VALUE;

        for(int value: data) {
            if(value > greatest){
                greatest = value;
            }
        }
        return greatest;
    }
}