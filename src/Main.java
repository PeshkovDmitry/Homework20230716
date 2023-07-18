/*
    Реализовать класс Market и все его обязательные методы.
    Этот класс должен реализовывать методы из интерфейса QueueBehaviour,
    которые имитируют работу очереди. Кроме того, класс должен содержать методы,
    соответствующие интерфейсу MarketBehaviour, которые добавляют и
    удаляют людей из очереди, а также метод update, который обновляет
    состояние магазина путем принятия и отдачи заказов.
 */


public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Иван", 2500.0);
        client1.addToWishList(new Product("Капуста", 100.0));
        client1.addToWishList(new Product("Говядина", 600.0));
        client1.addToWishList(new Product("Молоко", 70.0));

        Client client2 = new Client("Татьяна", 1500.0);
        client2.addToWishList(new Product("Картофель", 40.0));
        client2.addToWishList(new Product("Свинина", 350.0));
        client2.addToWishList(new Product("Молоко", 70.0));

        Client client3 = new Client("Ольга", 1000.0);
        client3.addToWishList(new Product("Говядина", 600.0));
        client3.addToWishList(new Product("Свинина", 350.0));
        client3.addToWishList(new Product("Картофель", 40.0));

        Market market = new Market();
        market.addProduct(new Product("Капуста", 100.0));
        market.addProduct(new Product("Говядина", 600.0));
        market.addProduct(new Product("Молоко", 70.0));
        market.addProduct(new Product("Картофель", 40.0));
        market.addProduct(new Product("Свинина", 350.0));
        market.addProduct(new Product("Молоко", 70.0));
        market.addProduct(new Product("Говядина", 600.0));
        market.addProduct(new Product("Свинина", 350.0));
        market.addProduct(new Product("Картофель", 40.0));

        market.addToQueue(client1);
        market.addToQueue(client2);
        market.addToQueue(client3);

        System.out.print(market);

        market.update();
        System.out.print(market);
//
//        market.update();
//        System.out.println(market);




    }
}