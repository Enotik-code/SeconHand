package by.seconhand.dao.repos;

import by.seconhand.bean.Client;
import by.seconhand.bean.ShoppingCarts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCarts, Long> {
    ShoppingCarts findShoppingCartById(Long id);

    ShoppingCarts findShoppingCartByClientAndIsActiveTrue(Client client);
    ShoppingCarts findShoppingCartByClient(Client client);

}
