package application;

import java.util.function.Consumer;
import java.util.function.Predicate;


public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
