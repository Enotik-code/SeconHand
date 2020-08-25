package by.seconhand.bean;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class UserShoppingCartId implements Serializable {

    @ManyToOne
    private Goods goods;

    @ManyToOne
    private ShoppingCarts shoppingCarts;


}
