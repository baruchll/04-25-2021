package com.company;

public class oilCompany extends Company implements IPO{
    String Country;
    int storage;

    public oilCompany(String name, int numOfWorkers, int marketCap,String Country, int storage) {
        this.name = name;
        this.numOfWorkers = numOfWorkers;
        this.marketCap = marketCap;
        this.Country = Country;
        this.storage = storage;
    }

    void bankrupcy(){
        numOfWorkers=0;
        marketCap=0;
    }

    @Override
    public void marketCap() {
        System.out.println(marketCap);
    }
}
