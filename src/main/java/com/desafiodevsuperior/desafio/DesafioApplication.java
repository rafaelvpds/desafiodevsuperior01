package com.desafiodevsuperior.desafio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafiodevsuperior.desafio.entities.Order;
import com.desafiodevsuperior.desafio.service.OrderService;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(1034, 150.00, 20.0);

		System.out.println("Codigo do produto " + order.getCode());
		System.out.println();
		System.out.println("Valor Produto " + order.getBasic());
		System.out.println();
		System.out.println("Desconto " + order.getDiscount() + "%");
		System.out.println();
		System.out.println("Valor Total " + orderService.total(order));

	}

}
