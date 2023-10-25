package com.progammingtechie.orderervice.repository;

import com.progammingtechie.orderervice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
