package com.tacos.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tacos.model.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
	TacoOrder save(TacoOrder order);
	
//	List<TacoOrder> findByDeliveryZip(String deliveryZip);
	
	List<TacoOrder> readOrdersByDeliveryZipAndPlacedAtBetween(
			String deliveryZip, Date startDate, Date endDate);
}