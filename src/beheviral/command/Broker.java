package beheviral.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }
    public void placeOrders(){
        for(Order order: orderList){
            orderList.clear();
        }
    }
}
