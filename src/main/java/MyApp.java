import coffee.order.CoffeeOrderBoard;

public class MyApp {
    public static void main(String[] args) {
// 1).
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();

// 2).
        orderBoard.add("Alex", "Coffee", "Burger");
        orderBoard.add("Mark", "Apple juice");
        orderBoard.add("Ann", "Tea", "Cake");
        orderBoard.add("Bob", "Tea", "Cookie");
        orderBoard.add("Piter", "Coffee", "Cheese cake");
        orderBoard.add("Pavlo", "Orange juice");

// 3).
        System.out.println(orderBoard.deliver());
        System.out.println(orderBoard.deliver());

// 4).
        System.out.println(orderBoard.deliver(5));

// 5).
        orderBoard.draw();


    }
}
