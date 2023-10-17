package com.tacos.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.tacos.model.TacoOrder;

@Controller
@RequestMapping("/orders")
@SessionAttributes("tacoOrder")
public class OrderController {
	
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(OrderController.class);
	
	@GetMapping("/current")
	public String orderForm() {
		return "orderForm";
	}

	@PostMapping
	public String processOrder(TacoOrder order, SessionStatus sessionStatus) {
		log.info("Order submitted: {}", order);
		sessionStatus.setComplete();
		return "redirect:/";
	}
}