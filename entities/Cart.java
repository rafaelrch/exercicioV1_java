package entities;

import java.util.ArrayList;
import java.util.List;

public class Cart{

    List<Double> listPrices = new ArrayList<>();
    private DiscountService discountService;

    public Cart(DiscountService discountService) {
        this.discountService = discountService;
    }

    public void add(double price){
        listPrices.add(price);
    }

    public double total(){
        double totalValue = 0;
        for (Double d : listPrices){
            totalValue += d;
        }
        return discountService.discount(totalValue);
    }
}
