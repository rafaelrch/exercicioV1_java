package entities;


import enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> list = new ArrayList<>();

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getList() {
        return list;
    }



    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item){
        list.add(item);
    }

    public void removeItem(OrderItem item){
        list.remove(item);
    }

    public Double total(){
        double totalItems = 0;
        for (OrderItem o : list){
            totalItems += o.subTotal();
        }
        return totalItems;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment));
        sb.append("\n");
        sb.append("Order status: ");
        sb.append(status);
        sb.append("\n");
        sb.append(client);
        sb.append("\n");
        sb.append("Order items:");
        for (OrderItem o : list){
            sb.append(o);
        }
        sb.append("\n");
        sb.append("Total price: $");
        sb.append(total());
        return sb.toString();
    }

}


