import java.util.*;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Product> products = new ArrayList<>();

    public Queue<Client> queue = new LinkedList<>();

    public void update() {

    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void sellProduct(Product product) {
        products.remove(product);
    }

    @Override
    public void addToQueue(Client client) {
        queue.add(client);
    }

    @Override
    public void leftQueue(Client client) {
        queue.remove(client);
    }


    @Override
    public String toString() {
        String productsString = MyPrintMethods.showAsFormattedList(
                "Продукты в продаже:", products.toArray());
        String queueString = MyPrintMethods.showAsFormattedList(
                "Клиенты в очереди:", queue.toArray());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Рынок: \n")
                .append(productsString)
                .append(queueString);
        return stringBuilder.toString();
    }
}
