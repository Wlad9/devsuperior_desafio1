package com.dev.desafio1;

import com.dev.desafio1.entities.Order;
import com.dev.desafio1.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		Order order1 = new Order(1034, 150.0d, 20.0);
		Order order2 = new Order(2282, 800.0d, 10.0);
		Order order3 = new Order(1309, 95.90d, 0.0);
		Double valorFinal1  = orderService.total(order1);
		//System.out.println("ValorFinal:"+valorFinal1);
		saidaValorFinal(order1, valorFinal1);

		Double valorFinal2  = orderService.total(order2);
		//System.out.println("ValorFinal:"+valorFinal2);
		saidaValorFinal(order2, valorFinal2);

		Double valorFinal3  = orderService.total(order3);
		//System.out.println("ValorFinal:"+valorFinal3);
		saidaValorFinal(order3, valorFinal3);
	}

	private void saidaValorFinal(Order order1, Double valorFinal) {
		int code = order1.getCode();
		System.out.println("Pedido código "+code);
		System.out.printf("Valor total: R$ %.2f%n",valorFinal);
		System.out.println("\n");
	}
}
