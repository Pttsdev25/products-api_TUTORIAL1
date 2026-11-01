package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product implements Discountable {
    private double weightKg;
    private String dimensions;
    private double discounedPrice;

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


    @Override
    public String getSummary(){
       return  "Physical "+ getName() +"weighs: "+getWeightKg() +"kg(s)";
    }

    @Override
    public void applyDiscount(double rate) {
        double capped=Math.min(rate,0.20);
        discounedPrice=getPrice()*(1-capped);
    }

    @Override
    public double getDiscountedPrice() {
        return discounedPrice;
    }
}

//A physical product is still a product because it has id, name, price;
//A customer is not a product because it doesnt have a price;


