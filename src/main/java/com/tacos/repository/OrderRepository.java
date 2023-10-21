package com.tacos.repository;

import org.springframework.data.repository.CrudRepository;

import com.tacos.model.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
	TacoOrder save(TacoOrder order);
}