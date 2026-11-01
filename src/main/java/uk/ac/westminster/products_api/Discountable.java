package uk.ac.westminster.products_api;

public interface Discountable {
    void applyDiscount(double rate);
    double getDiscountedPrice();

    //BOTH PhysicalProduct , DigitalProduct compiles because interface define method signature. Each classes can have different method bodies.
}
