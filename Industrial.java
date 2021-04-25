package com.company;

public class Industrial extends Company implements investments{
    String type;
    int NumOfPlants;

    public Industrial(String name, int numOfWorkers, int marketCap, String type, int numOfPlants) {
        this.name = name;
        this.numOfWorkers = numOfWorkers;
        this.marketCap = marketCap;
        this.type = type;
        NumOfPlants = numOfPlants;
    }

    @Override
    public int add(int funds) {
        marketCap += funds;
        return marketCap;
    }
}
