package com.sprintinaction.tacocloud.data;

import com.sprintinaction.tacocloud.models.Order;

public interface OrderRepository {
    Order save(Order order);
}
