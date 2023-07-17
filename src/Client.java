import java.util.List;

public class Client implements DoShopping {

    private String name;

    private Double money;



    @Override
    public void Buy(Product product) {
        if (canBuy(product)) {
            money -= product.getPrice();
            purchases.add(product);
        }
    }

    @Override
    public boolean canBuy(Product product) {
        return money >= product.getPrice();
    }
}
