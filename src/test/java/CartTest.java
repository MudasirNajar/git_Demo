import org.example.Cart;
import org.example.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest {

    @Test
    public void totalShouldBe_50_If_1_PenIsAdded(){
        Cart cart = new Cart();
        Product pen = new Product(50);

        cart.add(pen);

        assertEquals(50,cart.total());
    }
}
