package org.newshop.cartservice.repositories;

import org.newshop.cartservice.entity.CartItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartsItemsRepository extends JpaRepository<CartItems, Long> {
}
