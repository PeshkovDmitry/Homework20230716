import java.util.ArrayList;
import java.util.List;

public interface UseWishList {

    List<Product> wishList = new ArrayList<>();

    void addToWishList(Product product);

    void removeFromWishList(Product product);

    default List<Product> showWishList() {
        return wishList;
    }

}
