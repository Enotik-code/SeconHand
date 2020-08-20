package by.seconhand.bean;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@ToString
@Table(name = "goods")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Goods implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    @Column(name = "good_name")
    private String name;

    @Column(name = "price")
    private Long price;

}
