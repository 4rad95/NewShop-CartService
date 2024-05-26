package org.newshop.cartservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CartItems")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItems {
    @Id
    @Column(name = "CartItemId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cartItemId;

    @Column(name = "ProductId")
    private long productId;

    @Column(name = "Quantity")
    private long quantity;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CartId", nullable = false)
    private Carts carts;


}
