package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    public PhysicalProduct(){}

    public PhysicalProduct(Long id,String name,double price,double weightKg,String dimensions){
        super(id,name,price);
        this.weightKg=weightKg;
        this.dimensions=dimensions;
    }

    public double getWeightKg(){
        return weightKg;
    }
    public String getDimensions(){
        return dimensions;
    }
}

//A physical product is still a product because it has id, name, price;
//A customer is not a product because it doesnt have a price;
