package com.bernic.patterns.structural.bridge.abstraction;

import com.bernic.patterns.structural.bridge.implementation.Product;

public abstract class Car {
    private final Product product;
    private final String carType;

    protected Car(Product product, String carType) {
        this.product = product;
        this.carType = carType;
    }

    public void printDetails(){
        System.out.println("Car: "+carType+", Product:"+product.productName());
    }

    public abstract void assemble();
    public abstract void produceProduct();
}
