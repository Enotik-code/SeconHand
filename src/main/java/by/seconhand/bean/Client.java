package by.seconhand.bean;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@Builder
@ToString
@Table(name = "goods")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "client_id")
    private Long id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String address;

    private String notes;

    @OneToOne(mappedBy = "user")
    private ShoppingCarts shoppingCarts;

}
