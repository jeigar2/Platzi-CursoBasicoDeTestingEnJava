package es.jesustfk.javatest.discount;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {
    private List<Double> prices = new ArrayList<>();
    private double discount = 0;

    public double getTotal() {
        double result;
//        for (Double price : prices) {
//            result += price;
//        }
        result = prices.stream().reduce(Double::sum).orElse(0.0);
        return result;
    }

    public double getTotalDiscount(){
        //return this.getTotal() -  (this.getTotal() * (discount / 100));
        //return this.getTotal() * ((100 - discount) / 100);
        return this.getTotal() * (1 - (discount / 100));

    }

    public void addPrice(double price) {
        prices.add(price);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
