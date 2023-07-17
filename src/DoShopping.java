import java.util.ArrayList;
import java.util.List;

public interface DoShopping {

    List<Product> purchases = new ArrayList<>();

    void Buy(Product product);

    boolean canBuy(Product product);

    default List<Product> showPurchases() {
        return purchases;
    }

}
