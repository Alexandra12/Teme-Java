package com.supermarket.siit;

public class Apple extends Product {

    public Apple(int id, String unitOfMeasure, double price, double quantity, String category) {
        super(id, unitOfMeasure, price, quantity, category);
    }

    public String toString() {
        return "Apple " + super.toString();
    }
}
