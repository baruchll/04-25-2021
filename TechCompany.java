package com.company;

import java.util.Date;
import java.util.HashMap;

public class TechCompany extends Company implements IPO, investments {
    Date nextProduct;
    String manuCountry;
    HashMap<String,String>products;


    public TechCompany(String name,int numOfWorkers,int marketCap,  Date nextProduct,
                       String manuCountry, HashMap<String, String> products) {

        this.name = name;
        this.numOfWorkers = numOfWorkers;
        this.marketCap = marketCap;
        this.nextProduct = nextProduct;
        this.manuCountry = manuCountry;
        this.products = products;

    }

    void addProduct(String k, String v){
        products.put(k,v);
    }

 @Override
    public void marketCap() {
     System.out.println(this.marketCap);
    }

    @Override
    public int add(int funds) {
        this.marketCap += funds;
        return marketCap;
    }




}
