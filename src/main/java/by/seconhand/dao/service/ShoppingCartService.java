package by.seconhand.dao.service;

import by.seconhand.bean.Client;
import by.seconhand.bean.ShoppingCarts;
import by.seconhand.dao.repos.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartService {

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    public ShoppingCarts saveShoppingCart(ShoppingCarts shoppingCarts) {
        shoppingCarts = shoppingCartRepository.save(shoppingCarts);
        return shoppingCarts;
    }

    public ShoppingCarts findShoppingCartByClient(Client client) {
        return shoppingCartRepository.findShoppingCartByClient(client);
    }

    public boolean findShoppingCartByIdUserBool(Client client) {
        return shoppingCartRepository.findShoppingCartByClient(client) == null;
    }

    public ShoppingCarts findShoppingCartByUserAndIsActiveTrue(Client client) {
        return shoppingCartRepository.findShoppingCartByClientAndIsActiveTrue(client);
    }
}
