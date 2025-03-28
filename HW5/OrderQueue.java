public class OrderQueue {
    public LinkedQueue<CustomerOrder> linkedQueue;
    public int stock;

    public OrderQueue() {
        linkedQueue = new LinkedQueue<>();
        stock = 0;
    }

    public OrderQueue(int stock) {
        linkedQueue = new LinkedQueue<>();
        this.stock = stock;
    }

    public void addOrder(String name, String date, int quantity) {
        CustomerOrder newOrder = new CustomerOrder(name, date, quantity);
        linkedQueue.enqueue(newOrder);
    }

    public void addStock(int newStock) {
        stock += newStock;
    }

    public void fulfillOrder() {
        if ((linkedQueue.isEmpty() == false) && (stock > 0)) {
            CustomerOrder order = linkedQueue.getFront();
            if (order.getQuantity() > 0) {
                order.shipProduct();
                stock -= 1;
            }
            if (order.getQuantity() == 0) {
                linkedQueue.dequeue();
            }
        }
    }

    public void sellStock() {
        while ((linkedQueue.isEmpty() == false) && (stock > 0)) {
            fulfillOrder();
        }
    }

    @Override
    public String toString() {
        String outStr = "";
        return outStr + linkedQueue.getFront().getQuantity();
    }
}
