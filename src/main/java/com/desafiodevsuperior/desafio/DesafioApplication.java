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
		System.out.println();
		Order order2 = new Order(2282, 800.00, 10.0);

		System.out.println("Codigo do produto " + order2.getCode());
		System.out.println();
		System.out.println("Valor Produto " + order2.getBasic());
		System.out.println();
		System.out.println("Desconto " + order2.getDiscount() + "%");
		System.out.println();
		System.out.println("Valor Total " + orderService.total(order2));

		System.out.println();
		Order order3 = new Order(1309, 95.90, 0.0);

		System.out.println("Codigo do produto " + order3.getCode());
		System.out.println();
		System.out.println("Valor Produto " + order3.getBasic());
		System.out.println();
		System.out.println("Desconto " + order3.getDiscount() + "%");
		System.out.println();
		System.out.println("Valor Total " + orderService.total(order3));

	}

}
