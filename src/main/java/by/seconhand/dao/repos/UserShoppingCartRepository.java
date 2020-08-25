package by.seconhand.dao.repos;

import by.seconhand.bean.UserShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface UserShoppingCartRepository extends JpaRepository<UserShoppingCart, Long> {

    @Query (value = "SELECT usc FROM UserShoppingCart usc " +
            "WHERE usc.pk.goods.id=?1 and usc.pk.shoppingCarts.id=?2")
    UserShoppingCart getByGoodsId(Long idGoods, Long idCart);

    @Query("SELECT usc FROM UserShoppingCart usc")
    List<UserShoppingCart> findAll();

    @Query(value = "SELECT usc FROM UserShoppingCart usc WHERE usc.pk.shoppingCarts.id=?1")
    List<UserShoppingCart> findAllByIdShoppingCart(Long id);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM UserShoppingCart usc WHERE usc.pk.shoppingCarts.id=?1 and usc.pk.goods.id=?2")
    UserShoppingCart deleteGoodsFromCart(Long idCart, Long idGoods);

}
