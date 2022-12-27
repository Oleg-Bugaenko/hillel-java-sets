package coffee.order;

import java.util.LinkedList;
import java.util.List;

public class CoffeeOrderBoard {
    private int idOrder = 0;
    private List<Order> ordersList = new LinkedList<>();


    public void add(String nameCustomer, String...orders) {
        idOrder++;
        Order orderPerson = new Order(idOrder, nameCustomer, orders);
        ordersList.add(orderPerson);
    }

    public Order deliver() {
        if (!ordersList.isEmpty()) {
            Order firstOrder = ordersList.get(0);
            ordersList.remove(0);
            return firstOrder;
        } else {
            System.out.println("Order list is empty");
        }
        return null;
    }

    public Order deliver(int idOrder) {
        if (!ordersList.isEmpty()) {
            Order order;
            for (int i = 0; i < ordersList.size(); i++) {
                if (ordersList.get(i).getIdOrder() == idOrder) {
                    order = ordersList.get(i);
                    ordersList.remove(i);
                    return order;
                }
            }
        } else {
            System.out.println("Order list is empty");
        }
        return null;
    }


    public void draw() {
        System.out.println("====================");
        System.out.println("Num | Name ");
        for (Order order: ordersList) {
            System.out.println(order);
        }
    }
}
