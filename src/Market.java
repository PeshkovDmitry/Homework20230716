import java.util.*;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Product> products = new ArrayList<>();

    public Queue<Client> queue = new LinkedList<>();

    private List<Client> satisfiedClients = new ArrayList<>();

    public void update() {
        Client currentClient = queue.poll();
        if (currentClient != null) {
            for (int i = 0; i < currentClient.getWishList().size(); i++) {
                Product wish = currentClient.getWishList().get(i);
                if ((products.contains(wish)) && currentClient.canBuy(wish)) {
                    currentClient.Buy(wish);
                    sellProduct(wish);
                    i--;
                }
            }
            satisfiedClients.add(currentClient);
        }
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
                "ПРОДУКТЫ В ПРОДАЖЕ:", products.toArray());
        String queueString = MyPrintMethods.showAsFormattedList(
                "КЛИЕНТЫ В ОЧЕРЕДИ:", queue.toArray());
        String satisfiedClientsString = MyPrintMethods.showAsFormattedList(
                "ДОВОЛЬНЫЕ КЛИЕНТЫ:", satisfiedClients.toArray());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("### РЫНОК ### \n")
                .append(productsString)
                .append(queueString)
                .append(satisfiedClientsString);
        return stringBuilder.toString();
    }
}
