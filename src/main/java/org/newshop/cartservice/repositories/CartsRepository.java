package org.newshop.cartservice.repositories;

import org.newshop.cartservice.entity.Carts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartsRepository extends JpaRepository <Carts, Long> {

}
