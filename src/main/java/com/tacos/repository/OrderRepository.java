package com.tacos.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tacos.model.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
	TacoOrder save(TacoOrder order);
	
	List<TacoOrder> findByDeliveryZip(String deliveryZip);
}