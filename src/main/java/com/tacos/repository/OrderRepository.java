package com.tacos.repository;

import com.tacos.model.TacoOrder;

public interface OrderRepository {
	TacoOrder save(TacoOrder order);
}