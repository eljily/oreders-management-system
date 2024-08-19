package com.sidibrahim.oms.repository;

import com.sidibrahim.oms.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
