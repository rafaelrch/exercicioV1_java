package entities;


public class OrderItem {

    private Integer quantity;
    private Double price;

    private Product product;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public OrderItem(){

    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Double subTotal(){
        return price * quantity;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append(product);
        sb.append(", $");
        sb.append(price);
        sb.append(", Quantity: ");
        sb.append(quantity);
        sb.append(", Subtotal: $");
        sb.append(subTotal());
        return sb.toString();
    }
}
