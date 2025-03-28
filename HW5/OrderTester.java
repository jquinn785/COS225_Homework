public class OrderTester {
    public static void main(String[] args) {
        OrderQueue orderQueue = new OrderQueue(14);

        orderQueue.addOrder("Name", "Date", 5);
        orderQueue.addOrder("Name", "Date", 5);
        orderQueue.addOrder("Name", "Date", 8);

        System.out.println(orderQueue);

        orderQueue.sellStock();

        System.out.println(orderQueue);

        orderQueue.addStock(10);

        orderQueue.addOrder("Name", "Date", 3);
        orderQueue.addOrder("Name", "Date", 3);
        orderQueue.addOrder("Name", "Date", 5);

        orderQueue.sellStock();

        System.out.println(orderQueue); 
    }
}

