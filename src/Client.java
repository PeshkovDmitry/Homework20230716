import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client implements DoShopping, UseWishList {

    private String name;

    private Double money;

    private List<Product> purchases = new ArrayList<>();

    private List<Product> wishList = new ArrayList<>();

    public Client(String name, Double money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public void Buy(Product product) {
        if (canBuy(product)) {
            money -= product.getPrice();
            purchases.add(product);
            wishList.remove(product);
        }
    }

    @Override
    public boolean canBuy(Product product) {
        return money >= product.getPrice();
    }

    @Override
    public void addToWishList(Product product) {
        wishList.add(product);
    }

    @Override
    public void removeFromWishList(Product product) {
        wishList.remove(product);
    }

    public List<Product> getWishList() {
        return wishList;
    }

    public List<Product> getPurchases() {
        return purchases;
    }


    @Override
    public String toString() {
        String purchasesString = MyPrintMethods.showAsFormattedList(
                "Купленные продукты:", purchases.toArray());
        String wishListString = MyPrintMethods.showAsFormattedList(
                "Продукты, которые нужно купить:", wishList.toArray());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("%s (%.0f) \n",name,money))
                .append(wishListString)
                .append(purchasesString);
        return stringBuilder.toString();
    }

}
