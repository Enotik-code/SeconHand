package by.seconhand.dao.service;

import by.seconhand.bean.UserShoppingCart;
import by.seconhand.dao.repos.UserShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserShoppingCartService {

    @Autowired
    private UserShoppingCartRepository cartRepository;

    public UserShoppingCart save(UserShoppingCart userShoppingCart) {
        userShoppingCart = this.cartRepository.save(userShoppingCart);
        return userShoppingCart;

    }

    public UserShoppingCart update(UserShoppingCart userShoppingCart) {
        userShoppingCart = this.cartRepository.save(userShoppingCart);
        return userShoppingCart;

    }

    public UserShoppingCart getById(Long id) {
        Optional<UserShoppingCart> userShoppingCart = cartRepository.findById(id);
        return userShoppingCart.orElse(null);
    }

    public UserShoppingCart getByGoodsId(Long idGoods, Long idCart) {
        return cartRepository.getByGoodsId(idGoods, idCart);
    }

    public void remove(Long id) {
        cartRepository.deleteById(id);
    }

    public UserShoppingCart remove(Long idCart, Long idGoods) {
        return cartRepository.deleteGoodsFromCart(idCart, idGoods);
    }


    public List<UserShoppingCart> findAll() {
        return cartRepository.findAll();
    }

    public List<UserShoppingCart> findAllByIdShoppingCart(Long id) {
        return cartRepository.findAllByIdShoppingCart(id);
    }

    public int getQuantityGoodsInUserShoppingCart(Long idGoods, Long idCart) {
        return getByGoodsId(idGoods, idCart).getQuantityGoods();
    }
}
